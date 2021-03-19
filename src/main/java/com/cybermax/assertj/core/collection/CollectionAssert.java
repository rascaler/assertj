package com.cybermax.assertj.core.collection;

import com.cybermax.assertj.core.SizeComparableAssert;

import java.util.Collection;

public interface CollectionAssert<SELF extends CollectionAssert<SELF, ACTUAL, ELEMENT>, ACTUAL extends Collection<ELEMENT>, ELEMENT>
extends SizeComparableAssert<SELF, ACTUAL> {

  SELF isEmpty();

  SELF isNotEmpty();

  SELF containsAll(ELEMENT... values);

  SELF containsAll(Collection<ELEMENT> values);

  SELF containsAny(ELEMENT... values);

  SELF containsAny(Collection<ELEMENT> values);

  SELF doseNotContains(ELEMENT... values);

  SELF doseNotContains(Collection<ELEMENT> values);

//  <T> SELF isAnyIn(T... values);
//
//  SELF isAnyIn(Iterable<?> values);
//
//  <T> SELF isAllIn(T... values);
//
//  SELF isAllIn(Iterable<?> values);
//
//  SELF isNotIn(ELEMENT... values);
//
//  SELF isNotIn(Iterable<?> values);
}
