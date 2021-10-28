package com.qing.assertj;


import com.qing.assertj.core.AbstractAssert;
import com.qing.assertj.core.array.*;
import com.qing.assertj.core.base.BooleanAssert;
import com.qing.assertj.core.base.CharacterAssert;
import com.qing.assertj.core.base.ObjectAssert;
import com.qing.assertj.core.base.StringAssert;
import com.qing.assertj.core.calendar.DateAssert;
import com.qing.assertj.core.calendar.LocalDateAssert;
import com.qing.assertj.core.calendar.LocalDateTimeAssert;
import com.qing.assertj.core.collection.ListAssert;
import com.qing.assertj.core.collection.SetAssert;
import com.qing.assertj.core.exception.ExceptionConvertor;
import com.qing.assertj.core.map.MapsAssert;
import com.qing.assertj.core.number.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assertions {

  protected Assertions() {}

  public static void addExceptionCoverters(ExceptionConvertor covert) {
    AbstractAssert.addExceptionConvertor(covert);
  }

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
    return new BooleanAssert(actual);
  }

  public static BooleanAssert assertThat(Boolean actual) {
    return new BooleanAssert(actual);
  }

  public static StringAssert assertThat(String actual) {
    return new StringAssert(actual);
  }

  public static CharacterAssert assertThat(char actual) {
    return new CharacterAssert(actual);
  }

  public static CharacterAssert assertThat(Character actual) {
    return new CharacterAssert(actual);
  }

  public static MapsAssert assertThat(Map actual) {
    return new MapsAssert(actual);
  }


  public static ByteArrayAssert assertThat(byte[] actual) {
    return new ByteArrayAssert(actual);
  }
  public static BoxedByteArrayAssert assertThat(Byte[] actual) {
    return new BoxedByteArrayAssert(actual, BoxedByteArrayAssert.class);
  }
  public static ShortArrayAssert assertThat(short[] actual) {
    return new ShortArrayAssert(actual, ShortArrayAssert.class);
  }
  public static BoxedShortArrayAssert assertThat(Short[] actual) {
    return new BoxedShortArrayAssert(actual, BoxedShortArrayAssert.class);
  }
  public static IntArrayAssert assertThat(int[] actual) {
    return new IntArrayAssert(actual);
  }
  public static BoxedIntArrayAssert assertThat(Integer[] actual) {
    return new BoxedIntArrayAssert(actual);
  }
  public static FloatArrayAssert assertThat(float[] actual) {
    return new FloatArrayAssert(actual);
  }
  public static BoxedFloatArrayAssert assertThat(Float[] actual) {
    return new BoxedFloatArrayAssert(actual);
  }
  public static DoubleArrayAssert assertThat(double[] actual) {
    return new DoubleArrayAssert(actual);
  }
  public static BoxedDoubleArrayAssert assertThat(Double[] actual) {
    return new BoxedDoubleArrayAssert(actual);
  }
  public static LongArrayAssert assertThat(long[] actual) {
    return new LongArrayAssert(actual);
  }
  public static BoxedLongArrayAssert assertThat(Long[] actual) {
    return new BoxedLongArrayAssert(actual);
  }
  public static CharacterArrayAssert assertThat(char[] actual) {
    return new CharacterArrayAssert(actual);
  }
  public static BoxedCharacterArrayAssert assertThat(Character[] actual) {
    return new BoxedCharacterArrayAssert(actual);
  }

  public static BooleanArrayAssert assertThat(boolean[] actual) {
    return new BooleanArrayAssert(actual);
  }
  public static BoxedBooleanArrayAssert assertThat(Boolean[] actual) {
    return new BoxedBooleanArrayAssert(actual);
  }

  public static LocalDateAssert assertThat(LocalDate actual) {
    return new LocalDateAssert(actual);
  }

  public static LocalDateTimeAssert assertThat(LocalDateTime actual) {
    return new LocalDateTimeAssert(actual);
  }

  public static DateAssert assertThat(Date actual) {
    return new DateAssert(actual);
  }

  public static ObjectAssert assertThat(Object actual) {
    return new ObjectAssert(actual);
  }
}
