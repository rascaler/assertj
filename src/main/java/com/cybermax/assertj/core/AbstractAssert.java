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
package com.cybermax.assertj.core;

import java.util.Objects;

/**
 * Base class for all assertions.
 *
 * @param <SELF> the "self" type of this assertion class. Please read &quot;<a href="http://bit.ly/1IZIRcY"
 *          target="_blank">Emulating 'self types' using Java Generics to simplify fluent API implementation</a>&quot;
 *          for more details.
 * @param <ACTUAL> the type of the "actual" value.
 *
 * @author Alex Ruiz
 * @author Joel Costigliola
 * @author Mikhail Mazursky
 * @author Nicolas François
 */
public abstract class AbstractAssert<SELF extends AbstractAssert<SELF, ACTUAL>, ACTUAL> implements Assert<SELF, ACTUAL> {

  protected final ACTUAL actual;
  protected final SELF myself;
  protected boolean passed;

  @SuppressWarnings("unchecked")
  protected AbstractAssert(ACTUAL actual, Class<?> selfType) {
    myself = (SELF) selfType.cast(this);
    this.actual = actual;
  }

  @Override
  public SELF isEqualTo(Object expected) {
    if (expected.equals(this.actual))
      this.passed = true;
    else
      this.passed = false;
    return myself;
  }

  @Override
  public SELF isNotEqualTo(Object other) {
    if (!other.equals(this.actual))
      this.passed = true;
    else
      this.passed = false;
    return myself;
  }

  @Override
  public SELF isNull() {
    if (Objects.isNull(this.actual))
      this.passed = true;
    else
      this.passed = false;
    return myself;
  }

  @Override
  public SELF isNotNull() {
    if (!Objects.isNull(this.actual))
      this.passed = true;
    else
      this.passed = false;
    return myself;
  }

  @Override
  public SELF isIn(Object... values) {
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
    this.passed = true;
    for (Object value : values) {
      if (this.actual.equals(value)) {
        this.passed = false;
        break;
      }
    }
    return myself;
  }

  @Override
  public SELF isIn(Iterable<?> values) {
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
    this.passed = true;
    for (Object value : values) {
      if (this.actual.equals(value)) {
        this.passed = false;
        break;
      }
    }
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
}
