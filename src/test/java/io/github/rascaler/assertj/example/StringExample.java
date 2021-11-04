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
        Assertions.assertThat(str).isNull().thenFailThrow(exception);
        Assertions.assertThat(str).isNotNull().thenFailThrow(exception);
        Assertions.assertThat(str).isEqualTo("string").thenFailThrow(exception);
        Assertions.assertThat(str).isNotEqualTo("str").thenFailThrow(exception);

        Assertions.assertThat(str).isBlank().thenFailThrow(exception);
        Assertions.assertThat(str).isNotBlank().thenFailThrow(exception);
        Assertions.assertThat(str).isEmpty().thenFailThrow(exception);
        Assertions.assertThat(str).isNotEmpty().thenFailThrow(exception);
        Assertions.assertThat(str).isAllUpperCase().thenFailThrow(exception);
        Assertions.assertThat(str).isAllLowerCase().thenFailThrow(exception);
        Assertions.assertThat(str).isNumberCreatable().thenFailThrow(exception);
        Assertions.assertThat(str).isEqualTo("string").thenFailThrow(exception);
        Assertions.assertThat(str).contains("tr").thenFailThrow(exception);
        Assertions.assertThat(str).doesNotContain("aa").thenFailThrow(exception);
        Assertions.assertThat(str).startsWith("str").thenFailThrow(exception);
        Assertions.assertThat(str).endsWith("ing").thenFailThrow(exception);
    }
}