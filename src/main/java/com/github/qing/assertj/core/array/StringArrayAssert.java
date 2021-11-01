package com.github.qing.assertj.core.array;

import com.github.qing.assertj.core.AbstractArrayAssert;


public  class StringArrayAssert extends AbstractArrayAssert<StringArrayAssert, String[]> {

  public StringArrayAssert(String[] actual, Class<?> selfType) {
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
