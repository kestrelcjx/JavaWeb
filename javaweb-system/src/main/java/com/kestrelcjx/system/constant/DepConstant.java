package com.kestrelcjx.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 部门模块常量
 */
public class DepConstant {
    /**
     * 类型
     */
    public static Map<Integer, String> DEP_TYPE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "公司");
            put(2, "部门");
        }
    };
    /**
     * 是否有子级
     */
    public static Map<Integer, String> DEP_HASCHILD_LIST = new HashMap<Integer, String>() {
        {
            put(1, "是");
            put(2, "否");
        }
    };
}