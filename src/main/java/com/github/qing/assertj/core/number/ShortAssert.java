package com.github.qing.assertj.core.number;


public class ShortAssert extends AbstractNumberAssert<ShortAssert,Short> {

  public ShortAssert(Short actual) {
    super(actual, ShortAssert.class);
  }

  public ShortAssert(short actual) {
    super(actual, ShortAssert.class);
  }

  private final static Short ZERO = 0;

  private final static Short ONE = 1;

  @Override
  protected Short getZero() {
    return ZERO;
  }

  @Override
  protected Short getOne() {
    return ONE;
  }
}
