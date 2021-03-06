package io.github.rascaler.assertj.core.collection;

import io.github.rascaler.assertj.core.AbstractSizeComparableAssert;
import io.github.rascaler.assertj.util.CollectionUtils;

import java.util.*;

public abstract class AbstractCollectionAssert<SELF extends AbstractCollectionAssert<SELF, ACTUAL>, ACTUAL extends Collection<?>>
        extends AbstractSizeComparableAssert<SELF, ACTUAL>
        implements CollectionAssert<SELF, ACTUAL> {

    protected AbstractCollectionAssert(ACTUAL actual, Class<?> selfType) {
        super(actual, selfType);
    }

    @Override
    protected int size() {
        return this.actual.size();
    }

    protected abstract Object get(int index);

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
    public SELF hasEmptyElement() {
        if (!this.passed) {
            return myself;
        }
        for (Object obj : this.actual) {
            if (null == obj) {
                this.passed = true;
                return myself;
            }
        }
        this.passed = false;
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
    public <T> SELF containsAll(T... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual, Arrays.asList(values));
        return myself;
    }

    @Override
    public SELF containsAll(Collection<?> values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual, values);
        return myself;
    }

    @Override
    public <T> SELF containsAny(T... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public SELF containsAny(Collection<?> values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public <T> SELF containsNone(T... values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public SELF containsNone(Collection<?> values) {
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
    public SELF hasAnyIn(Collection<?> values) {
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
    public SELF isAllIn(Collection<?> values) {
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
    public SELF hasNoneIn(Collection<?> values) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAny(values, this.actual);
        return myself;
    }
}
