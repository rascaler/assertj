package com.qing.assertj.core.number;

public class DoubleAssert extends AbstractDoubleAssert<DoubleAssert> {

  public DoubleAssert(Double actual) {
    super(actual, DoubleAssert.class);
  }

  public DoubleAssert(double actual) {
    super(actual, DoubleAssert.class);
  }
}
