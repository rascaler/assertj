package com.qing.assertj;

import com.qing.assertj.exception.ApiExceptionConvertor;

import static com.qing.assertj.Assertions.assertThat;

public class Test2 {
    public static <T> int size(T a) {
        return 0;
    }

    public static void main(String[] args) {
        Assertions.addExceptionCoverters(new ApiExceptionConvertor());

//        assertThat(1).isNotNull().thenFailThrow("2000")
//                .isEqualTo(1).thenFailThrow("2000");

//        assertThat(NumberUtils.isCreatable("11")).isTrue().thenFailThrow("2000");
//        assertThat("1").is
//        assertThat('a').isLessThanOrEqualTo('a').thenFailThrow("2000");

//        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of('µ');
//        assertThat(" ").isNotBlank().contains(" ").thenFailThrow("2000");
        Integer[] a = new Integer[] {1, 2};
//        Object[] b = new int[] {1, 2};
//        Integer[] c = (Integer[])new int[] {1, 2};
//        int[] a = new Integer[] {1};
        Class s = a.getClass();
        int[] b = new int[] {1, 2};
        Integer m  = 1;
        int n = 2;
        int r = size(b);
        Assertions.assertThat(b).containsAny(new Integer[] {3}).thenFailWithLogThrow("1000","测试");
//        Assertions.assertThat(b).containsAny(new Integer[] {3}).thenFailWithLogThrow("1000","测试{}","test");
        System.out.println(1);
    }

}
