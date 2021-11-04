package io.github.rascaler.assertj.core.array;

import io.github.rascaler.assertj.core.AbstractArrayAssert;


public  class BoxedLongArrayAssert extends AbstractArrayAssert<BoxedLongArrayAssert, Long[]> {

  public BoxedLongArrayAssert(Long[] actual) {
    super(actual, BoxedLongArrayAssert.class);
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
