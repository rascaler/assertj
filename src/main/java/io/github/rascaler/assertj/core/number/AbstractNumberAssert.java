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
package io.github.rascaler.assertj.core.number;


import io.github.rascaler.assertj.core.AbstractComparableAssert;


public abstract class AbstractNumberAssert<SELF extends AbstractNumberAssert<SELF, ACTUAL>,  ACTUAL extends Number & Comparable<? super ACTUAL>>
        extends AbstractComparableAssert<SELF, ACTUAL> implements NumberAssert<SELF, ACTUAL> {


  protected AbstractNumberAssert(ACTUAL actual, Class<?> selfType) {
    super(actual, selfType);
  }

  protected abstract ACTUAL getZero();

  protected abstract ACTUAL getOne();

  @Override
  public SELF isEqualTo(ACTUAL expected) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = actual.equals(expected);
    return myself;
  }

  @Override
  public SELF isZero() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = actual.equals(getZero());
    return myself;
  }
  @Override
  public SELF isNotZero() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = !actual.equals(getZero());
    return myself;
  }

  @Override
  public SELF isOne() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = actual.equals(getOne());
    return myself;
  }

  @Override
  public SELF isNotOne() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = !actual.equals(getOne());
    return myself;
  }

  @Override
  public SELF isPositive() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = actual.compareTo(getZero()) > 0;
    return myself;
  }

  @Override
  public SELF isNegative() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = actual.compareTo(getZero()) < 0;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = actual.compareTo(getZero()) >= 0;
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = actual.compareTo(getZero()) <= 0;
    return myself;
  }

}
