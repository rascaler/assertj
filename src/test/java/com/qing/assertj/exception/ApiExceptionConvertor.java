package com.qing.assertj.exception;

import com.qing.assertj.core.exception.ExceptionConvertor;

public class ApiExceptionConvertor implements ExceptionConvertor<String,ApiException> {
    @Override
    public ApiException getException(String obj) {
        return new ApiException(obj, "成功", null);
    }
}
