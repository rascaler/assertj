package io.github.rascaler.assertj.example;

import io.github.rascaler.assertj.Assertions;

import java.util.ArrayList;
import java.util.List;
import static io.github.rascaler.assertj.Assertions.assertThat;

public class NumberExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        int num = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Assertions.assertThat(num).isNull().thenFailThrow(exception);
        Assertions.assertThat(num).isNotNull().thenFailThrow(exception);
        Assertions.assertThat(num).isEqualTo(1).thenFailThrow(exception);
        Assertions.assertThat(num).isNotEqualTo(3).thenFailThrow(exception);
        Assertions.assertThat(num).isGreaterThan(0).thenFailThrow(exception);
        Assertions.assertThat(num).isGreaterThanOrEqualTo(1).thenFailThrow(exception);
        Assertions.assertThat(num).isLessThan(2).thenFailThrow(exception);
        Assertions.assertThat(num).isLessThanOrEqualTo(1).thenFailThrow(exception);
        Assertions.assertThat(num).isBetween(0,1).thenFailThrow(exception);
        Assertions.assertThat(num).isStrictlyBetween(0,2).thenFailThrow(exception);
        Assertions.assertThat(num).isStartInclusiveBetween(1,2).thenFailThrow(exception);
        Assertions.assertThat(num).isEndInclusiveBetween(0,1).thenFailThrow(exception);
        Assertions.assertThat(num).isIn(list);
    }
}