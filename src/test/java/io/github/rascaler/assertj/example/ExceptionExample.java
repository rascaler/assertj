package io.github.rascaler.assertj.example;

import io.github.rascaler.assertj.Assertions;
import io.github.rascaler.assertj.exception.ApiExceptionConvertor;
import org.junit.BeforeClass;
import org.junit.Test;
import static io.github.rascaler.assertj.Assertions.assertThat;


public class ExceptionExample {

    @BeforeClass
    public static void  init() {
        // 设置异常转换器，在项目初始化的时候设置
        Assertions.addExceptionConvertor(new ApiExceptionConvertor());
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
