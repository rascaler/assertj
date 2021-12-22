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

public abstract class AbstractSizeComparableAssert<SELF extends AbstractSizeComparableAssert<SELF, ACTUAL>,  ACTUAL>
        extends AbstractAssert<SELF, ACTUAL>
        implements SizeComparableAssert<SELF, ACTUAL>{

  protected AbstractSizeComparableAssert(ACTUAL actual, Class<?> selfType) {
    super(actual, selfType);
  }

  protected abstract int size();

  @Override
  public SELF hasOneSize() {
    if (this.passed) {
      return myself;
    }
    this.passed = size() == 1;
    return myself;
  }

  @Override
  public SELF hasMoreThanOneSize() {
    if (this.passed) {
      return myself;
    }
    this.passed = size() > 1;
    return myself;
  }

  @Override
  public SELF isSizeEqualTo(int boundary) {
    if (this.passed) {
      return myself;
    }
    this.passed = size() == boundary;
    return myself;
  }

  @Override
  public SELF isSizeLessThan(int boundary) {
    if (this.passed) {
      return myself;
    }
    this.passed = size() < boundary;
    return myself;
  }

  @Override
  public SELF isSizeLessThanOrEqualTo(int boundary) {
    if (this.passed) {
      return myself;
    }
    this.passed = size() <= boundary;
    return myself;
  }

  @Override
  public SELF isSizeGreaterThan(int boundary) {
    if (this.passed) {
      return myself;
    }
    this.passed = size() > boundary;
    return myself;
  }

  @Override
  public SELF isSizeGreaterThanOrEqualTo(int boundary) {
    if (this.passed) {
      return myself;
    }
    this.passed = size() >= boundary;
    return myself;
  }

  @Override
  public SELF isSizeBetween(int startInclusiveBoundary, int endInclusiveBoundary) {
    if (this.passed) {
      return myself;
    }
    this.passed = size() >= startInclusiveBoundary
            && size() <= endInclusiveBoundary;
    return myself;
  }

  @Override
  public SELF isSizeStrictlyBetween(int startExclusiveBoundary, int endExclusiveBoundary) {
    if (this.passed) {
      return myself;
    }
    this.passed = size() > startExclusiveBoundary
            && size() < endExclusiveBoundary;
    return myself;
  }

  @Override
  public SELF isSizeStartInclusiveBetween(int startInclusiveBoundary, int endExclusiveBoundary) {
    if (this.passed) {
      return myself;
    }
    this.passed = size() >= startInclusiveBoundary
            && size() < endExclusiveBoundary;
    return myself;
  }

  @Override
  public SELF isSizeEndInclusiveBetween(int startExclusiveBoundary, int endInclusiveBoundary) {
    if (this.passed) {
      return myself;
    }
    this.passed = size() > startExclusiveBoundary
            && size() <= endInclusiveBoundary;
    return myself;
  }
}
