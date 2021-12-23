package io.github.rascaler.assertj.core.base;

import io.github.rascaler.assertj.core.AbstractAssert;
import io.github.rascaler.assertj.util.NumberUtils;
import io.github.rascaler.assertj.util.StringUtils;

public class StringAssert extends AbstractAssert<StringAssert, String> {

    public StringAssert(String b) {
        super(b, StringAssert.class);
    }

    public StringAssert isEmpty() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isEmpty(this.actual);
        return myself;
    }

    public StringAssert isNotEmpty() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isNotEmpty(this.actual);
        return myself;
    }

    public StringAssert isBlank() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isBlank(this.actual);
        return myself;
    }

    public StringAssert isNotBlank() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isNotBlank(this.actual);
        return myself;
    }

    public StringAssert startsWith(String prefix) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.startsWith(this.actual, prefix);
        return myself;
    }

    public StringAssert doseNotStartWith(String prefix) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !StringUtils.startsWith(this.actual, prefix);
        return myself;
    }

    public StringAssert endsWith(String suffix) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.endsWith(this.actual, suffix);
        return myself;
    }

    public StringAssert doesNotEndWith(String suffix) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !StringUtils.endsWith(this.actual, suffix);
        return myself;
    }

    public StringAssert contains(String searchStr) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = this.actual.contains(searchStr);
        return myself;
    }

    public StringAssert doesNotContain(String searchStr) {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = !this.actual.contains(searchStr);
        return myself;
    }

    public StringAssert isAllLowerCase() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isAllLowerCase(this.actual);
        return myself;
    }

    public StringAssert isAllUpperCase() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = StringUtils.isAllUpperCase(this.actual);
        return myself;
    }

    public StringAssert isNumberCreatable() {
        this.validated = true;
        if (this.passed) {
            return myself;
        }
        this.passed = NumberUtils.isCreatable(this.actual);
        return myself;
    }

}
