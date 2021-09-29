package com.cybermax.assertj.core.collection;

import com.cybermax.assertj.core.SizeComparableAssert;

import java.util.Collection;

public interface CollectionAssert<SELF extends CollectionAssert<SELF, ACTUAL, ELEMENT>, ACTUAL extends Collection<ELEMENT>, ELEMENT>
extends SizeComparableAssert<SELF, ACTUAL> {

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
   * 是否包含所有值
   * @return
   */
  SELF containsAll(ELEMENT... values);

  /**
   * 是否包含所有值
   * @return
   */
  SELF containsAll(Collection<ELEMENT> values);

  /**
   * 是否包含某值
   * @return
   */
  SELF containsAny(ELEMENT... values);

  /**
   * 是否包含某值
   * @return
   */
  SELF containsAny(Collection<ELEMENT> values);

  /**
   * 是否不包含所有值
   * @return
   */
  SELF doseNotContains(ELEMENT... values);

  /**
   * 是否不包含所有值
   * @return
   */
  SELF doseNotContains(Collection<ELEMENT> values);

  /**
   * 是否存在部分值
   * @return
   */
  <T> SELF hasAnyIn(T... values);

  /**
   * 是否存在部分值
   * @return
   */
  SELF hasAnyIn(Collection<ELEMENT> values);

  /**
   * 是否所有值都存在
   * @return
   */
  <T> SELF isAllIn(T... values);

  /**
   * 是否所有值都存在
   * @return
   */
  SELF isAllIn(Collection<ELEMENT> values);

  /**
   * 一个元素都不存在
   * @return
   */
  <T> SELF hasNoneIn(T... values);

  /**
   * 一个元素都不存在
   * @return
   */
  SELF hasNoneIn(Collection<ELEMENT> values);
}
