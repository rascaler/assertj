package com.qing.assertj.core.array;

import com.qing.assertj.core.AbstractArrayAssert;


public  class BooleanArrayAssert extends AbstractArrayAssert<BooleanArrayAssert, int[]> {

  public BooleanArrayAssert(int[] actual, Class<?> selfType) {
    super(actual, selfType);
  }

  @Override
  protected int size() {
    return actual.length;
  }

  @Override
  protected Object get(int index) {
    return actual[index];
  }
}
