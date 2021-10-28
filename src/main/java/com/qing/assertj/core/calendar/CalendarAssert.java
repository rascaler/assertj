package com.qing.assertj.core.calendar;


public interface CalendarAssert<SELF extends CalendarAssert<SELF, ACTUAL>, ACTUAL extends Comparable<? super ACTUAL>> {

    SELF isEqualTo(ACTUAL expected);

    SELF isBefore(ACTUAL boundary);

    SELF isBeforeOrEqualTo(ACTUAL boundary);

    SELF isAfter(ACTUAL boundary);

    SELF isAfterOrEqualTo(ACTUAL boundary);

    SELF isBetween(ACTUAL startInclusiveBoundary, ACTUAL endInclusiveBoundary);

    SELF isStrictlyBetween(ACTUAL startExclusiveBoundary, ACTUAL endExclusiveBoundary);

    SELF isStartInclusiveBetween(ACTUAL startInclusiveBoundary, ACTUAL endExclusiveBoundary);

    SELF isEndInclusiveBetween(ACTUAL startExclusiveBoundary, ACTUAL endInclusiveBoundary);

}
