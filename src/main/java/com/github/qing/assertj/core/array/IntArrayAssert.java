package com.github.qing.assertj.core.array;

import com.github.qing.assertj.core.AbstractArrayAssert;


public  class IntArrayAssert extends AbstractArrayAssert<IntArrayAssert, int[]> {

  public IntArrayAssert(int[] actual) {
    super(actual, IntArrayAssert.class);
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
