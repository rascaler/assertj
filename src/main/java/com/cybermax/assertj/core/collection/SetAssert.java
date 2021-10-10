package com.cybermax.assertj.core.collection;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Set;

public class SetAssert<ELEMENT> extends AbstractCollectionAssert<SetAssert<ELEMENT>, Set<ELEMENT>, ELEMENT> {

  public SetAssert(Set<ELEMENT> elements) {
    super(elements, SetAssert.class);
  }

  @Override
  protected Object get(int index) {
    throw new NotImplementedException();
  }
}
