package io.github.rascaler.assertj.core.array;


public  class BoxedIntArrayAssert extends AbstractArrayAssert<BoxedIntArrayAssert, Integer[]> {

  public BoxedIntArrayAssert(Integer[] actual) {
    super(actual, BoxedIntArrayAssert.class);
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
