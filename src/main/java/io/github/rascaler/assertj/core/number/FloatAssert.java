package io.github.rascaler.assertj.core.number;

public class FloatAssert extends AbstractNumberAssert<FloatAssert, Float> {

  public FloatAssert(Float actual) {
    super(actual, FloatAssert.class);
  }

  public FloatAssert(float actual) {
    super(actual, FloatAssert.class);
  }

  private final static Float ZERO = 0F;

  private final static Float ONE = 1F;

  @Override
  protected Float getZero() {
    return ZERO;
  }

  @Override
  protected Float getOne() {
    return ONE;
  }
}
