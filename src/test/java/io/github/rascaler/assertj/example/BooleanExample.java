package io.github.rascaler.assertj.example;

import io.github.rascaler.assertj.Assertions;

import java.util.ArrayList;
import java.util.List;
import static io.github.rascaler.assertj.Assertions.assertThat;

public class BooleanExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        boolean obj = true;
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        Assertions.assertThat(obj).isNull().thenThrow(exception);
        Assertions.assertThat(obj).isNotNull().thenThrow(exception);
        Assertions.assertThat(obj).isEqualTo(1).thenThrow(exception);
        Assertions.assertThat(obj).isNotEqualTo(3).thenThrow(exception);
        Assertions.assertThat(obj).isFalse().thenThrow(exception);
        Assertions.assertThat(obj).isTrue().thenThrow(exception);
        Assertions.assertThat(obj).isIn(list).thenThrow(exception);
        Assertions.assertThat(obj).isIn(true, false).thenThrow(exception);
        Assertions.assertThat(obj).isNotIn(list).thenThrow(exception);
        Assertions.assertThat(obj).isNotIn(true, false).thenThrow(exception);
    }
}