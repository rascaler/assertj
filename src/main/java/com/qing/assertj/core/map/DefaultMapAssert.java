package com.qing.assertj.core.map;


import java.util.Map;

public class DefaultMapAssert<SELF extends DefaultMapAssert<SELF, K, V>, K, V>
extends AbstractMapAssert<SELF, Map<K, V>, K, V> {

  public DefaultMapAssert(Map<K, V> kvMap) {
    super(kvMap, DefaultMapAssert.class);
  }
}
