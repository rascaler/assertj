package com.qing.assertj.core.collection;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

public class DefaultCollectionAssert extends AbstractCollectionAssert<DefaultCollectionAssert, Collection<?>> {

//  public ListAssert(List<ELEMENT> elements) {
//    super(elements, ListAssert.class);
//  }
//
//  public ListAssert(Set<ELEMENT> elements) {
//    super(elements, ListAssert.class);
//  }

  public DefaultCollectionAssert(Collection<?> elements) {
    super(elements, DefaultCollectionAssert.class);
  }

  @Override
  protected Object get(int index) {
    throw new NotImplementedException();
  }
}
