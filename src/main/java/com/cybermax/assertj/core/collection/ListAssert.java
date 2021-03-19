package com.cybermax.assertj.core.collection;


import java.util.List;

public class ListAssert<ELEMENT> extends AbstractCollectionAssert<ListAssert<ELEMENT>, List<ELEMENT>, ELEMENT> {

  public ListAssert(List<ELEMENT> elements) {
    super(elements, ListAssert.class);
  }
}
