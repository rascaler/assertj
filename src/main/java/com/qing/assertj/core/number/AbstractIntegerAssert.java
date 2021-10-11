package com.qing.assertj.core.number;


import com.qing.assertj.core.AbstractComparableAssert;


public abstract class AbstractIntegerAssert<SELF extends AbstractIntegerAssert<SELF>> extends
        AbstractComparableAssert<SELF, Integer> implements NumberAssert<SELF, Integer> {

  private static final Double NEGATIVE_ZERO = -0.0;

  private final boolean isPrimitive;

  protected AbstractIntegerAssert(Integer actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = false;
  }

  public AbstractIntegerAssert(int actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = true;
  }

  @Override
  public SELF isZero() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.equals(0);
    return myself;
  }

  @Override
  public SELF isNotZero() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !actual.equals(0);
    return myself;
  }

  @Override
  public SELF isOne() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.equals(1);
    return myself;
  }

  @Override
  public SELF isNotOne() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !actual.equals(1);
    return myself;
  }

  @Override
  public SELF isPositive() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual > 0;
    return myself;
  }

  @Override
  public SELF isNegative() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual < 0;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual < 0);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual > 0);
    return myself;
  }

}
