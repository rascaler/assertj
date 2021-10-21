package com.qing.assertj.core.number;


import java.math.BigDecimal;

public class BigDecimalAssert extends AbstractNumberAssert<BigDecimalAssert, BigDecimal> {

  public BigDecimalAssert(BigDecimal actual) {
    super(actual, BigDecimalAssert.class);
  }

  private final static BigDecimal ZERO = new BigDecimal(0);

  private final static BigDecimal ONE = new BigDecimal(1);

  @Override
  protected BigDecimal getZero() {
    return ZERO;
  }

  @Override
  protected BigDecimal getOne() {
    return ONE;
  }
}
