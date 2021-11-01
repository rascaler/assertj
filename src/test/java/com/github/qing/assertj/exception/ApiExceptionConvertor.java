package com.github.qing.assertj.exception;

import com.github.qing.assertj.core.exception.ExceptionConvertor;

import static com.github.qing.assertj.Assertions.assertThat;

public class ApiExceptionConvertor implements ExceptionConvertor<String,ApiException> {
    @Override
    public ApiException getException(String obj) {
        String msg = ExceptionMessage.messages.get(obj);
        assertThat(msg).isNotBlank().thenFailThrow(new RuntimeException("异常未定义"));
        return new ApiException(obj, msg, null);
    }
}
