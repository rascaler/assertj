package io.github.rascaler.assertj.core.number;


public class ByteAssert extends AbstractNumberAssert<ByteAssert, Byte> {

  public ByteAssert(Byte actual) {
    super(actual, ByteAssert.class);
  }

  public ByteAssert(byte actual) {
    super(actual, ByteAssert.class);
  }

  private final static Byte ZERO = (byte)0;

  private final static Byte ONE = (byte)1;

  @Override
  protected Byte getZero() {
    return ZERO;
  }

  @Override
  protected Byte getOne() {
    return ONE;
  }
}
