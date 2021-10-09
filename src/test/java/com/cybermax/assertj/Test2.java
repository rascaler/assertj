package com.cybermax.assertj;

import com.cybermax.assertj.exception.ApiException;
import com.cybermax.assertj.exception.ApiExceptionConvertor;
import com.cybermax.assertj.exception.Student;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.*;

import static com.cybermax.assertj.Assertions.assertThat;

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
        Object[] a = new Integer[] {1, 2};
//        Object[] b = new int[] {1, 2};
//        Integer[] c = (Integer[])new int[] {1, 2};
//        int[] a = new Integer[] {1};
        Class s = a.getClass();
        int[] b = new int[] {1, 2};
        Integer m  = 1;
        int n = 2;
        int r = size(b);
        System.out.println(1);
    }

}
