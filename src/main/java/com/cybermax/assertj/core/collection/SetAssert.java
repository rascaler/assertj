package com.cybermax.assertj.core.collection;


import java.util.Set;

public class SetAssert<ELEMENT> extends AbstractCollectionAssert<SetAssert<ELEMENT>, Set<ELEMENT>, ELEMENT> {

  public SetAssert(Set<ELEMENT> elements) {
    super(elements, SetAssert.class);
  }
}
