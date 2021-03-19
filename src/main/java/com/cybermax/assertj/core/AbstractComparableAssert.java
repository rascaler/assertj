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
    if (this.actual.compareTo(other) == 0) {
      this.passed = true;
    } else {
      this.passed = false;
    }

    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isLessThanOrEqualTo(ACTUAL other) {
    if (this.actual.compareTo(other) <= 0) {
      this.passed = true;
    } else {
      this.passed = false;
    }
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isGreaterThan(ACTUAL other) {
    if (this.actual.compareTo(other) > 0) {
      this.passed = true;
    } else {
      this.passed = false;
    }
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isGreaterThanOrEqualTo(ACTUAL other) {
    if (this.actual.compareTo(other) >= 0) {
      this.passed = true;
    } else {
      this.passed = false;
    }
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isBetween(ACTUAL startInclusive, ACTUAL endInclusive) {
    if (this.actual.compareTo(startInclusive) >= 0 && this.actual.compareTo(endInclusive) <= 0) {
      this.passed = true;
    } else {
      this.passed = false;
    }
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isStrictlyBetween(ACTUAL startExclusive, ACTUAL endExclusive) {
    if (this.actual.compareTo(startExclusive) > 0 && this.actual.compareTo(endExclusive) < 0) {
      this.passed = true;
    } else {
      this.passed = false;
    }
    return myself;
  }

  @Override
  public SELF isStartInclusiveBetween(ACTUAL startInclusive, ACTUAL endExclusive) {
    if (this.actual.compareTo(startInclusive) >= 0 && this.actual.compareTo(endExclusive) < 0) {
      this.passed = true;
    } else {
      this.passed = false;
    }
    return myself;
  }

  @Override
  public SELF isEndInclusiveBetween(ACTUAL startExclusive, ACTUAL endInclusive) {
    if (this.actual.compareTo(startExclusive) > 0 && this.actual.compareTo(endInclusive) <= 0) {
      this.passed = true;
    } else {
      this.passed = false;
    }
    return myself;
  }
}
