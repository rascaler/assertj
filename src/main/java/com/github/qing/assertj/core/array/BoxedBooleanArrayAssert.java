package com.github.qing.assertj.core.array;

import com.github.qing.assertj.core.AbstractArrayAssert;


public  class BoxedBooleanArrayAssert extends AbstractArrayAssert<BoxedBooleanArrayAssert, Boolean[]> {

  public BoxedBooleanArrayAssert(Boolean[] actual) {
    super(actual, BoxedBooleanArrayAssert.class);
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
