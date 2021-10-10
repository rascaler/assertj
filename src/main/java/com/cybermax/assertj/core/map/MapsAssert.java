package com.cybermax.assertj.core.map;


import com.cybermax.assertj.core.Assert;
import com.cybermax.assertj.core.collection.AbstractCollectionAssert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;

public class MapsAssert<SELF extends MapsAssert<SELF, K, V>, K, V>
extends AbstractMapAssert<SELF, Map<K, V>, K, V> {

  public MapsAssert(Map<K, V> kvMap, Class<?> selfType) {
    super(kvMap, selfType);
  }

  @Override
  protected Object get(int index) {
    throw new NotImplementedException();
  }
}
