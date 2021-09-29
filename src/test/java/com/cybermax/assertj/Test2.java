package com.cybermax.assertj;

import com.cybermax.assertj.exception.ApiException;
import com.cybermax.assertj.exception.ApiExceptionConvertor;
import com.cybermax.assertj.exception.Student;

import java.util.*;

import static com.cybermax.assertj.Assertions.assertThat;

public class Test2 {
    public static void main(String[] args) {
        Assertions.addExceptionCoverters(new ApiExceptionConvertor());
        assertThat(1).isEqualTo(2).thenFailThrow("2000");
    }
}
