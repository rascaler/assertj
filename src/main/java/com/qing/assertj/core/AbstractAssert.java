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
package com.qing.assertj.core;

import com.qing.assertj.core.exception.ExceptionConvertor;
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
  protected boolean passed = true;
  protected   Logger log;

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
    if (!this.passed) {
      return myself;
    }
    this.passed = expected.equals(this.actual);
    return myself;
  }

  @Override
  public SELF isNotEqualTo(Object other) {
    if (!this.passed) {
      return myself;
    }
    this.passed = !other.equals(this.actual);
    return myself;
  }

  @Override
  public SELF isNull() {
    if (!this.passed) {
      return myself;
    }
    this.passed = Objects.isNull(this.actual);
    return myself;
  }

  @Override
  public SELF isNotNull() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !Objects.isNull(this.actual);
    return myself;
  }

  @Override
  public SELF isIn(Object... values) {
    if (!this.passed) {
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
    if (!this.passed) {
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
    if (!this.passed) {
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
    if (!this.passed) {
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
  public SELF thenFailThrow(RuntimeException exception) {
    if (!this.passed) {
      throw exception;
    }
    return myself;
  }

  @Override
  public SELF thenFailThrow(Error error) {
    if (!this.passed) {
      throw error;
    }
    return myself;
  }

  @Override
  public <T> SELF thenFailThrow(T obj) {
    ExceptionConvertor convertor = mapping.get(obj.getClass());
    if (null == convertor) {
      throw new RuntimeException(String.format("cannot find exception convertor by [%s] class", obj.getClass()));
    }
    if (!this.passed) {
      throw convertor.getException(obj);
    }
    return myself;
  }

  @Override
  public <T> SELF thenFailWithLogThrow(T obj, String format, Object... arguments) {
    if (!this.passed) {
      log.error(format, arguments);
    }
    return thenFailThrow(obj);
  }


  @Override
  public <T> SELF thenFailWithLogThrow(T obj, String msg) {
    if (!this.passed) {
      log.error(msg);
    }
    return thenFailThrow(obj);
  }

  public boolean getResult() {
    return this.passed;
  }
}
