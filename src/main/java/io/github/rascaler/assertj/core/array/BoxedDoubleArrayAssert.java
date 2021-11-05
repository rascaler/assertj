package io.github.rascaler.assertj.core.array;


public  class BoxedDoubleArrayAssert extends AbstractArrayAssert<BoxedDoubleArrayAssert, Double[]> {

  public BoxedDoubleArrayAssert(Double[] actual) {
    super(actual, BoxedDoubleArrayAssert.class);
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
