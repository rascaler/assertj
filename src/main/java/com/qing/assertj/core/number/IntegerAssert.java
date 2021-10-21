package com.qing.assertj.core.number;


public class IntegerAssert extends AbstractNumberAssert<IntegerAssert,Integer> {

  public IntegerAssert(Integer actual) {
    super(actual, IntegerAssert.class);
  }

  public IntegerAssert(int actual) {
    super(actual, IntegerAssert.class);
  }

  private final static Integer ZERO = 0;

  private final static Integer ONE = 1;

  @Override
  protected Integer getZero() {
    return ZERO;
  }

  @Override
  protected Integer getOne() {
    return ONE;
  }
}
