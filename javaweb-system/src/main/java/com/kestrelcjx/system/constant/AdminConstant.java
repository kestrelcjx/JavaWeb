package com.kestrelcjx.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统人员模块常量
 */
public class AdminConstant {
    /**
     * 性别
     */
    public static Map<Integer, String> ADMIN_GENDER_LIST = new HashMap<Integer, String>() {
        {
            put(1, "男");
            put(2, "女");
            put(3, "保密");
        }
    };
    /**
     * 状态
     */
    public static Map<Integer, String> ADMIN_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "正常");
            put(2, "禁用");
        }
    };
}