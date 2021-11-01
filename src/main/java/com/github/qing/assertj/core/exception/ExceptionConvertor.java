package com.github.qing.assertj.core.exception;

public interface ExceptionConvertor<T, E extends RuntimeException> {

    E getException(T obj);

}
