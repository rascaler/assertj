package io.github.rascaler.assertj.core.array;


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
