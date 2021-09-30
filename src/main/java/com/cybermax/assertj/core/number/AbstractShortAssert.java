package com.cybermax.assertj.core.number;


import com.cybermax.assertj.core.AbstractComparableAssert;


public abstract class AbstractShortAssert<SELF extends AbstractShortAssert<SELF>> extends
        AbstractComparableAssert<SELF, Short> implements NumberAssert<SELF, Short> {

  private static final Double NEGATIVE_ZERO = -0.0;

  private final boolean isPrimitive;

  protected AbstractShortAssert(Short actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = false;
  }

  public AbstractShortAssert(short actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = true;
  }

  @Override
  public SELF isZero() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.equals((short)0);
    return myself;
  }

  @Override
  public SELF isNotZero() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !actual.equals((short)0);
    return myself;
  }

  @Override
  public SELF isOne() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.equals((short)1);
    return myself;
  }

  @Override
  public SELF isNotOne() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !actual.equals((short)1);
    return myself;
  }

  @Override
  public SELF isPositive() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual > (short)0;
    return myself;
  }

  @Override
  public SELF isNegative() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual < (short)0;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual < (short)0);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual > (short)0);
    return myself;
  }

}
