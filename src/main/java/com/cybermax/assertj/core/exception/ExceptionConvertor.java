package com.cybermax.assertj.core.exception;

public interface ExceptionConvertor<T, E extends RuntimeException> {

    E getException(T obj);

}
