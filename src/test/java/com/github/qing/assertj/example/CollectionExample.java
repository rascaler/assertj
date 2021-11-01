package com.github.qing.assertj.example;

import java.util.ArrayList;
import java.util.List;

import static com.github.qing.assertj.Assertions.assertThat;

public class CollectionExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        List<String> actual = new ArrayList<>();
        Integer[] expect = new Integer[] {1, 2};
        List<Integer> expect2 = new ArrayList<>();
        expect2.add(1);
        expect2.add(3);
        assertThat(actual).isNull().thenFailThrow(exception);
        assertThat(actual).isNotNull().thenFailThrow(exception);
        assertThat(actual).isEqualTo(1).thenFailThrow(exception);
        assertThat(actual).isNotEqualTo(3).thenFailThrow(exception);
        assertThat(actual).isEmpty().thenFailThrow(exception);
        assertThat(actual).isNotEmpty().thenFailThrow(exception);
        assertThat(actual).isAllIn(expect).thenFailThrow(exception);
        assertThat(actual).isAllIn(expect2).thenFailThrow(exception);
        assertThat(actual).hasAnyIn(expect).thenFailThrow(exception);
        assertThat(actual).hasAnyIn(expect2).thenFailThrow(exception);
        assertThat(actual).hasNoneIn(expect).thenFailThrow(exception);
        assertThat(actual).hasNoneIn(expect2).thenFailThrow(exception);
        assertThat(actual).containsAll(expect).thenFailThrow(exception);
        assertThat(actual).containsAll(expect2).thenFailThrow(exception);
        assertThat(actual).isSizeEqualTo(2).thenFailThrow(exception);
        assertThat(actual).isSizeBetween(1,3).thenFailThrow(exception);
        assertThat(actual).isSizeStrictlyBetween(1,3).thenFailThrow(exception);
        assertThat(actual).isSizeGreaterThan(1).thenFailThrow(exception);
        assertThat(actual).isSizeGreaterThanOrEqualTo(2).thenFailThrow(exception);
        assertThat(actual).isSizeGreaterThan(2).thenFailThrow(exception);
        assertThat(actual).isSizeLessThan(3).thenFailThrow(exception);
        assertThat(actual).isSizeLessThanOrEqualTo(2).thenFailThrow(exception);
    }
}