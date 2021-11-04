package io.github.rascaler.assertj.core.array;

import io.github.rascaler.assertj.core.AbstractArrayAssert;


public  class LongArrayAssert extends AbstractArrayAssert<LongArrayAssert, long[]> {

  public LongArrayAssert(long[] actual) {
    super(actual, LongArrayAssert.class);
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
