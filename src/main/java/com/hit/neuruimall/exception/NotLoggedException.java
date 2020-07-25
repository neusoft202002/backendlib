package com.hit.neuruimall.exception;

public class NotLoggedException extends RuntimeException{

    public NotLoggedException() {
        super("请先登录");
    }
}
