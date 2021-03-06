package io.github.rascaler.assertj.core.array;


public  class IntArrayAssert extends AbstractArrayAssert<IntArrayAssert, int[]> {

  public IntArrayAssert(int[] actual) {
    super(actual, IntArrayAssert.class);
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
