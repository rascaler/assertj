
package com.qing.assertj.core.number;


import com.qing.assertj.core.AbstractComparableAssert;


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
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.equals(0F);
    return myself;
  }

  @Override
  public SELF isNotZero() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !actual.equals(0F);
    return myself;
  }

  @Override
  public SELF isOne() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.equals(1F);
    return myself;
  }

  @Override
  public SELF isNotOne() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !actual.equals(1F);
    return myself;
  }

  @Override
  public SELF isPositive() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual > 0F;
    return myself;
  }

  @Override
  public SELF isNegative() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual < 0F;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual < 0F);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual > 0F);
    return myself;
  }

}
