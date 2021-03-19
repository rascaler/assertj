
package com.cybermax.assertj.core.number;


import com.cybermax.assertj.core.AbstractComparableAssert;


public abstract class AbstractFloatAssert<SELF extends AbstractFloatAssert<SELF>> extends
        AbstractComparableAssert<SELF, Float> implements NumberAssert<SELF, Float> {

  private static final Float NEGATIVE_ZERO = -0.0F;

  private final boolean isPrimitive;

  protected AbstractFloatAssert(Float actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = false;
  }

  public AbstractFloatAssert(float actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = true;
  }

  @Override
  public SELF isZero() {
    this.passed = actual.equals(0F);
    return myself;
  }

  @Override
  public SELF isNotZero() {
    this.passed = !actual.equals(0F);
    return myself;
  }

  @Override
  public SELF isOne() {
    this.passed = actual.equals(1F);
    return myself;
  }

  @Override
  public SELF isNotOne() {
    this.passed = !actual.equals(1F);
    return myself;
  }

  @Override
  public SELF isPositive() {
    this.passed = actual > 0F;
    return myself;
  }

  @Override
  public SELF isNegative() {
    this.passed = actual < 0F;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    this.passed = !(actual < 0F);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    this.passed = !(actual > 0F);
    return myself;
  }

}
