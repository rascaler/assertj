package com.qing.assertj.core.array;

import com.qing.assertj.core.AbstractArrayAssert;


public  class CharacterArrayAssert extends AbstractArrayAssert<CharacterArrayAssert, char[]> {

  public CharacterArrayAssert(char[] actual) {
    super(actual, CharacterArrayAssert.class);
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
