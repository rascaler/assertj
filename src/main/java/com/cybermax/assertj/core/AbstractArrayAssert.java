package com.cybermax.assertj.core;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract  class AbstractArrayAssert<SELF extends AbstractArrayAssert<SELF, ACTUAL>, ACTUAL> extends AbstractSizeComparableAssert<SELF, ACTUAL>
implements ArrayAssert<SELF, ACTUAL> {


  protected AbstractArrayAssert(ACTUAL actual, Class<?> selfType) {
    super(actual, selfType);
  }


  @Override
  public SELF isEmpty() {
    if (!this.passed) {
      return myself;
    }
    this.passed = null == this.actual || size() == 0;
    return myself;
  }

  @Override
  public SELF isNotEmpty() {
    if (!this.passed) {
      return myself;
    }
    this.passed = null != this.actual && size() > 0;
    return myself;
  }

  @Override
  public <T> SELF containsAll(T... values) {
    if (null == values || values.length == 0) {
      this.passed = true;
      return myself;
    }
    final Set<Object> elementsAlreadySeen = new HashSet<>();
    for (final Object nextElement : values) {
      if (elementsAlreadySeen.contains(nextElement)) {
        continue;
      }

      boolean foundCurrentElement = false;
      for (int i = 0; i < size(); i++) {
        final Object p = get(i);
        elementsAlreadySeen.add(p);
        if (nextElement == null ? p == null : nextElement.equals(p)) {
          foundCurrentElement = true;
          break;
        }
      }

      if (!foundCurrentElement) {
        this.passed = false;
        return myself;
      }
    }

    this.passed = true;
    return myself;
  }

  @Override
  public <T> SELF containsAll(Collection<T> values) {
    if (values.isEmpty()
    ) {
      this.passed = true;
      return myself;
    }

    final Set<Object> elementsAlreadySeen = new HashSet<>();
    for (final Object nextElement : values) {
      if (elementsAlreadySeen.contains(nextElement)) {
        continue;
      }

      boolean foundCurrentElement = false;
      for (int i = 0; i < size(); i++) {
        final Object p = get(i);
        elementsAlreadySeen.add(p);
        if (nextElement == null ? p == null : nextElement.equals(p)) {
          foundCurrentElement = true;
          break;
        }
      }

      if (!foundCurrentElement) {
        this.passed = false;
        return myself;
      }
    }
    this.passed = true;
    return myself;
  }

  @Override
  public <T> SELF containsAny(T... values) {
    if (size() < values.length) {
      for (int i=0;i< size();i++) {
        Object aColl1 = get(i);
        if (ArrayUtils.contains(values, aColl1)) {
          this.passed = true;
          return myself;
        }
      }
    } else {
      for (final Object aColl2 : values) {
        for (int i=0;i< size();i++) {
          Object aColl1 = get(i);
          if (aColl1.equals(aColl2)) {
            this.passed = true;
            return myself;
          }
        }
      }
    }
    this.passed = false;
    return myself;
  }

  @Override
  public <T> SELF containsAny(Collection<T> values) {
    if (size() < values.size()) {
      for (int i=0;i< size();i++) {
        Object aColl1 = get(i);
        if (values.contains(aColl1)) {
          this.passed = true;
          return myself;
        }
      }
    } else {
      for (final Object aColl2 : values) {
        for (int i=0;i< size();i++) {
          Object aColl1 = get(i);
          if (aColl1.equals(aColl2)) {
            this.passed = true;
            return myself;
          }
        }
      }
    }
    this.passed = false;
    return myself;
  }

  @Override
  public <T> SELF doseNotContains(T... values) {
    if (values.length > size()) {
      this.passed = true;
      return myself;
    }

    return myself;
  }

  @Override
  public <T> SELF doseNotContains(Collection<T> values) {
    if (values.size() > size()) {
      this.passed = true;
      return myself;
    }
    return myself;
  }

  @Override
  public <T> SELF hasAnyIn(T... values) {
    return null;
  }

  @Override
  public <T> SELF hasAnyIn(Collection<T> values) {
    return null;
  }

  @Override
  public <T> SELF isAllIn(T... values) {
    return null;
  }

  @Override
  public <T> SELF isAllIn(Collection<T> values) {
    return null;
  }

  @Override
  public <T> SELF hasNoneIn(T... values) {
    return null;
  }

  @Override
  public <T> SELF hasNoneIn(Collection<T> values) {
    return null;
  }
}
