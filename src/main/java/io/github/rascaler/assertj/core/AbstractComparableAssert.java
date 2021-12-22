package io.github.rascaler.assertj.core;



public abstract class AbstractComparableAssert<SELF extends AbstractComparableAssert<SELF, ACTUAL>,  ACTUAL extends Comparable<? super ACTUAL>>
    extends AbstractAssert<SELF, ACTUAL>
    implements ComparableAssert<SELF, ACTUAL> {

  protected AbstractComparableAssert(ACTUAL actual, Class<?> selfType) {
    super(actual, selfType);
  }

  @Override
  public SELF isEqualTo(ACTUAL expected) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = this.actual.equals(expected);
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isLessThan(ACTUAL boundary) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = this.actual.compareTo(boundary) < 0;
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isLessThanOrEqualTo(ACTUAL boundary) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = this.actual.compareTo(boundary) <= 0;
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isGreaterThan(ACTUAL boundary) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = this.actual.compareTo(boundary) > 0;
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isGreaterThanOrEqualTo(ACTUAL boundary) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = this.actual.compareTo(boundary) >= 0;
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isBetween(ACTUAL startInclusiveBoundary, ACTUAL endInclusiveBoundary) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = this.actual.compareTo(startInclusiveBoundary) >= 0
            && this.actual.compareTo(endInclusiveBoundary) <= 0;
    return myself;
  }

  /** {@inheritDoc} */
  @Override
  public SELF isStrictlyBetween(ACTUAL startExclusiveBoundary, ACTUAL endExclusiveBoundary) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = this.actual.compareTo(startExclusiveBoundary) > 0
            && this.actual.compareTo(endExclusiveBoundary) < 0;
    return myself;
  }

  @Override
  public SELF isStartInclusiveBetween(ACTUAL startInclusiveBoundary, ACTUAL endExclusiveBoundary) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = this.actual.compareTo(startInclusiveBoundary) >= 0
            && this.actual.compareTo(endExclusiveBoundary) < 0;
    return myself;
  }

  @Override
  public SELF isEndInclusiveBetween(ACTUAL startExclusiveBoundary, ACTUAL endInclusiveBoundary) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = this.actual.compareTo(startExclusiveBoundary) > 0
            && this.actual.compareTo(endInclusiveBoundary) <= 0;
    return myself;
  }
}
