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
		this.validated = true;
		if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.isEmpty(this.actual);
        return myself;
    }

    @Override
    public SELF isNotEmpty() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.isNotEmpty(this.actual);
        return myself;
    }

    @Override
    public SELF hasEmptyElement() {
        this.validated = true;
        if (this.passed) {
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
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = this.actual.size() == 1;
        return myself;
    }

    @Override
    public SELF hasMoreThanOneSize() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = this.actual.size() > 1;
        return myself;
    }

    @Override
    public <T> SELF containsAll(T... values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual, Arrays.asList(values));
        return myself;
    }

    @Override
    public SELF containsAll(Collection<?> values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(this.actual, values);
        return myself;
    }

    @Override
    public <T> SELF containsAny(T... values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public SELF containsAny(Collection<?> values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public <T> SELF containsNone(T... values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public SELF containsNone(Collection<?> values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public <T> SELF hasAnyIn(T... values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAny(Arrays.asList(values), this.actual);
        return myself;
    }

    @Override
    public SELF hasAnyIn(Collection<?> values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAny(values, this.actual);
        return myself;
    }

    @Override
    public <T> SELF isAllIn(T... values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(Arrays.asList(values), this.actual);
        return myself;
    }

    @Override
    public SELF isAllIn(Collection<?> values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = CollectionUtils.containsAll(values, this.actual);
        return myself;
    }

    @Override
    public <T> SELF hasNoneIn(T... values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAny(Arrays.asList(values), this.actual);
        return myself;
    }

    @Override
    public SELF hasNoneIn(Collection<?> values) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !CollectionUtils.containsAny(values, this.actual);
        return myself;
    }
}
