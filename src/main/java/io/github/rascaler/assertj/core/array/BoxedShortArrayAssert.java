package io.github.rascaler.assertj.core.array;


public  class BoxedShortArrayAssert extends AbstractArrayAssert<BoxedShortArrayAssert, Short[]> {

  public BoxedShortArrayAssert(Short[] actual, Class<?> selfType) {
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
