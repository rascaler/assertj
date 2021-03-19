package com.cybermax.assertj;


import com.cybermax.assertj.core.base.BooleanAssert;
import com.cybermax.assertj.core.collection.ListAssert;
import com.cybermax.assertj.core.collection.SetAssert;
import com.cybermax.assertj.core.number.*;

import java.util.List;
import java.util.Set;

public class Assertions {

  protected Assertions() {}

  public static ByteAssert assertThat(byte actual) {
    return new ByteAssert(actual);
  }

  public static ByteAssert assertThat(Byte actual) {
  return new ByteAssert(actual);
}

  public static ShortAssert assertThat(short actual) {
    return new ShortAssert(actual);
  }

  public static ShortAssert assertThat(Short actual) {
    return new ShortAssert(actual);
  }

  public static IntegerAssert assertThat(Integer actual) {
    return new IntegerAssert(actual);
  }

  public static IntegerAssert assertThat(int actual) {
    return new IntegerAssert(actual);
  }

  public static FloatAssert assertThat(Float actual) {
    return new FloatAssert(actual);
  }

  public static FloatAssert assertThat(float actual) {
    return new FloatAssert(actual);
  }

  public static DoubleAssert assertThat(double actual) {
    return new DoubleAssert(actual);
  }

  public static DoubleAssert assertThat(Double actual) {
    return new DoubleAssert(actual);
  }

  public static <T> ListAssert<T> assertThat(List<T> actual) {
    return new ListAssert<T>(actual);
  }

  public static <T> SetAssert<T> assertThat(Set<T> actual) {
    return new SetAssert<T>(actual);
  }

  public static BooleanAssert assertThat(boolean actual) {
    return new BooleanAssert(actual, Boolean.class);
  }

  public static BooleanAssert assertThat(Boolean actual) {
    return new BooleanAssert(actual, Boolean.class);
  }

}
