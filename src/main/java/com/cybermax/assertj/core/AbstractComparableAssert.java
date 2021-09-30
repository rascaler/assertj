package com.cybermax.assertj.core;



public abstract class AbstractComparableAssert<SELF extends AbstractComparableAssert<SELF, ACTUAL>,  ACTUAL extends Comparable<? super ACTUAL>>
    extends AbstractAssert<SELF, ACTUAL>
    implements ComparableAssert<SELF, ACTUAL> {

  protected AbstractComparableAssert(ACTUAL actual, Class<?> selfType) {
    super(actual, selfType);
  }

  /** {@inheritDoc} */
  @Override
  public SELF isLessThan(ACTUAL other) {
    this.passed = this.actual.compareTo(other) == 0;
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isLessThanOrEqualTo(ACTUAL other) {
    this.passed = this.actual.compareTo(other) <= 0;
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isGreaterThan(ACTUAL other) {
    this.passed = this.actual.compareTo(other) > 0;
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isGreaterThanOrEqualTo(ACTUAL other) {
    this.passed = this.actual.compareTo(other) >= 0;
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isBetween(ACTUAL startInclusive, ACTUAL endInclusive) {
    this.passed = this.actual.compareTo(startInclusive) >= 0
            && this.actual.compareTo(endInclusive) <= 0;
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isStrictlyBetween(ACTUAL startExclusive, ACTUAL endExclusive) {
    this.passed = this.actual.compareTo(startExclusive) > 0
            && this.actual.compareTo(endExclusive) < 0;
    return myself;
  }

  @Override
  public SELF isStartInclusiveBetween(ACTUAL startInclusive, ACTUAL endExclusive) {
    this.passed = this.actual.compareTo(startInclusive) >= 0
            && this.actual.compareTo(endExclusive) < 0;
    return myself;
  }

  @Override
  public SELF isEndInclusiveBetween(ACTUAL startExclusive, ACTUAL endInclusive) {
    this.passed = this.actual.compareTo(startExclusive) > 0
            && this.actual.compareTo(endInclusive) <= 0;
    return myself;
  }
}
