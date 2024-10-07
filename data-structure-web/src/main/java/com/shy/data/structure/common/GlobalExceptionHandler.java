package com.shy.data.structure.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author: shihaoyan
 * @date: 2024/10/6 15:53
 * @description:
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Throwable.class)
    public Result<String> handleException(Exception e) {
        return Result.fail(e.getMessage());
    }

}
