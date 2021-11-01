package com.github.qing.assertj.core.number;

public class DoubleAssert extends AbstractNumberAssert<DoubleAssert, Double> {

  public DoubleAssert(Double actual) {
    super(actual, DoubleAssert.class);
  }

  public DoubleAssert(double actual) {
    super(actual, DoubleAssert.class);
  }

  private final static Double ZERO = 0D;

  private final static Double ONE = 1D;

  @Override
  protected Double getZero() {
    return ZERO;
  }

  @Override
  protected Double getOne() {
    return null;
  }
}
