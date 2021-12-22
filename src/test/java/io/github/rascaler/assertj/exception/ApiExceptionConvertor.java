package io.github.rascaler.assertj.exception;

import io.github.rascaler.assertj.core.exception.ExceptionConvertor;
import io.github.rascaler.assertj.Assertions;

import static io.github.rascaler.assertj.Assertions.assertThat;

public class ApiExceptionConvertor implements ExceptionConvertor<String,ApiException> {
    @Override
    public ApiException getException(String obj) {
        String msg = ExceptionMessage.messages.get(obj);
        Assertions.assertThat(msg).isBlank().thenThrow(new RuntimeException("异常未定义"));
        return new ApiException(obj, msg, null);
    }
}
