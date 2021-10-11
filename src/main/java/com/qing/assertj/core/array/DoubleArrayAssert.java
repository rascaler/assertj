package com.qing.assertj.core.array;

import com.qing.assertj.core.AbstractArrayAssert;


public  class DoubleArrayAssert extends AbstractArrayAssert<DoubleArrayAssert, double[]> {

  public DoubleArrayAssert(double[] actual, Class<?> selfType) {
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
