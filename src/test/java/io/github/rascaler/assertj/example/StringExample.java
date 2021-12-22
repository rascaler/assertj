package io.github.rascaler.assertj.example;

import io.github.rascaler.assertj.Assertions;

import java.util.ArrayList;
import java.util.List;
import static io.github.rascaler.assertj.Assertions.assertThat;

public class StringExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        String str = "string";
        List<String> s = new ArrayList<>();
        s.add("string");
        s.add("test");
        Assertions.assertThat(str).isNull().thenThrow(exception);
        Assertions.assertThat(str).isNotNull().thenThrow(exception);
        Assertions.assertThat(str).isEqualTo("string").thenThrow(exception);
        Assertions.assertThat(str).isNotEqualTo("str").thenThrow(exception);

        Assertions.assertThat(str).isBlank().thenThrow(exception);
        Assertions.assertThat(str).isNotBlank().thenThrow(exception);
        Assertions.assertThat(str).isEmpty().thenThrow(exception);
        Assertions.assertThat(str).isNotEmpty().thenThrow(exception);
        Assertions.assertThat(str).isAllUpperCase().thenThrow(exception);
        Assertions.assertThat(str).isAllLowerCase().thenThrow(exception);
        Assertions.assertThat(str).isNumberCreatable().thenThrow(exception);
        Assertions.assertThat(str).isEqualTo("string").thenThrow(exception);
        Assertions.assertThat(str).contains("tr").thenThrow(exception);
        Assertions.assertThat(str).doesNotContain("aa").thenThrow(exception);
        Assertions.assertThat(str).startsWith("str").thenThrow(exception);
        Assertions.assertThat(str).endsWith("ing").thenThrow(exception);
    }
}