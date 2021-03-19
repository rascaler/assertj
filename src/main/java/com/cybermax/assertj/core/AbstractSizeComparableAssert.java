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

public abstract class AbstractSizeComparableAssert<SELF extends AbstractSizeComparableAssert<SELF, ACTUAL>,  ACTUAL>
        extends AbstractAssert<SELF, ACTUAL>
        implements SizeComparableAssert<SELF, ACTUAL>{

  protected AbstractSizeComparableAssert(ACTUAL actual, Class<?> selfType) {
    super(actual, selfType);
  }

  protected abstract int size(ACTUAL value);

  @Override
  public SELF hasOneSize() {
    this.passed = size(this.actual) == 1;
    return myself;
  }

  @Override
  public SELF hasMoreThanOneSize() {
    this.passed = size(this.actual) > 1;
    return myself;
  }

  @Override
  public SELF isSizeEqualTo(int boundary) {
    this.passed = size(this.actual) == boundary;
    return myself;
  }

  @Override
  public SELF isSizeLessThan(int boundary) {
    this.passed = size(this.actual) < boundary;
    return myself;
  }

  @Override
  public SELF isSizeLessThanOrEqualTo(int boundary) {
    this.passed = size(this.actual) <= boundary;
    return myself;
  }

  @Override
  public SELF isSizeGreaterThan(int boundary) {
    this.passed = size(this.actual) > boundary;
    return myself;
  }

  @Override
  public SELF isSizeGreaterThanOrEqualTo(int boundary) {
    this.passed = size(this.actual) >= boundary;
    return myself;
  }

  @Override
  public SELF isSizeBetween(int startInclusiveBoundary, int endInclusiveBoundary) {
    this.passed = size(this.actual) >= startInclusiveBoundary
            && size(this.actual) <= endInclusiveBoundary;
    return myself;
  }

  @Override
  public SELF isSizeStrictlyBetween(int startExclusiveBoundary, int endExclusiveBoundary) {
    this.passed = size(this.actual) > startExclusiveBoundary
            && size(this.actual) < endExclusiveBoundary;
    return myself;
  }

  @Override
  public SELF isSizeStartInclusiveBetween(int startInclusiveBoundary, int endExclusiveBoundary) {
    this.passed = size(this.actual) >= startInclusiveBoundary
            && size(this.actual) < endExclusiveBoundary;
    return myself;
  }

  @Override
  public SELF isSizeEndInclusiveBetween(int startExclusiveBoundary, int endInclusiveBoundary) {
    this.passed = size(this.actual) > startExclusiveBoundary
            && size(this.actual) <= endInclusiveBoundary;
    return myself;
  }
}
