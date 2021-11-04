package io.github.rascaler.assertj.example;

import io.github.rascaler.assertj.Assertions;

import java.util.ArrayList;
import java.util.List;

import static io.github.rascaler.assertj.Assertions.assertThat;

public class CollectionExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        List<String> actual = new ArrayList<>();
        Integer[] expect = new Integer[] {1, 2};
        List<Integer> expect2 = new ArrayList<>();
        expect2.add(1);
        expect2.add(3);
        Assertions.assertThat(actual).isNull().thenFailThrow(exception);
        Assertions.assertThat(actual).isNotNull().thenFailThrow(exception);
        Assertions.assertThat(actual).isEqualTo(1).thenFailThrow(exception);
        Assertions.assertThat(actual).isNotEqualTo(3).thenFailThrow(exception);
        Assertions.assertThat(actual).isEmpty().thenFailThrow(exception);
        Assertions.assertThat(actual).isNotEmpty().thenFailThrow(exception);
        Assertions.assertThat(actual).isAllIn(expect).thenFailThrow(exception);
        Assertions.assertThat(actual).isAllIn(expect2).thenFailThrow(exception);
        Assertions.assertThat(actual).hasAnyIn(expect).thenFailThrow(exception);
        Assertions.assertThat(actual).hasAnyIn(expect2).thenFailThrow(exception);
        Assertions.assertThat(actual).hasNoneIn(expect).thenFailThrow(exception);
        Assertions.assertThat(actual).hasNoneIn(expect2).thenFailThrow(exception);
        Assertions.assertThat(actual).containsAll(expect).thenFailThrow(exception);
        Assertions.assertThat(actual).containsAll(expect2).thenFailThrow(exception);
        Assertions.assertThat(actual).isSizeEqualTo(2).thenFailThrow(exception);
        Assertions.assertThat(actual).isSizeBetween(1,3).thenFailThrow(exception);
        Assertions.assertThat(actual).isSizeStrictlyBetween(1,3).thenFailThrow(exception);
        Assertions.assertThat(actual).isSizeGreaterThan(1).thenFailThrow(exception);
        Assertions.assertThat(actual).isSizeGreaterThanOrEqualTo(2).thenFailThrow(exception);
        Assertions.assertThat(actual).isSizeGreaterThan(2).thenFailThrow(exception);
        Assertions.assertThat(actual).isSizeLessThan(3).thenFailThrow(exception);
        Assertions.assertThat(actual).isSizeLessThanOrEqualTo(2).thenFailThrow(exception);
    }
}