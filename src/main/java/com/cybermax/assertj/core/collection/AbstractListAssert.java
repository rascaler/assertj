package com.cybermax.assertj.core.collection;


import java.util.List;

public class AbstractListAssert<ELEMENT> extends AbstractCollectionAssert<AbstractListAssert<ELEMENT>, List<ELEMENT>, ELEMENT> {

  protected AbstractListAssert(List<ELEMENT> elements, Class<?> selfType) {
    super(elements, selfType);
  }
}
