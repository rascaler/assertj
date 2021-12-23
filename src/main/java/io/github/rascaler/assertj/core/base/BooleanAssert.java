package io.github.rascaler.assertj.core.base;

import io.github.rascaler.assertj.core.AbstractAssert;

public class BooleanAssert extends AbstractAssert<BooleanAssert, Boolean> {

    public BooleanAssert(Boolean b) {
        super(b, BooleanAssert.class);
    }

    public BooleanAssert(boolean b) {
        super(b, BooleanAssert.class);
    }


    public BooleanAssert isTrue() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = this.actual;
        return this;
    }

    public BooleanAssert isFalse() {
        if (this.passed) {
            return myself;
        }
        this.passed = !this.actual;
        return this;
    }
}
