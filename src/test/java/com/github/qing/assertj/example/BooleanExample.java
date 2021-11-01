package com.github.qing.assertj.example;

import java.util.ArrayList;
import java.util.List;
import static com.github.qing.assertj.Assertions.assertThat;

public class BooleanExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        boolean obj = true;
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        assertThat(obj).isNull().thenFailThrow(exception);
        assertThat(obj).isNotNull().thenFailThrow(exception);
        assertThat(obj).isEqualTo(1).thenFailThrow(exception);
        assertThat(obj).isNotEqualTo(3).thenFailThrow(exception);
        assertThat(obj).isFalse().thenFailThrow(exception);
        assertThat(obj).isTrue().thenFailThrow(exception);
        assertThat(obj).isIn(list).thenFailThrow(exception);
        assertThat(obj).isIn(true, false).thenFailThrow(exception);
        assertThat(obj).isNotIn(list).thenFailThrow(exception);
        assertThat(obj).isNotIn(true, false).thenFailThrow(exception);
    }
}