package com.cybermax.assertj.core.number;


import com.cybermax.assertj.core.AbstractComparableAssert;

import java.math.BigDecimal;


public abstract class AbstractBigDecimalAssert<SELF extends AbstractBigDecimalAssert<SELF>> extends
        AbstractComparableAssert<SELF, BigDecimal> implements NumberAssert<SELF, BigDecimal> {

  protected AbstractBigDecimalAssert(BigDecimal actual, Class<?> selfType) {
    super(actual, selfType);
  }


  @Override
  public SELF isZero() {
    this.passed = actual.compareTo(new BigDecimal(0)) == 0;
    return myself;
  }

  @Override
  public SELF isNotZero() {
    this.passed = !(actual.compareTo(new BigDecimal(0)) == 0);
    return myself;
  }

  @Override
  public SELF isOne() {
    this.passed = actual.compareTo(new BigDecimal(1)) == 0;
    return myself;
  }

  @Override
  public SELF isNotOne() {
    this.passed = !(actual.compareTo(new BigDecimal(1)) == 0);
    return myself;
  }

  @Override
  public SELF isPositive() {
    this.passed = actual.compareTo(new BigDecimal(0)) > 0;
    return myself;
  }

  @Override
  public SELF isNegative() {
    this.passed = actual.compareTo(new BigDecimal(0)) < 0;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    this.passed = !(actual.compareTo(new BigDecimal(0)) < 0);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    this.passed = !(actual.compareTo(new BigDecimal(0)) > 0);
    return myself;
  }

}
