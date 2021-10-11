package com.qing.assertj.core.number;


import com.qing.assertj.core.AbstractComparableAssert;


public abstract class AbstractDoubleAssert<SELF extends AbstractDoubleAssert<SELF>> extends
        AbstractComparableAssert<SELF, Double> implements NumberAssert<SELF, Double> {

  private static final Double NEGATIVE_ZERO = -0.0D;

  private final boolean isPrimitive;

  protected AbstractDoubleAssert(Double actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = false;
  }

  public AbstractDoubleAssert(double actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = true;
  }

  @Override
  public SELF isZero() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.equals(0D);
    return myself;
  }

  @Override
  public SELF isNotZero() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !actual.equals(0D);
    return myself;
  }

  @Override
  public SELF isOne() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.equals(1D);
    return myself;
  }

  @Override
  public SELF isNotOne() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !actual.equals(1D);
    return myself;
  }

  @Override
  public SELF isPositive() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual > 0D;
    return myself;
  }

  @Override
  public SELF isNegative() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual < 0D;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual < 0D);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual > 0D);
    return myself;
  }

}
