package com.shy.data.structure.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: shihaoyan
 * @date: 2024/10/6 15:35
 * @description:
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
@SuppressWarnings("all")
public class Result<T> {

    private int code;

    private String msg;

    private T data;


    public static <T> Result<T> success(T data) {
        return new Result<>(1, "success", data);
    }

    public static <T> Result<T> fail(String msg) {
        return new Result<>(-1, msg, null);
    }

    public static <T> Result<T> fail(int code) {
        return new Result<>(code, "fail", null);
    }

    public static <T> Result<T> fail() {
        return new Result<>(-1, "fail", null);
    }

    public static <T> Result<T> fail(int code, String msg) {
        return new Result<>(code, msg, null);
    }


}
