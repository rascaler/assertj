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
        Assertions.assertThat(obj).isNull().thenFailThrow(exception);
        Assertions.assertThat(obj).isNotNull().thenFailThrow(exception);
        Assertions.assertThat(obj).isEqualTo(1).thenFailThrow(exception);
        Assertions.assertThat(obj).isNotEqualTo(3).thenFailThrow(exception);
        Assertions.assertThat(obj).isFalse().thenFailThrow(exception);
        Assertions.assertThat(obj).isTrue().thenFailThrow(exception);
        Assertions.assertThat(obj).isIn(list).thenFailThrow(exception);
        Assertions.assertThat(obj).isIn(true, false).thenFailThrow(exception);
        Assertions.assertThat(obj).isNotIn(list).thenFailThrow(exception);
        Assertions.assertThat(obj).isNotIn(true, false).thenFailThrow(exception);
    }
}