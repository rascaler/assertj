package com.cybermax.assertj.exception;

import java.util.Collection;
import java.util.List;

public class Student {
//    public static String name(Object... n) {
//        for (Object i: n) {
//            if (i.equals("1")) {
//                System.out.println(i);
//            }
//        }
//        return null;
//    }

    public static String name2(Iterable<?> n2) {
        for (Object i: n2) {
            if (i.equals("1")) {
                System.out.println(i);
            }
        }
        return null;
    }
}
