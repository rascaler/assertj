package io.github.rascaler.assertj.core.array;


public  class ShortArrayAssert extends AbstractArrayAssert<ShortArrayAssert, short[]> {

  public ShortArrayAssert(short[] actual, Class<?> selfType) {
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
