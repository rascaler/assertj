package io.github.rascaler.assertj.core.array;


public  class BoxedByteArrayAssert extends AbstractArrayAssert<BoxedByteArrayAssert, Byte[]> {

  public BoxedByteArrayAssert(Byte[] actual, Class<?> selfType) {
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
