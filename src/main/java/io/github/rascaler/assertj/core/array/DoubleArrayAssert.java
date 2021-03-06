package io.github.rascaler.assertj.core.array;


public  class DoubleArrayAssert extends AbstractArrayAssert<DoubleArrayAssert, double[]> {

  public DoubleArrayAssert(double[] actual) {
    super(actual, DoubleArrayAssert.class);
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
