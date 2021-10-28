package com.qing.assertj.core.array;

import com.qing.assertj.core.AbstractArrayAssert;


public  class BoxedFloatArrayAssert extends AbstractArrayAssert<BoxedFloatArrayAssert, Float[]> {

  public BoxedFloatArrayAssert(Float[] actual) {
    super(actual, BoxedFloatArrayAssert.class);
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
