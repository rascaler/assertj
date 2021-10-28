package com.qing.assertj.core.array;

import com.qing.assertj.core.AbstractArrayAssert;


public  class BooleanArrayAssert extends AbstractArrayAssert<BooleanArrayAssert, boolean[]> {

  public BooleanArrayAssert(boolean[] actual) {
    super(actual, BooleanArrayAssert.class);
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
