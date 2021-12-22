package io.github.rascaler.assertj.example;

import io.github.rascaler.assertj.Assertions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.github.rascaler.assertj.Assertions.assertThat;

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
        Assertions.assertThat(actual).isNull().thenThrow(exception);
        Assertions.assertThat(actual).isNotNull().thenThrow(exception);
        Assertions.assertThat(actual).isEqualTo(1).thenThrow(exception);
        Assertions.assertThat(actual).isNotEqualTo(3).thenThrow(exception);
        Assertions.assertThat(actual).isEmpty().thenThrow(exception);
        Assertions.assertThat(actual).isNotEmpty().thenThrow(exception);
        Assertions.assertThat(actual).containsKey("test").thenThrow(exception);
        Assertions.assertThat(actual).containsKeys("test","test1").thenThrow(exception);
        Assertions.assertThat(actual).containsValue(1).thenThrow(exception);
        Assertions.assertThat(actual).containsValues(1,2).thenThrow(exception);
        Assertions.assertThat(actual).doesNotContainKey("test3").thenThrow(exception);
        Assertions.assertThat(actual).doesNotContainValue(3).thenThrow(exception);
        Assertions.assertThat(actual).doesNotContainKeys(expectKeys).thenThrow(exception);
        Assertions.assertThat(actual).doesNotContainValues(expectValues).thenThrow(exception);
    }
}