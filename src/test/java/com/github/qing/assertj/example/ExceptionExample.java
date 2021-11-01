package com.github.qing.assertj.example;

import com.github.qing.assertj.Assertions;
import com.github.qing.assertj.exception.ApiExceptionConvertor;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.github.qing.assertj.Assertions.assertThat;


public class ExceptionExample {

    @BeforeClass
    public static void  init() {
        // 设置异常转换器，在项目初始化的时候设置
        Assertions.addExceptionCoverters(new ApiExceptionConvertor());
    }

    @Test
    public void testException() {
        Assertions.assertThat(1).isLessThan(1).thenFailThrow("1000");
    }

    @Test
    public void testExceptionWithLog() {
        // 无占位符
        Assertions.assertThat(1).isLessThan(1).thenFailThrow("1000","日志测试");
    }

    @Test
    public void testExceptionWithLog2() {
        // 有占位符
        Assertions.assertThat(1).isLessThan(1).thenFailThrow("1000","日志测试[{}]", "占位符");
    }
}
