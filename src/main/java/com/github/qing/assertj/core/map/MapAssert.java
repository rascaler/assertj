package com.github.qing.assertj.core.map;

import com.github.qing.assertj.core.Assert;

import java.util.Collection;
import java.util.Map;

public interface MapAssert<SELF extends MapAssert<SELF, ACTUAL, K, V>, ACTUAL extends Map<K, V>, K, V> extends Assert<SELF, ACTUAL> {

    /**
     * map是否为空
     * @return
     */
    SELF isEmpty();

    /**
     * map是否不为空
     * @return
     */
    SELF isNotEmpty();

    /**
     * 是否含有key
     * @return
     */
    SELF containsKey(Object key);

    /**
     * 是否含有key列表
     * @return
     */
    <T> SELF containsKeys(T... keys);

    /**
     * 是否含有key列表
     * @return
     */
    SELF containsKeys(Collection<?> keys);

    /**
     * 是否不含有key列表
     * @return
     */
    SELF doesNotContainKey(Object key);

    /**
     * 是否不含有key列表
     * @return
     */
    <T> SELF doesNotContainKeys(T... keys);

    /**
     * 是否不含有key列表
     * @return
     */
    SELF doesNotContainKeys(Collection<?> keys);

    /**
     * 是否含有值
     * @return
     */
    SELF containsValue(Object value);

    /**
     * 是否含有值列表
     * @return
     */
    <T> SELF containsValues(T... values);

    /**
     * 是否含有值列表
     * @return
     */
    SELF containsValues(Collection<?> values);

    /**
     * 是否不含有值
     * @return
     */
    SELF doesNotContainValue(Object value);

    /**
     * 是否不含有值列表
     * @return
     */
    <T> SELF doesNotContainValues(T... values);

    /**
     * 是否不含有值列表
     * @return
     */
    SELF doesNotContainValues(Collection<?> values);

}
