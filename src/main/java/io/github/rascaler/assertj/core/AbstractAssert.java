/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2021 the original author or authors.
 */
package io.github.rascaler.assertj.core;

import io.github.rascaler.assertj.core.exception.ExceptionConvertor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Base class for all assertions.
 *
 * @param <SELF> the "self" type of this assertion class.
 * @param <ACTUAL> the type of the "actual" value.
 *
 * @author wurenqng
 */
public abstract class AbstractAssert<SELF extends AbstractAssert<SELF, ACTUAL>, ACTUAL> implements Assert<SELF, ACTUAL> {

  protected final ACTUAL actual;
  protected final SELF myself;
  protected boolean passed = false;
  protected   Logger log;
  protected boolean validated = false;

  // 异常转换器
  private static Map<Class<?>, ExceptionConvertor> mapping = new HashMap<>();


  @SuppressWarnings("unchecked")
  protected AbstractAssert(ACTUAL actual, Class<?> selfType) {
    myself = (SELF) selfType.cast(this);
    this.log = LoggerFactory.getLogger(selfType);
    this.actual = actual;
  }

  public  static void addExceptionConvertor(ExceptionConvertor convertor) {
    Class clz = (Class)((ParameterizedType)convertor.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
    // 每种数据类型只能有一种转换器
    if (null != mapping.get(clz)) {
      throw new RuntimeException(String.format("convertor of class[%s] has already existed", clz));
    }
    mapping.put(clz, convertor);
  }


  @Override
  public SELF isEqualTo(Object expected) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = expected.equals(this.actual);
    return myself;
  }

  @Override
  public SELF isNotEqualTo(Object other) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = !other.equals(this.actual);
    return myself;
  }

  @Override
  public SELF isNull() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = Objects.isNull(this.actual);
    return myself;
  }

  @Override
  public SELF isNotNull() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = !Objects.isNull(this.actual);
    return myself;
  }

  @Override
  public SELF isIn(Object... values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    for (Object value : values) {
      if (this.actual.equals(value)) {
        this.passed = true;
        return myself;
      }
    }
    this.passed = false;
    return myself;
  }

  @Override
  public SELF isNotIn(Object... values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    for (Object value : values) {
      if (this.actual.equals(value)) {
        this.passed = false;
        return myself;
      }
    }
    this.passed = true;
    return myself;
  }

  @Override
  public SELF isIn(Iterable<?> values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    for (Object value : values) {
      if (this.actual.equals(value)) {
        this.passed = true;
        return myself;
      }
    }
    this.passed = false;
    return myself;
  }

  @Override
  public SELF isNotIn(Iterable<?> values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    for (Object value : values) {
      if (this.actual.equals(value)) {
        this.passed = false;
        return myself;
      }
    }
    this.passed = true;
    return myself;
  }


  @Override
  public SELF thenThrow(RuntimeException exception) {
    if (!validated) {
      throw new RuntimeException("未对数据进行任何断言");
    }
    if (this.passed) {
      throw exception;
    }
    return myself;
  }

  @Override
  public SELF thenThrow(RuntimeException exception, String msg) {
    if (this.passed) {
      log.error(msg);
    }
    return thenThrow(exception);
  }

  @Override
  public SELF thenThrow(RuntimeException exception, String format, Object... arguments) {
    if (this.passed) {
      log.error(format, arguments);
    }
    return thenThrow(exception);
  }

  @Override
  public SELF thenThrow(Error error) {
    if (!validated) {
      throw new RuntimeException("未对数据进行任何断言");
    }
    if (this.passed) {
      throw error;
    }
    return myself;
  }

  @Override
  public SELF thenThrow(Error error, String msg) {
    if (this.passed) {
      log.error(msg);
    }
    return thenThrow(error);
  }

  @Override
  public SELF thenThrow(Error error, String format, Object... arguments) {
    if (this.passed) {
      log.error(format, arguments);
    }
    return thenThrow(error);
  }

  @Override
  public <T> SELF thenThrow(T obj) {
    ExceptionConvertor convertor = mapping.get(obj.getClass());
    if (null == convertor) {
      throw new RuntimeException(String.format("cannot find exception convertor by [%s] class", obj.getClass()));
    }
    if (this.passed) {
      throw convertor.getException(obj);
    }
    return myself;
  }

  @Override
  public <T> SELF thenThrow(T obj, String format, Object... arguments) {
    if (this.passed) {
      log.error(format, arguments);
    }
    return thenThrow(obj);
  }


  @Override
  public <T> SELF thenThrow(T obj, String msg) {
    if (this.passed) {
      log.error(msg);
    }
    return thenThrow(obj);
  }

  public boolean getResult() {
    return this.passed;
  }
}
