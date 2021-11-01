package com.github.qing.assertj.example;

import org.apache.commons.collections4.MapUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.github.qing.assertj.Assertions.assertThat;

public class MapExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        Map<String, Integer> actual = new HashMap<>();
        actual.put("test", 1);
        actual.put("test1", 2);
        List<String> expectKeys = new ArrayList<>();
        expectKeys.add("test");
        expectKeys.add("test2");
        List<Integer> expectValues = new ArrayList<>();
        expectValues.add(1);
        expectValues.add(3);
        assertThat(actual).isNull().thenFailThrow(exception);
        assertThat(actual).isNotNull().thenFailThrow(exception);
        assertThat(actual).isEqualTo(1).thenFailThrow(exception);
        assertThat(actual).isNotEqualTo(3).thenFailThrow(exception);
        assertThat(actual).isEmpty().thenFailThrow(exception);
        assertThat(actual).isNotEmpty().thenFailThrow(exception);
        assertThat(actual).containsKey("test").thenFailThrow(exception);
        assertThat(actual).containsKeys("test","test1").thenFailThrow(exception);
        assertThat(actual).containsValue(1).thenFailThrow(exception);
        assertThat(actual).containsValues(1,2).thenFailThrow(exception);
        assertThat(actual).doesNotContainKey("test3").thenFailThrow(exception);
        assertThat(actual).doesNotContainValue(3).thenFailThrow(exception);
        assertThat(actual).doesNotContainKeys(expectKeys).thenFailThrow(exception);
        assertThat(actual).doesNotContainValues(expectValues).thenFailThrow(exception);
    }
}