package com.cybermax.assertj.core.collection;

import com.cybermax.assertj.core.AbstractSizeComparableAssert;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public abstract class AbstractCollectionAssert<SELF extends AbstractCollectionAssert<SELF, ACTUAL, ELEMENT>, ACTUAL extends Collection<ELEMENT>, ELEMENT>
        extends AbstractSizeComparableAssert<SELF, ACTUAL>
        implements CollectionAssert<SELF, ACTUAL, ELEMENT> {

    protected AbstractCollectionAssert(ACTUAL actual, Class<?> selfType) {
        super(actual, selfType);
    }

    @Override
    protected int size() {
        return this.actual.size();
    }

    @Override
    public SELF isEmpty() {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.isEmpty(this.actual);
        return myself;
    }

    @Override
    public SELF isNotEmpty() {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.isNotEmpty(this.actual);
        return myself;
    }

    @Override
    public SELF hasOneSize() {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.size() == 1;
        return myself;
    }

    @Override
    public SELF hasMoreThanOneSize() {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.size() > 1;
        return myself;
    }

    @Override
    public SELF containsAll(ELEMENT... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual, Arrays.asList(values));
        return myself;
    }

    @Override
    public SELF containsAll(Collection<ELEMENT> values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual, values);
        return myself;
    }

    @Override
    public SELF containsAny(ELEMENT... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public SELF containsAny(Collection<ELEMENT> values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public SELF doseNotContains(ELEMENT... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public SELF doseNotContains(Collection<ELEMENT> values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public <T> SELF hasAnyIn(T... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAny(Arrays.asList(values), this.actual);
        return myself;
    }

    @Override
    public SELF hasAnyIn(Collection<ELEMENT> values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAny(values, this.actual);
        return myself;
    }

    @Override
    public <T> SELF isAllIn(T... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(Arrays.asList(values), this.actual);
        return myself;
    }

    @Override
    public SELF isAllIn(Collection<ELEMENT> values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(values, this.actual);
        return myself;
    }

    @Override
    public <T> SELF hasNoneIn(T... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAny(Arrays.asList(values), this.actual);
        return myself;
    }

    @Override
    public SELF hasNoneIn(Collection<ELEMENT> values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAny(values, this.actual);
        return myself;
    }
}
