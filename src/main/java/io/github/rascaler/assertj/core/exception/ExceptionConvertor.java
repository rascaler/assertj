package io.github.rascaler.assertj.core.exception;

public interface ExceptionConvertor<T, E extends RuntimeException> {

    E getException(T obj);

}
