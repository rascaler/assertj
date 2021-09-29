package com.cybermax.assertj.core.map;

import com.cybermax.assertj.core.Assert;

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
    SELF containsKey(K key);

    /**
     * 是否含有key列表
     * @return
     */
    SELF containsKeys(K... keys);

    /**
     * 是否不含有key列表
     * @return
     */
    SELF doesNotContainKey(K key);

    /**
     * 是否不含有key列表
     * @return
     */
    SELF doesNotContainKeys(K... key);

    /**
     * 是否含有值
     * @return
     */
    SELF containsValue(V value);

    /**
     * 是否含有值列表
     * @return
     */
    SELF containsValues(V... values);

    /**
     * 是否不含有值
     * @return
     */
    SELF doesNotContainValue(V value);

    /**
     * 是否不含有值列表
     * @return
     */
    SELF doesNotContainValues(V... values);

}
