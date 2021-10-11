package com.qing.assertj;

import com.qing.assertj.exception.ApiException;
import com.qing.assertj.exception.Student;

import java.util.*;
import static com.qing.assertj.Assertions.assertThat;

public class Test {
    public static void main(String[] args) {
        ApiException exception = new ApiException("1100", "成功", null);
//        ApiException exception2 = new ApiException("1100", "成功2", null);
//
        Byte d = 1;
//        Assertions.assertThat(d).isPositive().thenFailThrow(exception);
        Assertions.assertThat(d).isPositive().thenFailThrow(exception);

//        .isEqualTo(2).thenFailThrow(exception2);
        int[] intArr;
        String[] strArr;
        intArr = new int[]{1,2,3,4,5,9};
        strArr = new String[]{"1"};
        List<String> s = new ArrayList<>();
//        System.out.println(Student.name(strArr));
        System.out.println(Student.name2(s));

        HashSet<String> set = new HashSet<>();
        set.add("a");
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println("a".equals(null));
//        assertThat(set).isNull().thenFailThrow(exception)
//                .isIn()
        Map<String, String> map = new HashMap();
        map.put("111","2222");
        Assertions.assertThat(map).containsKey("111").thenFailThrow(exception);

        Hashtable<String, String> table = new Hashtable<>();
        Assertions.assertThat(table).containsKey("1111").thenFailThrow(exception);
    }
}
