package com.wjq.common;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * <p>Description :
 * <p>Date : 2018/1/4 17:08
 * <p>@author : wjq
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//保证序列化json的时候如果是null的对象，key也会消失 就不会出现data :{}这种情况
public class Result<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    public static <T> Result<T> success() {
        return new Result<>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> Result<T> success(String msg) {
        return new Result<>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ResponseCode.SUCCESS.getCode(), data);
    }

    public static <T> Result<T> success(String msg, T data) {
        return new Result<>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> Result<T> error() {
        return new Result<>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
    }

    public static <T> Result<T> error(String errorMessage) {
        return new Result<>(ResponseCode.ERROR.getCode(), errorMessage);
    }

    public static <T> Result<T> error(int errorcode, String errorMessage) {
        return new Result<>(errorcode, errorMessage);
    }

    private Result(int status) {
        this.status = status;
    }

    private Result(int status, T data) {
        this.status = status;
        this.data = data;
    }

    private Result(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private Result(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    @JsonIgnore
    //在json序列化之后不会在json对象里面，被忽略了
    public boolean isSuccess() {
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public int getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }
}