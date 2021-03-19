package com.cybermax.assertj.core.map;

import com.cybermax.assertj.core.AbstractSizeComparableAssert;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.Map;

public abstract class AbstractMapAssert<SELF extends AbstractMapAssert<SELF, ACTUAL, K, V>, ACTUAL extends Map<K, V>, K, V>
 extends AbstractSizeComparableAssert<SELF, ACTUAL>
 implements MapAssert<SELF, ACTUAL, K, V>{

    protected AbstractMapAssert(ACTUAL actual, Class<?> selfType) {
        super(actual, selfType);
    }

    @Override
    protected int size(ACTUAL value) {
        return actual.size();
    }

    @Override
    public SELF isEmpty() {
        this.passed = this.actual.isEmpty();
        return myself;
    }

    @Override
    public SELF isNotEmpty() {
        this.passed = !this.actual.isEmpty();
        return myself;
    }

    @Override
    public SELF containsKey(K key) {
        this.passed = this.actual.containsKey(key);
        return myself;
    }

    @Override
    public SELF containsKeys(K... keys) {
        this.passed = this.actual.keySet().containsAll(Arrays.asList(keys));
        return myself;
    }

    @Override
    public SELF doesNotContainKey(K key) {
        this.passed = !this.actual.containsKey(key);
        return myself;
    }

    @Override
    public SELF doesNotContainKeys(K... keys) {
        this.passed = !this.actual.keySet().containsAll(Arrays.asList(keys));
        return myself;
    }

    @Override
    public SELF containsValue(V value) {
        this.passed = this.actual.containsValue(value);
        return myself;
    }

    @Override
    public SELF containsValues(V... values) {
        this.passed = CollectionUtils.containsAll(this.actual.values(), Arrays.asList(values));
        return myself;
    }

    @Override
    public SELF doesNotContainValue(V value) {
        this.passed = !this.actual.containsValue(value);
        return myself;
    }

    @Override
    public SELF doesNotContainValues(V... values) {
        this.passed = !CollectionUtils.containsAll(this.actual.values(), Arrays.asList(values));
        return myself;
    }
}
