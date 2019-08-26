package com.stone.multiproject.base;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Result<T> extends Base {
    private Boolean isSuccess;
    private String errorCode;
    private String errorMsg;
    private T data;

    public static <T> Result ofSuccess(T data) {
        return new Result(Boolean.TRUE, null, null, data);
    }

    public static Result ofSuccess() {
        return new Result(Boolean.TRUE, null, null, null);
    }

    public static Result ofFail() {
        return new Result(Boolean.FALSE, null, null, null);
    }

    public static Result ofFail(String errorCode, String errorMsg) {
        return new Result(Boolean.FALSE, errorCode, errorMsg, null);
    }

    public static <T> Result of(Boolean isSuccess, String errorCode, String errorMsg, T data) {
        return new Result(isSuccess, errorCode, errorMsg, data);
    }

    public Result(Boolean isSuccess, String errorCode, String errorMsg, T data) {
        this.isSuccess = isSuccess;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }
}
