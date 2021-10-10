package com.cybermax.assertj.core.collection;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class ListAssert<ELEMENT> extends AbstractCollectionAssert<ListAssert<ELEMENT>, List<ELEMENT>, ELEMENT> {

  public ListAssert(List<ELEMENT> elements) {
    super(elements, ListAssert.class);
  }

  @Override
  protected Object get(int index) {
    throw new NotImplementedException();
  }
}
