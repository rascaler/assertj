package com.qing.assertj.core.number;


public class IntegerAssert extends AbstractIntegerAssert<IntegerAssert> {

  public IntegerAssert(Integer actual) {
    super(actual, IntegerAssert.class);
  }

  public IntegerAssert(int actual) {
    super(actual, IntegerAssert.class);
  }
}
