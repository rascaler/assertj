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

/*
 * SizeComparableAssert
 * @author wurenqing
 * @Date 2021-10-12
 * @version 1.0
 */
public interface SizeComparableAssert<SELF extends SizeComparableAssert<SELF, ACTUAL>,  ACTUAL>{

  /*
   * description: 集合或者数组中的数量 = 1
   * pass
   * assertThat(new int[] {1}).hasOneSize()
   *
   * fail
   * assertThat(new int[] {}).hasOneSize()
   * assertThat(new int[] {1,2}).hasOneSize()
   *
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:01
   */
  SELF hasOneSize();

  /*
   * description: 集合或者数组中的元素数量 >= 1
   * pass
   * assertThat(new int[] {1,2}).hasMoreThanOneSize()
   *
   * fail
   * assertThat(new int[] {}).hasMoreThanOneSize()
   * assertThat(new int[] {1}).hasMoreThanOneSize()
   *
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:02
   */
  SELF hasMoreThanOneSize();

  /*
   * description: 集合或者数组中的元素数量 = boundary
   * pass
   * assertThat(new int[] {1}).isSizeEqualTo(1)
   *
   * fail
   * assertThat(new int[] {}).isSizeEqualTo(1)
   * assertThat(new int[] {1,2}).isSizeEqualTo(1)
   *
   * @param boundary 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:02
   */
  SELF isSizeEqualTo(int boundary);

  /*
   * description: 集合或者数组中的元素数量 < boundary
   * pass
   * assertThat(new int[] {}).isSizeLessThan(2)
   * assertThat(new int[] {1}).isSizeLessThan(2)
   *
   * fail
   * assertThat(new int[] {1,2}).isSizeLessThan(2)
   * assertThat(new int[] {1,2,3}).isSizeLessThan(2)
   *
   * @param boundary 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:02
   */
  SELF isSizeLessThan(int boundary);

  /*
   * description: 集合或者数组中的元素数量 <= boundary
   * pass
   * assertThat(new int[] {}).isSizeLessThanOrEqualTo(2)
   * assertThat(new int[] {1}).isSizeLessThanOrEqualTo(2)
   * assertThat(new int[] {1, 2}).isSizeLessThanOrEqualTo(2)
   *
   * fail
   * assertThat(new int[] {1,2,3}).isSizeLessThanOrEqualTo(2)
   *
   * @param 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:02
   */
  SELF isSizeLessThanOrEqualTo(int boundary);

  /*
   * description: 集合或者数组中的元素数量 > boundary
   * pass
   * assertThat(new int[] {1,2}).isSizeGreaterThan(1)
   *
   * fail
   * assertThat(new int[] {}).isSizeGreaterThan(1)
   * assertThat(new int[] {1}).isSizeGreaterThan(1)
   *
   * @param 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:02
   */
  SELF isSizeGreaterThan(int boundary);

  /*
   * description: 集合或者数组中的元素数量 >= boundary
   * pass
   * assertThat(new int[] {1}).isSizeGreaterThanOrEqualTo(1)
   * assertThat(new int[] {1,2}).isSizeGreaterThanOrEqualTo(1)
   *
   * fail
   * assertThat(new int[] {}).isSizeGreaterThanOrEqualTo(1)
   *
   * @param boundary 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:02
   */
  SELF isSizeGreaterThanOrEqualTo(int boundary);

  /*
   * description: startInclusiveBoundary <= 集合或者数组中的元素数量 <= endInclusiveBoundary
   * pass
   * assertThat(new int[] {1,2}).isSizeBetween(2,3)
   * assertThat(new int[] {1,2,3}).isSizeBetween(2,3)
   *
   * fail
   * assertThat(new int[] {}).isSizeBetween(2, 3)
   * assertThat(new int[] {1}).isSizeBetween(2, 3)
   *
   * @param startInclusiveBoundary 左边界值，包含
   * @param endInclusiveBoundary 右边界值，包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:02
   */
  SELF isSizeBetween(int startInclusiveBoundary, int endInclusiveBoundary);

  /*
   * description: startExclusiveBoundary < 集合或者数组中的元素数量 < endExclusiveBoundary
   * pass
   * assertThat(new int[] {1,2,3}).isSizeStrictlyBetween(2,4)
   *
   * fail
   * assertThat(new int[] {1}).isSizeStrictlyBetween(2, 4)
   * assertThat(new int[] {1,2}).isSizeStrictlyBetween(2, 4)
   * assertThat(new int[] {1,2,3,4}).isSizeStrictlyBetween(2, 4)
   * assertThat(new int[] {1,2,3,4,5}).isSizeStrictlyBetween(2, 4)
   *
   * @param 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:02
   */
  SELF isSizeStrictlyBetween(int startExclusiveBoundary, int endExclusiveBoundary);

  /*
   * description: startInclusiveBoundary <= 集合或者数组中的元素数量 < endExclusiveBoundary
   * pass
   * assertThat(new int[] {1,2}).isSizeStartInclusiveBetween(2,4)
   * assertThat(new int[] {1,2,3}).isSizeStartInclusiveBetween(2,4)
   *
   * fail
   * assertThat(new int[] {1}).isSizeStartInclusiveBetween(2, 4)
   * assertThat(new int[] {1,2,3,4}).isSizeStartInclusiveBetween(2, 4)
   * assertThat(new int[] {1,2,3,4,5}).isSizeStartInclusiveBetween(2, 4)
   *
   * @param startInclusiveBoundary 左边界值，包含
   * @param endExclusiveBoundary 右边界值，不包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:02
   */
  SELF isSizeStartInclusiveBetween(int startInclusiveBoundary, int endExclusiveBoundary);

  /*
   * description: startExclusiveBoundary < 集合或者数组中的元素数量 <= endInclusiveBoundary
   * pass
   * assertThat(new int[] {1,2,3}).isSizeEndInclusiveBetween(2,4)
   * assertThat(new int[] {1,2,3,4}).isSizeEndInclusiveBetween(2, 4)
   *
   * fail
   * assertThat(new int[] {1}).isSizeEndInclusiveBetween(2, 4)
   * assertThat(new int[] {1,2}).isSizeEndInclusiveBetween(2, 4)
   * assertThat(new int[] {1,2,3,4,5}).isSizeEndInclusiveBetween(2, 4)
   *
   * @param startExclusiveBoundary 左边界值，不包含
   * @param endInclusiveBoundary 右边界值，包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:02
   */
  SELF isSizeEndInclusiveBetween(int startExclusiveBoundary, int endInclusiveBoundary);

}
