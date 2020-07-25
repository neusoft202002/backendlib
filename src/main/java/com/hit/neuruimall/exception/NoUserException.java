package com.hit.neuruimall.exception;

public class NoUserException extends RuntimeException{

    public NoUserException() {
        super("账号或密码错误");
    }
}
