package com.cybermax.assertj.core.collection;

import com.cybermax.assertj.core.AbstractSizeComparableAssert;
import org.apache.commons.collections4.CollectionUtils;
import java.util.*;

public class AbstractCollectionAssert<SELF extends AbstractCollectionAssert<SELF, ACTUAL, ELEMENT>, ACTUAL extends Collection<ELEMENT>, ELEMENT>
        extends AbstractSizeComparableAssert<SELF, ACTUAL>
        implements CollectionAssert<SELF, ACTUAL, ELEMENT> {

    protected AbstractCollectionAssert(ACTUAL actual, Class<?> selfType) {
        super(actual, selfType);
    }

    @Override
    protected int size(ACTUAL value) {
        return value.size();
    }

    @Override
    public SELF isEmpty() {
        this.passed = CollectionUtils.isEmpty(this.actual);
        return myself;
    }

    @Override
    public SELF isNotEmpty() {
        this.passed = CollectionUtils.isNotEmpty(this.actual);
        return myself;
    }

    @Override
    public SELF hasOneSize() {
        this.passed = this.actual.size() == 1;
        return myself;
    }

    @Override
    public SELF hasMoreThanOneSize() {
        this.passed = this.actual.size() > 1;
        return myself;
    }

    @Override
    public SELF containsAll(ELEMENT... values) {
        this.passed = CollectionUtils.containsAll(this.actual, Arrays.asList(values));
        return myself;
    }

    @Override
    public SELF containsAll(Collection<ELEMENT> values) {
        this.passed = CollectionUtils.containsAll(this.actual, values);
        return myself;
    }

    @Override
    public SELF containsAny(ELEMENT... values) {
        this.passed = CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public SELF containsAny(Collection<ELEMENT> values) {
        this.passed = CollectionUtils.containsAny(this.actual, values);
        return null;
    }

    @Override
    public SELF doseNotContains(ELEMENT... values) {
        this.passed = !CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

    @Override
    public SELF doseNotContains(Collection<ELEMENT> values) {
        this.passed = !CollectionUtils.containsAny(this.actual, values);
        return myself;
    }

//    @Override
//    public <T> SELF isAnyIn(T... values) {
//        CollectionUtils.containsAny()
//        for (ELEMENT e : this.actual) {
//        }
//        return null;
//    }

//    @Override
//    public SELF isAnyIn(Iterable<?> values) {
//        return null;
//    }
//
//    @Override
//    public SELF isAllIn(ELEMENT... values) {
//        return null;
//    }
//
//    @Override
//    public SELF isAllIn(Iterable<?> values) {
//        return null;
//    }
//
//    @Override
//    public SELF isNotIn(Object... values) {
//        this.passed = true;
//        for (Object value : values) {
//            if (this.actual.equals(value)) {
//                this.passed = false;
//                break;
//            }
//        }
//        return myself;
//    }
//
//    @Override
//    public SELF isNotIn(Iterable<?> values) {
//        this.passed = true;
//        for (Object value : values) {
//            if (this.actual.equals(value)) {
//                this.passed = false;
//                break;
//            }
//        }
//        return myself;
//    }

    @Override
    public SELF thenFailThrow(RuntimeException exception) {
        if (!this.passed) {
            throw exception;
        }
        return myself;
    }

    @Override
    public SELF thenFailThrow(Error error) {
        if (!this.passed) {
            throw error;
        }
        return myself;
    }


}
