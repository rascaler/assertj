package com.qing.assertj.core.map;

import com.qing.assertj.core.AbstractSizeComparableAssert;
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
    protected int size() {
        return actual.size();
    }

    @Override
    public SELF isEmpty() {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.isEmpty();
        return myself;
    }

    @Override
    public SELF isNotEmpty() {
        if (!this.passed) {
            return myself;
        }
        this.passed = !this.actual.isEmpty();
        return myself;
    }

    @Override
    public SELF containsKey(K key) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.containsKey(key);
        return myself;
    }

    @Override
    public SELF containsKeys(K... keys) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.keySet().containsAll(Arrays.asList(keys));
        return myself;
    }

    @Override
    public SELF doesNotContainKey(K key) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !this.actual.containsKey(key);
        return myself;
    }

    @Override
    public SELF doesNotContainKeys(K... keys) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !this.actual.keySet().containsAll(Arrays.asList(keys));
        return myself;
    }

    @Override
    public SELF containsValue(V value) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.containsValue(value);
        return myself;
    }

    @Override
    public SELF containsValues(V... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual.values(), Arrays.asList(values));
        return myself;
    }

    @Override
    public SELF doesNotContainValue(V value) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !this.actual.containsValue(value);
        return myself;
    }

    @Override
    public SELF doesNotContainValues(V... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAll(this.actual.values(), Arrays.asList(values));
        return myself;
    }
}
