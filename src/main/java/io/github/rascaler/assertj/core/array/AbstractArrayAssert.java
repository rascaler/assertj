package io.github.rascaler.assertj.core.array;

import io.github.rascaler.assertj.core.AbstractSizeComparableAssert;
import io.github.rascaler.assertj.util.ArrayUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract  class AbstractArrayAssert<SELF extends AbstractArrayAssert<SELF, ACTUAL>, ACTUAL> extends AbstractSizeComparableAssert<SELF, ACTUAL>
implements ArrayAssert<SELF, ACTUAL> {


  protected AbstractArrayAssert(ACTUAL actual, Class<?> selfType) {
    super(actual, selfType);
  }

  protected abstract Object get(int index);

  @Override
  public SELF isEmpty() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = null == this.actual || this.size() == 0;
    return myself;
  }

  @Override
  public SELF isNotEmpty() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = null != this.actual && this.size() > 0;
    return myself;
  }

  @Override
  public SELF hasEmptyElement() {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    for (int i = 0; i < this.size(); i++) {
      if (null == get(i)) {
        this.passed = true;
        return myself;
      }
    }
    this.passed = false;
    return myself;
  }

  @Override
  public <T> SELF containsAll(T... values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
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
      for (int i = 0; i < this.size(); i++) {
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
  public  SELF containsAll(Collection<?> values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    if (values.isEmpty()) {
      this.passed = true;
      return myself;
    }

    final Set<Object> elementsAlreadySeen = new HashSet<>();
    for (final Object nextElement : values) {
      if (elementsAlreadySeen.contains(nextElement)) {
        continue;
      }

      boolean foundCurrentElement = false;
      for (int i = 0; i < this.size(); i++) {
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
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    if (this.size() < values.length) {
       if (anyIn(values)) {
         this.passed = true;
         return myself;
       }
    } else {
      for (final Object el2 : values) {
        if (contains(el2)) {
          this.passed = true;
          return myself;
        }
      }
    }
    this.passed = false;
    return myself;
  }

  @Override
  public SELF containsAny(Collection<?> values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    if (this.size() < values.size()) {
      if (this.anyIn(values)) {
        this.passed = true;
        return myself;
      }
    } else {
      for (final Object aColl2 : values) {
        if (this.contains(aColl2)) {
          this.passed = true;
          return myself;
        }
      }
    }
    this.passed = false;
    return myself;
  }

  @Override
  public <T> SELF containsNone(T... values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    if (this.size() < values.length) {
      if (this.anyIn(values)) {
        this.passed = false;
        return myself;
      }
    } else {
      for (final Object aColl2 : values) {
        if (contains(aColl2)) {
          this.passed = false;
          return myself;
        }
      }
    }
    this.passed = true;
    return myself;
  }

  @Override
  public SELF containsNone(Collection<?> values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    if (this.size() < values.size()) {
      if (this.anyIn(values)) {
        this.passed = false;
        return myself;
      }
    } else {
      for (final Object aColl2 : values) {
        if (this.contains(aColl2)) {
          this.passed = false;
          return myself;
        }
      }
    }
    this.passed = true;
    return myself;
  }

  @Override
  public <T> SELF hasAnyIn(T... values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = this.anyIn(values);
    return myself;
  }

  @Override
  public  SELF hasAnyIn(Collection<?> values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = anyIn(values);
    return myself;
  }

  @Override
  public <T> SELF isAllIn(T... values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    if (null == this.actual || this.size() == 0) {
      this.passed = true;
      return myself;
    }
    final Set<Object> elementsAlreadySeen = new HashSet<>();
    for (int i = 0; i < this.size(); i++) {
      final Object nextElement = get(i);
      if (elementsAlreadySeen.contains(nextElement)) {
        continue;
      }
      boolean foundCurrentElement = false;
      for (final Object p : values) {
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
  public SELF isAllIn(Collection<?> values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    if (null == this.actual || this.size() == 0) {
      this.passed = true;
      return myself;
    }
    final Set<Object> elementsAlreadySeen = new HashSet<>();
    for (int i = 0; i < this.size(); i++) {
      final Object nextElement = get(i);
      if (elementsAlreadySeen.contains(nextElement)) {
        continue;
      }
      boolean foundCurrentElement = false;
      for (final Object p : values) {
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
  public <T> SELF hasNoneIn(T... values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = !this.anyIn(values);
    return myself;
  }

  @Override
  public SELF hasNoneIn(Collection<?> values) {
    this.validated = true;
    if (this.passed) {
      return myself;
    }
    this.passed = !this.anyIn(values);
    return myself;
  }

  protected boolean contains(Object valueToFind) {
    for (int i = 0; i < this.size(); i++) {
      Object nextValue = get(i);
      if (nextValue.equals(valueToFind)) {
        return true;
      }
    }
    return false;
  }

  protected boolean anyIn(Collection<?> values) {
    for (int i = 0; i < this.size(); i++) {
      Object nextValue = get(i);
      if (values.contains(nextValue)) {
        return true;
      }
    }
    return false;
  }

  protected <T> boolean anyIn(T... values) {
    for (int i = 0; i < this.size(); i++) {
      Object nextValue = get(i);
      if (ArrayUtils.contains(values, nextValue)) {
        return true;
      }
    }
    return false;
  }


}
