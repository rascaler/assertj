package io.github.rascaler.assertj;


import io.github.rascaler.assertj.core.AbstractAssert;
import io.github.rascaler.assertj.core.array.*;
import io.github.rascaler.assertj.core.base.BooleanAssert;
import io.github.rascaler.assertj.core.base.CharacterAssert;
import io.github.rascaler.assertj.core.base.ObjectAssert;
import io.github.rascaler.assertj.core.base.StringAssert;
import io.github.rascaler.assertj.core.calendar.DateAssert;
import io.github.rascaler.assertj.core.calendar.LocalDateAssert;
import io.github.rascaler.assertj.core.calendar.LocalDateTimeAssert;
import io.github.rascaler.assertj.core.collection.DefaultCollectionAssert;
import io.github.rascaler.assertj.core.exception.ExceptionConvertor;
import io.github.rascaler.assertj.core.map.DefaultMapAssert;
import io.github.rascaler.assertj.core.number.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Assertions {

  protected Assertions() {}

  public static void addExceptionConvertor(ExceptionConvertor convertor) {
    AbstractAssert.addExceptionConvertor(convertor);
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
  public static LongAssert assertThat(long actual) {
    return new LongAssert(actual);
  }

  public static LongAssert assertThat(Long actual) {
    return new LongAssert(actual);
  }

  public static DefaultCollectionAssert assertThat(Collection<?> actual) {
    return new DefaultCollectionAssert(actual);
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

  public static  <K,V> DefaultMapAssert<K,V> assertThat(Map<K,V> actual) {
    return new DefaultMapAssert<K,V>(actual);
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
