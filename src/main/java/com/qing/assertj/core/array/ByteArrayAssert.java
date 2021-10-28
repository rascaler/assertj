package com.qing.assertj.core.array;

import com.qing.assertj.core.AbstractArrayAssert;


public  class ByteArrayAssert extends AbstractArrayAssert<ByteArrayAssert, byte[]> {

  public ByteArrayAssert(byte[] actual) {
    super(actual, ByteArrayAssert.class);
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
