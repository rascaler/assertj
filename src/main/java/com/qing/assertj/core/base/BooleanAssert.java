package com.qing.assertj.core.base;

import com.qing.assertj.core.AbstractAssert;

public class BooleanAssert extends AbstractAssert<BooleanAssert, Boolean> {

    public BooleanAssert(Boolean b, Class<?> selfType) {
        super(b, selfType);
    }

    public BooleanAssert(boolean b, Class<?> selfType) {
        super(b, selfType);
    }


    public BooleanAssert isTrue() {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual;
        return this;
    }

    public BooleanAssert isFalse() {
        if (!this.passed) {
            return myself;
        }
        this.passed = !this.actual;
        return this;
    }
}
