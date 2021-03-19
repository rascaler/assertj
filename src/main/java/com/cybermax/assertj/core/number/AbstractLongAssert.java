package com.cybermax.assertj.core.number;


import com.cybermax.assertj.core.AbstractComparableAssert;


public abstract class AbstractLongAssert<SELF extends AbstractLongAssert<SELF>> extends
        AbstractComparableAssert<SELF, Long> implements NumberAssert<SELF, Long> {

  private static final Double NEGATIVE_ZERO = -0.0;

  private final boolean isPrimitive;

  protected AbstractLongAssert(Long actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = false;
  }

  public AbstractLongAssert(long actual, Class<?> selfType) {
    super(actual, selfType);
    this.isPrimitive = true;
  }

  @Override
  public SELF isZero() {
    this.passed = actual.equals(0L);
    return myself;
  }

  @Override
  public SELF isNotZero() {
    this.passed = !actual.equals(0L);
    return myself;
  }

  @Override
  public SELF isOne() {
    this.passed = actual.equals(1L);
    return myself;
  }

  @Override
  public SELF isNotOne() {
    this.passed = !actual.equals(1L);
    return myself;
  }

  @Override
  public SELF isPositive() {
    this.passed = actual > 0L;
    return myself;
  }

  @Override
  public SELF isNegative() {
    this.passed = actual < 0L;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    this.passed = !(actual < 0L);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    this.passed = !(actual > 0L);
    return myself;
  }

}
