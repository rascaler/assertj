package com.qing.assertj;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        boolean result = false;
//        result = CollectionUtils.containsAll(Arrays.asList(1,2),Arrays.asList(1));
        result = CollectionUtils.containsAny(Arrays.asList(1,2),Arrays.asList(1,3));
        System.out.println(result);
    }
}
