package com.cybermax.assertj.core.number;


import com.cybermax.assertj.core.AbstractComparableAssert;


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
    this.passed = actual.equals(0);
    return myself;
  }

  @Override
  public SELF isNotZero() {
    this.passed = !actual.equals(0);
    return myself;
  }

  @Override
  public SELF isOne() {
    this.passed = actual.equals(1);
    return myself;
  }

  @Override
  public SELF isNotOne() {
    this.passed = !actual.equals(1);
    return myself;
  }

  @Override
  public SELF isPositive() {
    this.passed = actual > 0;
    return myself;
  }

  @Override
  public SELF isNegative() {
    this.passed = actual < 0;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    this.passed = !(actual < 0);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    this.passed = !(actual > 0);
    return myself;
  }

}
