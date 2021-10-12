package com.qing.assertj.core;

/**
 *
 * ComparableAssert
 * @author wurenqing
 * @Date 2021-10-12
 * @version 1.0
 */
public interface ComparableAssert<SELF extends ComparableAssert<SELF, ACTUAL>,  ACTUAL extends Comparable<? super ACTUAL>> {

  /*
   * description: actual < other
   * pass
   * assertThat(1).isLessThan(2)
   *
   * fail
   * assertThat(2).isLessThan(2)
   * assertThat(3).isLessThan(2)
   *
   * @param other 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */
  SELF isLessThan(ACTUAL other);

  /*
   * description: actual <= other
   * pass
   * assertThat(1).isLessThanOrEqualTo(2)
   * assertThat(2).isLessThanOrEqualTo(2)
   *
   * fail
   * assertThat(3).isLessThanOrEqualTo(2)
   *
   * @param other 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */
  SELF isLessThanOrEqualTo(ACTUAL other);

  /*
   * description: actual > other
   * pass
   * assertThat(3).isGreaterThan(2)
   *
   * fail
   * assertThat(2).isGreaterThan(2)
   * assertThat(3).isGreaterThan(2)
   *
   * @param other 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */
  SELF isGreaterThan(ACTUAL other);

  /*
   * description: actual >= other
   * pass
   * assertThat(3).isGreaterThanOrEqualTo(2)
   *
   * fail
   * assertThat(2).isGreaterThanOrEqualTo(2)
   * assertThat(3).isGreaterThanOrEqualTo(2)
   *
   * @param other 边界值
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */
  SELF isGreaterThanOrEqualTo(ACTUAL other);

  /*
   * description: startInclusive <= actual <= endInclusive
   * pass
   * assertThat(2).isBetween(2,4)
   * assertThat(3).isBetween(2,4)
   * assertThat(4).isBetween(2,4)
   *
   * fail
   * assertThat(1).isBetween(2,4)
   * assertThat(5).isBetween(2,4)
   *
   * @param startInclusive 左边界，包含
   * @param endInclusive 右边界，包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:34
   */
  SELF isBetween(ACTUAL startInclusive, ACTUAL endInclusive);

  /*
   * description: startExclusive < actual <= endExclusive
   * pass
   * assertThat(3).isStrictlyBetween(2,4)
   * assertThat(4).isStrictlyBetween(2,4)
   *
   * fail
   * assertThat(1).isStrictlyBetween(2,4)
   * assertThat(2).isStrictlyBetween(2,4)
   * assertThat(5).isStrictlyBetween(2,4)
   *
   * @param startExclusive 左边界，不包含
   * @param endExclusive 右边界，包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:36
   */
  SELF isStrictlyBetween(ACTUAL startExclusive, ACTUAL endExclusive);

  /*
   * description: startInclusive <= actual < endExclusive
   * pass
   * assertThat(2).isStartInclusiveBetween(2,4)
   * assertThat(3).isStartInclusiveBetween(2,4)
   *
   * fail
   * assertThat(1).isStartInclusiveBetween(2,4)
   * assertThat(4).isStartInclusiveBetween(2,4)
   * assertThat(5).isStartInclusiveBetween(2,4)
   *
   * @param startInclusive 左边界，包含
   * @param endExclusive 右边界，不包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:36
   */
  SELF isStartInclusiveBetween(ACTUAL startInclusive, ACTUAL endExclusive);

  /*
   * description: startExclusive < actual <= endInclusive
   * pass
   * assertThat(3).isStartInclusiveBetween(2,4)
   * assertThat(4).isStartInclusiveBetween(2,4)
   *
   * fail
   * assertThat(1).isStartInclusiveBetween(2,4)
   * assertThat(2).isStartInclusiveBetween(2,4)
   * assertThat(5).isStartInclusiveBetween(2,4)
   *
   * @param startExclusive 左边界，不包含
   * @param endInclusive 右边界，包含
   * @return SELF
   * @author wurenqing
   * @time 2021-10-12 16:36
   */
  SELF isEndInclusiveBetween(ACTUAL startExclusive, ACTUAL endInclusive);
}
