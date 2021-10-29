package com.qing.assertj;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        boolean result = false;
//        result = CollectionUtils.containsAll(Arrays.asList(1,2),Arrays.asList(1));
        result = CollectionUtils.containsAny(Arrays.asList(1,2),Arrays.asList(1,3));
        System.out.println(result);
        Map map = new HashMap();
        map.put("a", 1);
        map.put("b", 2);
        List<String> list = new ArrayList<>();
        list.add("a");
        result = CollectionUtils.containsAll(map.keySet(),Arrays.asList("a"));
        Assertions.assertThat(list).isSizeEqualTo(1).thenFailThrow(new RuntimeException(""));



    }
}
