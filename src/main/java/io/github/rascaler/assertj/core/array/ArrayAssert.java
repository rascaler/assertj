package io.github.rascaler.assertj.core.array;

import io.github.rascaler.assertj.core.Assert;
import io.github.rascaler.assertj.core.SizeComparableAssert;

import java.util.Collection;

public interface ArrayAssert<SELF extends ArrayAssert<SELF, ACTUAL>, ACTUAL>
extends SizeComparableAssert<SELF, ACTUAL>, Assert<SELF, ACTUAL> {


  /**
   * 是否为空
   * @return
   */
  SELF isEmpty();

  /**
   * 是否不为空
   * @return
   */
  SELF isNotEmpty();

  /**
   * 是否存在空元素
   * @return
   */
  SELF hasEmptyElement();

  /**
   * 是否包含所有值
   * @return
   */
  <T> SELF containsAll(T... values);

  /**
   * 是否包含所有值
   * @return
   */
  SELF containsAll(Collection<?> values);

  /**
   * 是否包含某值
   * @return
   */
  <T> SELF containsAny(T... values);

  /**
   * 是否包含某值
   * @return
   */
  SELF containsAny(Collection<?> values);

  /**
   * 是否不包含所有值
   * @return
   */
  <T> SELF containsNone(T... values);

  /**
   * 是否不包含所有值
   * @return
   */
  SELF containsNone(Collection<?> values);

  /**
   * 是否存在部分值
   * @return
   */
  <T> SELF hasAnyIn(T... values);

  /**
   * 是否存在部分值
   * @return
   */
  SELF hasAnyIn(Collection<?> values);

  /**
   * 是否所有值都存在
   * @return
   */
  <T> SELF isAllIn(T... values);

  /**
   * 是否所有值都存在
   * @return
   */
  SELF isAllIn(Collection<?> values);

  /**
   * 一个元素都不存在
   * @return
   */
  <T> SELF hasNoneIn(T... values);

  /**
   * 一个元素都不存在
   * @return
   */
  SELF hasNoneIn(Collection<?> values);
}
