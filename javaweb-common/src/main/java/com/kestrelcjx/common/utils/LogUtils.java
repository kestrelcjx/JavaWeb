package com.kestrelcjx.common.utils;

/**
 * 处理并记录日子文件
 */
public class LogUtils {
    public static String getBlock(Object msg) {
        if (null == msg) {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }
}
