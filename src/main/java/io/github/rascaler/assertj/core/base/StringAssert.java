package io.github.rascaler.assertj.core.base;

import io.github.rascaler.assertj.core.AbstractAssert;
import io.github.rascaler.assertj.util.NumberUtils;
import io.github.rascaler.assertj.util.StringUtils;

public class StringAssert extends AbstractAssert<StringAssert, String> {

    public StringAssert(String b) {
        super(b, StringAssert.class);
    }

    public StringAssert isEmpty() {
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isEmpty(this.actual);
        return myself;
    }

    public StringAssert isNotEmpty() {
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isNotEmpty(this.actual);
        return myself;
    }

    public StringAssert isBlank() {
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isBlank(this.actual);
        return myself;
    }

    public StringAssert isNotBlank() {
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isNotBlank(this.actual);
        return myself;
    }

    public StringAssert startsWith(String prefix) {
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.startsWith(this.actual, prefix);
        return myself;
    }

    public StringAssert doseNotStartWith(String prefix) {
        if (this.passed) {
            return myself;
        }
        this.passed = !StringUtils.startsWith(this.actual, prefix);
        return myself;
    }

    public StringAssert endsWith(String suffix) {
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.endsWith(this.actual, suffix);
        return myself;
    }

    public StringAssert doesNotEndWith(String suffix) {
        if (this.passed) {
            return myself;
        }
        this.passed = !StringUtils.endsWith(this.actual, suffix);
        return myself;
    }

    public StringAssert contains(String searchStr) {
        if (this.passed) {
            return myself;
        }
        this.passed = this.actual.contains(searchStr);
        return myself;
    }

    public StringAssert doesNotContain(String searchStr) {
        if (this.passed) {
            return myself;
        }
        this.passed = !this.actual.contains(searchStr);
        return myself;
    }

    public StringAssert isAllLowerCase() {
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isAllLowerCase(this.actual);
        return myself;
    }

    public StringAssert isAllUpperCase() {
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isAllUpperCase(this.actual);
        return myself;
    }

    public StringAssert isNumberCreatable() {
        if (this.passed) {
            return myself;
        }
        this.passed = NumberUtils.isCreatable(this.actual);
        return myself;
    }

}
