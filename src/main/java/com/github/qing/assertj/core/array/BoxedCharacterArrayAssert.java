package com.github.qing.assertj.core.array;

import com.github.qing.assertj.core.AbstractArrayAssert;


public  class BoxedCharacterArrayAssert extends AbstractArrayAssert<BoxedCharacterArrayAssert, Character[]> {

  public BoxedCharacterArrayAssert(Character[] actual) {
    super(actual, BoxedCharacterArrayAssert.class);
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
