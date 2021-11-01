package com.github.qing.assertj.example;

import java.util.ArrayList;
import java.util.List;
import static com.github.qing.assertj.Assertions.assertThat;

public class ArrayExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        Integer[] obj = new Integer[] {1, 2};
        Integer[] expect = new Integer[] {1, 2};
        List<Integer> expect2 = new ArrayList<>();
        expect2.add(1);
        expect2.add(3);
        assertThat(obj).isNull().thenFailThrow(exception);
        assertThat(obj).isNotNull().thenFailThrow(exception);
        assertThat(obj).isEqualTo(1).thenFailThrow(exception);
        assertThat(obj).isNotEqualTo(3).thenFailThrow(exception);
        assertThat(obj).isEmpty().thenFailThrow(exception);
        assertThat(obj).isNotEmpty().thenFailThrow(exception);
        assertThat(obj).isAllIn(expect).thenFailThrow(exception);
        assertThat(obj).isAllIn(expect2).thenFailThrow(exception);
        assertThat(obj).hasAnyIn(expect).thenFailThrow(exception);
        assertThat(obj).hasAnyIn(expect2).thenFailThrow(exception);
        assertThat(obj).hasNoneIn(expect).thenFailThrow(exception);
        assertThat(obj).hasNoneIn(expect2).thenFailThrow(exception);
        assertThat(obj).containsAll(expect).thenFailThrow(exception);
        assertThat(obj).containsAll(expect2).thenFailThrow(exception);
        assertThat(obj).isSizeEqualTo(2).thenFailThrow(exception);
        assertThat(obj).isSizeBetween(1,3).thenFailThrow(exception);
        assertThat(obj).isSizeStrictlyBetween(1,3).thenFailThrow(exception);
        assertThat(obj).isSizeGreaterThan(1).thenFailThrow(exception);
        assertThat(obj).isSizeGreaterThanOrEqualTo(2).thenFailThrow(exception);
        assertThat(obj).isSizeGreaterThan(2).thenFailThrow(exception);
        assertThat(obj).isSizeLessThan(3).thenFailThrow(exception);
        assertThat(obj).isSizeLessThanOrEqualTo(2).thenFailThrow(exception);
    }
}