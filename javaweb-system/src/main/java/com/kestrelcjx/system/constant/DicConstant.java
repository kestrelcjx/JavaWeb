package com.kestrelcjx.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 字典模块常量
 */
public class DicConstant {
    /**
     * 状态
     */
    public static Map<Integer, String> DIC_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "在用");
            put(2, "停用");
        }
    };
}