package com.cybermax.assertj.core;

public interface ComparableAssert<SELF extends ComparableAssert<SELF, ACTUAL>,  ACTUAL extends Comparable<? super ACTUAL>> {

  SELF isLessThan(ACTUAL other);

  SELF isLessThanOrEqualTo(ACTUAL other);

  SELF isGreaterThan(ACTUAL other);

  SELF isGreaterThanOrEqualTo(ACTUAL other);

  SELF isBetween(ACTUAL startInclusive, ACTUAL endInclusive);

  SELF isStrictlyBetween(ACTUAL startExclusive, ACTUAL endExclusive);

  SELF isStartInclusiveBetween(ACTUAL startInclusive, ACTUAL endExclusive);

  SELF isEndInclusiveBetween(ACTUAL startExclusive, ACTUAL endInclusive);
}
