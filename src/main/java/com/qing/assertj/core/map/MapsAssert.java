package com.qing.assertj.core.map;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Map;

public class MapsAssert<SELF extends MapsAssert<SELF, K, V>, K, V>
extends AbstractMapAssert<SELF, Map<K, V>, K, V> {

  public MapsAssert(Map<K, V> kvMap) {
    super(kvMap, MapsAssert.class);
  }

  @Override
  protected Object get(int index) {
    throw new NotImplementedException();
  }
}
