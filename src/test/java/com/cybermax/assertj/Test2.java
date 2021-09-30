package com.cybermax.assertj;

import com.cybermax.assertj.exception.ApiException;
import com.cybermax.assertj.exception.ApiExceptionConvertor;
import com.cybermax.assertj.exception.Student;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.*;

import static com.cybermax.assertj.Assertions.assertThat;

public class Test2 {
    public static void main(String[] args) {
        Assertions.addExceptionCoverters(new ApiExceptionConvertor());

//        assertThat(1).isNotNull().thenFailThrow("2000")
//                .isEqualTo(1).thenFailThrow("2000");

        assertThat(NumberUtils.isCreatable("11")).isTrue().thenFailThrow("2000");
//        assertThat("1").is
    }
}
