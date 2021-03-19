package com.cybermax.assertj.core.number;


import com.cybermax.assertj.Assertions;

public class FloatAssert extends AbstractFloatAssert<FloatAssert> {

  public FloatAssert(Float actual) {
    super(actual, FloatAssert.class);
  }

  public FloatAssert(float actual) {
    super(actual, FloatAssert.class);
  }
}
