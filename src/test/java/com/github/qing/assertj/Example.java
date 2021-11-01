package com.github.qing.assertj;

import com.github.qing.assertj.exception.ApiExceptionConvertor;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.github.qing.assertj.Assertions.assertThat;


public class Example {

    @BeforeClass
    public static void  init() {
        // 设置异常转换器，在项目初始化的时候设置
        Assertions.addExceptionCoverters(new ApiExceptionConvertor());
    }

//    @Before
//    public void init() {
//        Assertions.addExceptionCoverters(new ApiExceptionConvertor());
//    }

    /*
     * description: 异常
     * @return void
     * @author wurenqing
     * @time 2021-10-14 10:24
     */
    @Test
    public void testException() {
        Assertions.assertThat(1).isLessThan(1).thenFailThrow("1000");
    }

    @Test
    public void testExceptionWithLog() {
        // 无占位符
        Assertions.assertThat(1).isLessThan(1).thenFailWithLogThrow("1000","日志测试");
    }

    @Test
    public void testExceptionWithLog2() {
        // 有占位符
        Assertions.assertThat(1).isLessThan(1).thenFailWithLogThrow("1000","日志测试[{}]", "占位符");
    }
}
