package io.github.rascaler.assertj.core;

/**
 *
 * ComparableAssert
 * @author wurenqing
 * @Date 2021-10-12
 * @version 1.0
 */
public interface ComparableAssert<SELF extends ComparableAssert<SELF, ACTUAL>,  ACTUAL extends Comparable<? super ACTUAL>> {

  /*
   * description: actual == other
   * pass
   * assertThat(1).isEqualTo(1)
   *
   * fail
   * assertThat(1).isLessThan(2)
   *
   * @param expected 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */

  SELF isEqualTo(ACTUAL expected);


  /*
   * description: actual < boundary
   * pass
   * assertThat(1).isLessThan(2)
   *
   * fail
   * assertThat(2).isLessThan(2)
   * assertThat(3).isLessThan(2)
   *
   * @param boundary 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */
  SELF isLessThan(ACTUAL boundary);

  /*
   * description: actual <= boundary
   * pass
   * assertThat(1).isLessThanOrEqualTo(2)
   * assertThat(2).isLessThanOrEqualTo(2)
   *
   * fail
   * assertThat(3).isLessThanOrEqualTo(2)
   *
   * @param boundary 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */
  SELF isLessThanOrEqualTo(ACTUAL boundary);

  /*
   * description: actual > boundary
   * pass
   * assertThat(3).isGreaterThan(2)
   *
   * fail
   * assertThat(2).isGreaterThan(2)
   * assertThat(3).isGreaterThan(2)
   *
   * @param boundary 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */
  SELF isGreaterThan(ACTUAL boundary);

  /*
   * description: actual >= boundary
   * pass
   * assertThat(3).isGreaterThanOrEqualTo(2)
   *
   * fail
   * assertThat(2).isGreaterThanOrEqualTo(2)
   * assertThat(3).isGreaterThanOrEqualTo(2)
   *
   * @param boundary 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */
  SELF isGreaterThanOrEqualTo(ACTUAL boundary);

  /*
   * description: startInclusiveBoundary <= actual <= endInclusiveBoundary
   * pass
   * assertThat(2).isBetween(2,4)
   * assertThat(3).isBetween(2,4)
   * assertThat(4).isBetween(2,4)
   *
   * fail
   * assertThat(1).isBetween(2,4)
   * assertThat(5).isBetween(2,4)
   *
   * @param startInclusiveBoundary 左边界，包含
   * @param endInclusiveBoundary 右边界，包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */
  SELF isBetween(ACTUAL startInclusiveBoundary, ACTUAL endInclusiveBoundary);

  /*
   * description: startExclusiveBoundary < actual <= endExclusiveBoundary
   * pass
   * assertThat(3).isStrictlyBetween(2,4)
   * assertThat(4).isStrictlyBetween(2,4)
   *
   * fail
   * assertThat(1).isStrictlyBetween(2,4)
   * assertThat(2).isStrictlyBetween(2,4)
   * assertThat(5).isStrictlyBetween(2,4)
   *
   * @param startExclusiveBoundary 左边界，不包含
   * @param endExclusiveBoundary 右边界，包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:36
   */
  SELF isStrictlyBetween(ACTUAL startExclusiveBoundary, ACTUAL endExclusiveBoundary);

  /*
   * description: startInclusiveBoundary <= actual < endExclusiveBoundary
   * pass
   * assertThat(2).isStartInclusiveBetween(2,4)
   * assertThat(3).isStartInclusiveBetween(2,4)
   *
   * fail
   * assertThat(1).isStartInclusiveBetween(2,4)
   * assertThat(4).isStartInclusiveBetween(2,4)
   * assertThat(5).isStartInclusiveBetween(2,4)
   *
   * @param startInclusiveBoundary 左边界，包含
   * @param endExclusiveBoundary 右边界，不包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:36
   */
  SELF isStartInclusiveBetween(ACTUAL startInclusiveBoundary, ACTUAL endExclusiveBoundary);

  /*
   * description: startExclusiveBoundary < actual <= endInclusiveBoundary
   * pass
   * assertThat(3).isStartInclusiveBetween(2,4)
   * assertThat(4).isStartInclusiveBetween(2,4)
   *
   * fail
   * assertThat(1).isStartInclusiveBetween(2,4)
   * assertThat(2).isStartInclusiveBetween(2,4)
   * assertThat(5).isStartInclusiveBetween(2,4)
   *
   * @param startExclusiveBoundary 左边界，不包含
   * @param endInclusiveBoundary 右边界，包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:36
   */
  SELF isEndInclusiveBetween(ACTUAL startExclusiveBoundary, ACTUAL endInclusiveBoundary);
}
