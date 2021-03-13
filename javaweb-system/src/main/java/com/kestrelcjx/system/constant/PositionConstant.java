package com.kestrelcjx.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 岗位模块常量
 */
public class PositionConstant {
    /**
     * 状态
     */
    public static Map<Integer, String> POSITION_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "正常");
            put(2, "停用");
        }
    };
}