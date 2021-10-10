package com.cybermax.assertj.core.array;

import com.cybermax.assertj.core.AbstractArrayAssert;


public  class BoxedByteArrayAssert extends AbstractArrayAssert<BoxedByteArrayAssert, Byte[]> {

  public BoxedByteArrayAssert(Byte[] actual, Class<?> selfType) {
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
