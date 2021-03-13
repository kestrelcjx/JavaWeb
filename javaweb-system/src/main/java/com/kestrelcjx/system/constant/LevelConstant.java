package com.kestrelcjx.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 职级模块常量
 */
public class LevelConstant {
    /**
     * 状态
     */
    public static Map<Integer, String> LEVEL_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "正常");
            put(2, "停用");
        }
    };
}