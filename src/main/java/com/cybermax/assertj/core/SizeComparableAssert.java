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

public interface SizeComparableAssert<SELF extends SizeComparableAssert<SELF, ACTUAL>,  ACTUAL>{

  SELF hasOneSize();

  SELF hasMoreThanOneSize();

  SELF isSizeEqualTo(int boundary);

  SELF isSizeLessThan(int boundary);

  SELF isSizeLessThanOrEqualTo(int boundary);

  SELF isSizeGreaterThan(int boundary);

  SELF isSizeGreaterThanOrEqualTo(int boundary);

  SELF isSizeBetween(int startInclusiveBoundary, int endInclusiveBoundary);

  SELF isSizeStrictlyBetween(int startExclusiveBoundary, int endExclusiveBoundary);

  SELF isSizeStartInclusiveBetween(int startInclusiveBoundary, int endExclusiveBoundary);

  SELF isSizeEndInclusiveBetween(int startExclusiveBoundary, int endInclusiveBoundary);

}
