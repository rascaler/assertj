package com.github.qing.assertj.core.array;

import com.github.qing.assertj.core.AbstractArrayAssert;


public  class BoxedIntArrayAssert extends AbstractArrayAssert<BoxedIntArrayAssert, Integer[]> {

  public BoxedIntArrayAssert(Integer[] actual) {
    super(actual, BoxedIntArrayAssert.class);
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
