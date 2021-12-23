package io.github.rascaler.assertj.core.map;

import io.github.rascaler.assertj.core.AbstractSizeComparableAssert;
import io.github.rascaler.assertj.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;
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
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = null == this.actual || this.actual.isEmpty();
        return myself;
    }

    @Override
    public SELF isNotEmpty() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = null != this.actual && !this.actual.isEmpty();
        return myself;
    }

    @Override
    public SELF containsKey(Object key) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = this.actual.containsKey(key);
        return myself;
    }

    @Override
    public final <T> SELF containsKeys(T... keys) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual.keySet(), Arrays.asList(keys));
        return myself;
    }

    @Override
    public SELF containsKeys(Collection<?> keys) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual.keySet(), keys);
        return myself;
    }

    @Override
    public SELF doesNotContainKey(Object key) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !this.actual.containsKey(key);
        return myself;
    }

    @Override
    public <T> SELF doesNotContainKeys(T... keys) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAll(this.actual.keySet(), Arrays.asList(keys));
        return myself;
    }

    @Override
    public SELF doesNotContainKeys(Collection<?> keys) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAll(this.actual.keySet(), keys);
        return myself;
    }

    @Override
    public SELF containsValue(Object value) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = this.actual.containsValue(value);
        return myself;
    }

    @Override
    public final <T> SELF containsValues(T... values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual.values(), Arrays.asList(values));
        return myself;
    }

    @Override
    public SELF containsValues(Collection<?> values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual.values(), values);
        return myself;
    }

    @Override
    public SELF doesNotContainValue(Object value) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !this.actual.containsValue(value);
        return myself;
    }

    @Override
    public <T> SELF doesNotContainValues(T... values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAll(this.actual.values(), Arrays.asList(values));
        return myself;
    }

    @Override
    public SELF doesNotContainValues(Collection<?> values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAll(this.actual.values(), values);
        return myself;
    }
}
