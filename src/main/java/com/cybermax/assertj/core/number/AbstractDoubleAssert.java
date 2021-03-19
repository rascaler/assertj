package com.cybermax.assertj.core.number;


import com.cybermax.assertj.core.AbstractComparableAssert;


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
    this.passed = actual.equals(0D);
    return myself;
  }

  @Override
  public SELF isNotZero() {
    this.passed = !actual.equals(0D);
    return myself;
  }

  @Override
  public SELF isOne() {
    this.passed = actual.equals(1D);
    return myself;
  }

  @Override
  public SELF isNotOne() {
    this.passed = !actual.equals(1D);
    return myself;
  }

  @Override
  public SELF isPositive() {
    this.passed = actual > 0D;
    return myself;
  }

  @Override
  public SELF isNegative() {
    this.passed = actual < 0D;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    this.passed = !(actual < 0D);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    this.passed = !(actual > 0D);
    return myself;
  }

}
