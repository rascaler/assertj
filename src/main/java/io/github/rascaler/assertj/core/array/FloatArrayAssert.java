package io.github.rascaler.assertj.core.array;

import io.github.rascaler.assertj.core.AbstractArrayAssert;


public  class FloatArrayAssert extends AbstractArrayAssert<FloatArrayAssert, float[]> {

  public FloatArrayAssert(float[] actual) {
    super(actual, FloatArrayAssert.class);
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
