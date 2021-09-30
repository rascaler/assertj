package com.cybermax.assertj.core.base;

import com.cybermax.assertj.core.AbstractAssert;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class StringAssert extends AbstractAssert<StringAssert, String> {

    public StringAssert(String b, Class<?> selfType) {
        super(b, selfType);
    }

    public StringAssert isEmpty() {
        if (!this.passed) {
            return myself;
        }
        this.passed = StringUtils.isEmpty(this.actual);
        return myself;
    }

    public StringAssert isNotEmpty() {
        if (!this.passed) {
            return myself;
        }
        this.passed = StringUtils.isNotEmpty(this.actual);
        return myself;
    }

    public StringAssert isBlank() {
        if (!this.passed) {
            return myself;
        }
        this.passed = StringUtils.isBlank(this.actual);
        return myself;
    }

    public StringAssert isNotBlank() {
        if (!this.passed) {
            return myself;
        }
        this.passed = StringUtils.isNotBlank(this.actual);
        return myself;
    }

    public StringAssert startsWith(String prefix) {
        if (!this.passed) {
            return myself;
        }
        this.passed = StringUtils.startsWith(this.actual, prefix);
        return myself;
    }

    public StringAssert doseNotStartsWith(String prefix) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !StringUtils.startsWith(this.actual, prefix);
        return myself;
    }

    public StringAssert endsWith(String suffix) {
        if (!this.passed) {
            return myself;
        }
        this.passed = StringUtils.endsWith(this.actual, suffix);
        return myself;
    }

    public StringAssert doseNotEndsWith(String suffix) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !StringUtils.endsWith(this.actual, suffix);
        return myself;
    }

    public StringAssert contains(String searchStr) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.contains(searchStr);
        return myself;
    }

    public StringAssert doseNotContains(String searchStr) {
        if (!this.passed) {
            return myself;
        }
        this.passed = !this.actual.contains(searchStr);
        return myself;
    }

    public StringAssert isAllLowerCase() {
        if (!this.passed) {
            return myself;
        }
        this.passed = StringUtils.isAllLowerCase(this.actual);
        return myself;
    }

    public StringAssert isAllUpperCase() {
        if (!this.passed) {
            return myself;
        }
        this.passed = StringUtils.isAllUpperCase(this.actual);
        return myself;
    }

    public StringAssert isNumberCreatable() {
        if (!this.passed) {
            return myself;
        }
        this.passed = NumberUtils.isCreatable(this.actual);
        return myself;
    }

}
