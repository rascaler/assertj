package com.cybermax.assertj.core.map;

import com.cybermax.assertj.core.Assert;

import java.util.Map;

public interface MapAssert<SELF extends MapAssert<SELF, ACTUAL, K, V>, ACTUAL extends Map<K, V>, K, V> extends Assert<SELF, ACTUAL> {

    SELF isEmpty();

    SELF isNotEmpty();

    SELF containsKey(K key);

    SELF containsKeys(K... keys);

    SELF doesNotContainKey(K key);

    SELF doesNotContainKeys(K... key);

    SELF containsValue(V value);

    SELF containsValues(V... values);

    SELF doesNotContainValue(V value);

    SELF doesNotContainValues(V... values);

}
