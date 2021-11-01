package com.github.qing.assertj.example;

import java.util.ArrayList;
import java.util.List;
import static com.github.qing.assertj.Assertions.assertThat;

public class NumberExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        int num = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertThat(num).isNull().thenFailThrow(exception);
        assertThat(num).isNotNull().thenFailThrow(exception);
        assertThat(num).isEqualTo(1).thenFailThrow(exception);
        assertThat(num).isNotEqualTo(3).thenFailThrow(exception);
        assertThat(num).isGreaterThan(0).thenFailThrow(exception);
        assertThat(num).isGreaterThanOrEqualTo(1).thenFailThrow(exception);
        assertThat(num).isLessThan(2).thenFailThrow(exception);
        assertThat(num).isLessThanOrEqualTo(1).thenFailThrow(exception);
        assertThat(num).isBetween(0,1).thenFailThrow(exception);
        assertThat(num).isStrictlyBetween(0,2).thenFailThrow(exception);
        assertThat(num).isStartInclusiveBetween(1,2).thenFailThrow(exception);
        assertThat(num).isEndInclusiveBetween(0,1).thenFailThrow(exception);
        assertThat(num).isIn(list);
    }
}