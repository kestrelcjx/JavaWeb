package com.kestrelcjx.admin.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 会员用户模块常量
 */
public class UserConstant {
    /**
     * 性别
     */
    public static Map<Integer, String> USER_GENDER_LIST = new HashMap<Integer, String>() {
        {
            put(1, "男");
            put(2, "女");
            put(3, "未知");
        }
    };
    /**
     * 设备类型
     */
    public static Map<Integer, String> USER_DEVICE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "苹果");
            put(2, "安卓");
            put(3, "WAP站");
            put(4, "PC站");
            put(5, "微信小程序");
            put(6, "后台添加");
        }
    };
    /**
     * 用户状态
     */
    public static Map<Integer, String> USER_LOGINSTATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "登录");
            put(2, "登出");
        }
    };
    /**
     * 用户来源
     */
    public static Map<Integer, String> USER_SOURCE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "注册会员");
            put(2, "马甲会员");
        }
    };
    /**
     * 是否启用
     */
    public static Map<Integer, String> USER_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "启用");
            put(2, "停用");
        }
    };
}