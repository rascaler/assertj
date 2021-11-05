package io.github.rascaler.assertj.core.array;


public  class BoxedBooleanArrayAssert extends AbstractArrayAssert<BoxedBooleanArrayAssert, Boolean[]> {

  public BoxedBooleanArrayAssert(Boolean[] actual) {
    super(actual, BoxedBooleanArrayAssert.class);
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
