package com.cybermax.assertj.core.calendar;


public interface CalendarAssert<SELF extends CalendarAssert<SELF, ACTUAL>, ACTUAL extends Comparable<? super ACTUAL>> {

    SELF setPattern(String pattern);

    SELF isEqualTo(String expected);

    SELF isEqualTo(ACTUAL expected);

    SELF isBefore(ACTUAL boundary);

    SELF isBefore(String boundary);

    SELF isBeforeOrEqualTo(ACTUAL boundary);

    SELF isBeforeOrEqualTo(String boundary);

    SELF isAfter(ACTUAL boundary);

    SELF isAfter(String boundary);

    SELF isAfterOrEqualTo(ACTUAL boundary);

    SELF isAfterOrEqualTo(String boundary);

    SELF isBetween(ACTUAL startInclusiveBoundary, ACTUAL endInclusiveBoundary);

    SELF isBetween(String startInclusiveBoundary, String endInclusiveBoundary);

    SELF isStrictlyBetween(ACTUAL startExclusiveBoundary, ACTUAL endExclusiveBoundary);

    SELF isStrictlyBetween(String startExclusiveBoundary, String endExclusiveBoundary);

    SELF isStartInclusiveBetween(ACTUAL startInclusiveBoundary, ACTUAL endExclusiveBoundary);

    SELF isStartInclusiveBetween(String startInclusiveBoundary, String endExclusiveBoundary);

    SELF isEndInclusiveBetween(ACTUAL startExclusiveBoundary, ACTUAL endInclusiveBoundary);

    SELF isEndInclusiveBetween(String startExclusiveBoundary, String endInclusiveBoundary);

}
