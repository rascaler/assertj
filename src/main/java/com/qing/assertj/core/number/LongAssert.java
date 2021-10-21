package com.qing.assertj.core.number;


public class LongAssert extends AbstractNumberAssert<LongAssert,Long> {

  public LongAssert(Long actual) {
    super(actual, LongAssert.class);
  }

  public LongAssert(long actual) {
    super(actual, LongAssert.class);
  }

  private final static Long ZERO = 0L;

  private final static Long ONE = 1L;

  @Override
  protected Long getZero() {
    return ZERO;
  }

  @Override
  protected Long getOne() {
    return ONE;
  }
}
