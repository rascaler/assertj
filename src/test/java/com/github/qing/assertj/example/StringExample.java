package com.github.qing.assertj.example;

import java.util.ArrayList;
import java.util.List;
import static com.github.qing.assertj.Assertions.assertThat;

public class StringExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        String str = "string";
        List<String> s = new ArrayList<>();
        s.add("string");
        s.add("test");
        assertThat(str).isNull().thenFailThrow(exception);
        assertThat(str).isNotNull().thenFailThrow(exception);
        assertThat(str).isEqualTo("string").thenFailThrow(exception);
        assertThat(str).isNotEqualTo("str").thenFailThrow(exception);

        assertThat(str).isBlank().thenFailThrow(exception);
        assertThat(str).isNotBlank().thenFailThrow(exception);
        assertThat(str).isEmpty().thenFailThrow(exception);
        assertThat(str).isNotEmpty().thenFailThrow(exception);
        assertThat(str).isAllUpperCase().thenFailThrow(exception);
        assertThat(str).isAllLowerCase().thenFailThrow(exception);
        assertThat(str).isNumberCreatable().thenFailThrow(exception);
        assertThat(str).isEqualTo("string").thenFailThrow(exception);
        assertThat(str).contains("tr").thenFailThrow(exception);
        assertThat(str).doseNotContains("aa").thenFailThrow(exception);
        assertThat(str).startsWith("str").thenFailThrow(exception);
        assertThat(str).endsWith("ing").thenFailThrow(exception);
    }
}