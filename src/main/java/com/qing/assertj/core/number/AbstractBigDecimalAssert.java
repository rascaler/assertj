package com.qing.assertj.core.number;


import com.qing.assertj.core.AbstractComparableAssert;

import java.math.BigDecimal;


public abstract class AbstractBigDecimalAssert<SELF extends AbstractBigDecimalAssert<SELF>> extends
        AbstractComparableAssert<SELF, BigDecimal> implements NumberAssert<SELF, BigDecimal> {

  protected AbstractBigDecimalAssert(BigDecimal actual, Class<?> selfType) {
    super(actual, selfType);
  }


  @Override
  public SELF isZero() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.compareTo(new BigDecimal(0)) == 0;
    return myself;
  }

  @Override
  public SELF isNotZero() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual.compareTo(new BigDecimal(0)) == 0);
    return myself;
  }

  @Override
  public SELF isOne() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.compareTo(new BigDecimal(1)) == 0;
    return myself;
  }

  @Override
  public SELF isNotOne() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual.compareTo(new BigDecimal(1)) == 0);
    return myself;
  }

  @Override
  public SELF isPositive() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.compareTo(new BigDecimal(0)) > 0;
    return myself;
  }

  @Override
  public SELF isNegative() {
    if (!this.passed) {
      return myself;
    }
    this.passed = actual.compareTo(new BigDecimal(0)) < 0;
    return myself;
  }

  @Override
  public SELF isNotNegative() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual.compareTo(new BigDecimal(0)) < 0);
    return myself;
  }

  @Override
  public SELF isNotPositive() {
    if (!this.passed) {
      return myself;
    }
    this.passed = !(actual.compareTo(new BigDecimal(0)) > 0);
    return myself;
  }

}
