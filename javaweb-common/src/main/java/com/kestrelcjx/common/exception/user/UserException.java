package com.kestrelcjx.common.exception.user;


import com.kestrelcjx.common.exception.BaseException;

/**
 * 用户异常处理类
 */
public class UserException extends BaseException {
    private static final long serialVersionUIO = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}
