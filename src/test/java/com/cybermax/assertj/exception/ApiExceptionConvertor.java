package com.cybermax.assertj.exception;

import com.cybermax.assertj.core.AbstractAssert;
import com.cybermax.assertj.core.exception.ExceptionConvertor;

public class ApiExceptionConvertor implements ExceptionConvertor<String,ApiException> {
    @Override
    public ApiException getException(String obj) {
        return new ApiException(obj, "成功", null);
    }
}
