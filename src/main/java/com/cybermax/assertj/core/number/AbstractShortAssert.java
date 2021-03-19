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
    this.passed = actual.equals((short)0);
    return myself;
  }

  @Override
  public SELF isNotZero() {
    this.passed = !actual.equals((short)0);
    return myself;
  }

  @Override
  public SELF isOne() {
    this.passed = actual.equals((short)1);
    return myself;
  }

  @Override
  public SELF isNotOne() {
    this.passed = !actual.equals((short)1);
    return myself;
  }

  @Override
  public SELF isPositive() {
    this.passed = actual > (short)0;
    return myself;
  }

  @Override
  public SELF isNegative() {
    this.passed = actual < (short)0;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    this.passed = !(actual < (short)0);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    this.passed = !(actual > (short)0);
    return myself;
  }

}
