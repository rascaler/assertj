package com.cybermax.assertj.core.base;

import com.cybermax.assertj.core.AbstractAssert;

public class BooleanAssert extends AbstractAssert<BooleanAssert, Boolean> {

    public BooleanAssert(Boolean b, Class<?> selfType) {
        super(b, selfType);
    }

    public BooleanAssert(boolean b, Class<?> selfType) {
        super(b, selfType);
    }


    public BooleanAssert isTrue() {
        this.passed = this.actual;
        return this;
    }

    public BooleanAssert isFalse() {
        this.passed = !this.actual;
        return this;
    }
}
