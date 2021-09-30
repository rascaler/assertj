package com.cybermax.assertj.core.calendar;

import com.cybermax.assertj.core.AbstractAssert;
import com.cybermax.assertj.core.Assert;


abstract class AbstractCalendarAssert<SELF extends AbstractCalendarAssert<SELF, ACTUAL>, ACTUAL extends Comparable<? super ACTUAL>>
        extends AbstractAssert<SELF, ACTUAL>
        implements Assert<SELF, ACTUAL>, CalendarAssert<SELF, ACTUAL>{

    protected String pattern;

    protected AbstractCalendarAssert(ACTUAL actual, String pattern, Class<?> selfType) {
        super(actual, selfType);
        this.pattern = pattern;
    }

    protected abstract ACTUAL parse(String dateString);

    @Override
    public SELF setPattern(String pattern) {
        this.pattern = pattern;
        return myself;
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

    @Override
    public SELF isEqualTo(String expected) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.equals(this.parse(expected));
        return myself;
    }

    @Override
    public SELF isBefore(String boundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(this.parse(boundary)) < 0;
        return myself;
    }

    @Override
    public SELF isBeforeOrEqualTo(String boundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(this.parse(boundary)) <= 0;
        return myself;
    }

    @Override
    public SELF isAfter(String boundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(this.parse(boundary)) > 0;
        return myself;
    }

    @Override
    public SELF isAfterOrEqualTo(String boundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(this.parse(boundary)) >= 0;
        return myself;
    }

    @Override
    public SELF isBetween(String startInclusiveBoundary, String endInclusiveBoundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(this.parse(startInclusiveBoundary)) >= 0
                && this.actual.compareTo(this.parse(endInclusiveBoundary)) <= 0;
        return myself;
    }

    @Override
    public SELF isStrictlyBetween(String startExclusiveBoundary, String endExclusiveBoundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(this.parse(startExclusiveBoundary)) > 0
                && this.actual.compareTo(this.parse(endExclusiveBoundary)) < 0;
        return myself;
    }


    @Override
    public SELF isStartInclusiveBetween(String startInclusiveBoundary, String endExclusiveBoundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(this.parse(startInclusiveBoundary)) >= 0
                && this.actual.compareTo(this.parse(endExclusiveBoundary)) < 0;
        return myself;
    }

    @Override
    public SELF isEndInclusiveBetween(String startExclusiveBoundary, String endInclusiveBoundary) {
        if (!this.passed) {
            return myself;
        }
        this.passed = this.actual.compareTo(this.parse(startExclusiveBoundary)) > 0
                && this.actual.compareTo(this.parse(endInclusiveBoundary)) <= 0;
        return myself;
    }

}
