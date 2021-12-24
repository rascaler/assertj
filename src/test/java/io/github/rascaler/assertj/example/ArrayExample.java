package io.github.rascaler.assertj.example;

import io.github.rascaler.assertj.Assertions;

import java.util.ArrayList;
import java.util.List;
import static io.github.rascaler.assertj.Assertions.assertThat;

public class ArrayExample {
    public static final RuntimeException exception = new RuntimeException("失败");

    public static void main(String[] args) {
        Integer[] obj = new Integer[] {1, 2};
        Integer[] expect = new Integer[] {1, 2};
        List<Integer> expect2 = new ArrayList<>();
        expect2.add(1);
        expect2.add(3);
        Assertions.assertThat(obj).isNull().thenThrow(exception);
        Assertions.assertThat(obj).isNotNull().thenThrow(exception);
        Assertions.assertThat(obj).isEqualTo(1).thenThrow(exception);
        Assertions.assertThat(obj).isNotEqualTo(3).thenThrow(exception);
        Assertions.assertThat(obj).isEmpty().thenThrow(exception);
        Assertions.assertThat(obj).isNotEmpty().thenThrow(exception);
        Assertions.assertThat(obj).isAllIn(expect).thenThrow(exception);
        Assertions.assertThat(obj).isAllIn(expect2).thenThrow(exception);
        Assertions.assertThat(obj).hasAnyIn(expect).thenThrow(exception);
        Assertions.assertThat(obj).hasAnyIn(expect2).thenThrow(exception);
        Assertions.assertThat(obj).hasNoneIn(expect).thenThrow(exception);
        Assertions.assertThat(obj).hasNoneIn(expect2).thenThrow(exception);
        Assertions.assertThat(obj).containsAll(expect).thenThrow(exception);
        Assertions.assertThat(obj).containsAll(expect2).thenThrow(exception);
        Assertions.assertThat(obj).isSizeEqualTo(2).thenThrow(exception);
        Assertions.assertThat(obj).isSizeBetween(1,3).thenThrow(exception);
        Assertions.assertThat(obj).isSizeStrictlyBetween(1,3).thenThrow(exception);
        Assertions.assertThat(obj).isSizeGreaterThan(1).thenThrow(exception);
        Assertions.assertThat(obj).isSizeGreaterThanOrEqualTo(2).thenThrow(exception);
        Assertions.assertThat(obj).isSizeGreaterThan(2).thenThrow(exception);
        Assertions.assertThat(obj).isSizeLessThan(3).thenThrow(exception);
        Assertions.assertThat(obj).isSizeLessThanOrEqualTo(2).thenThrow(exception);
    }
}