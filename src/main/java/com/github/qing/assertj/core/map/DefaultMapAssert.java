package com.github.qing.assertj.core.map;


import java.util.Map;

public class DefaultMapAssert<K, V>
extends AbstractMapAssert<DefaultMapAssert<K,V>, Map<K, V>, K, V> {

  public DefaultMapAssert(Map<K, V> kvMap) {
    super(kvMap, DefaultMapAssert.class);
  }
}
