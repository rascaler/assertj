package com.qing.assertj.core.calendar;

import com.qing.assertj.core.AbstractAssert;
import com.qing.assertj.core.Assert;


abstract class AbstractCalendarAssert<SELF extends AbstractCalendarAssert<SELF, ACTUAL>, ACTUAL extends Comparable<? super ACTUAL>>
        extends AbstractAssert<SELF, ACTUAL>
        implements Assert<SELF, ACTUAL>, CalendarAssert<SELF, ACTUAL>{

    protected String pattern;

    protected AbstractCalendarAssert(ACTUAL actual, Class<?> selfType) {
        super(actual, selfType);
    }


    @Override
    public SELF isEqualTo(ACTUAL expected) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(expected) == 0;
        return myself;
    }

    @Override
    public SELF isBefore(ACTUAL boundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(boundary) < 0;
        return myself;
    }

    @Override
    public SELF isBeforeOrEqualTo(ACTUAL boundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(boundary) <= 0;
        return myself;
    }

    @Override
    public SELF isAfter(ACTUAL boundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(boundary) > 0;
        return myself;
    }

    @Override
    public SELF isAfterOrEqualTo(ACTUAL boundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(boundary) >= 0;
        return myself;
    }

    @Override
    public SELF isBetween(ACTUAL startInclusiveBoundary, ACTUAL endInclusiveBoundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(startInclusiveBoundary) >= 0 && this.actual.compareTo(endInclusiveBoundary) <= 0;
        return myself;
    }

    @Override
    public SELF isStrictlyBetween(ACTUAL startExclusiveBoundary, ACTUAL endExclusiveBoundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(startExclusiveBoundary) > 0 && this.actual.compareTo(endExclusiveBoundary) < 0;
        return myself;
    }

    @Override
    public SELF isStartInclusiveBetween(ACTUAL startInclusiveBoundary, ACTUAL endExclusiveBoundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(startInclusiveBoundary) >= 0 && this.actual.compareTo(endExclusiveBoundary) < 0;
        return myself;
    }

    @Override
    public SELF isEndInclusiveBetween(ACTUAL startExclusiveBoundary, ACTUAL endInclusiveBoundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(startExclusiveBoundary) >= 0 && this.actual.compareTo(endInclusiveBoundary) <= 0;
        return myself;
    }
}
