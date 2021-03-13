package com.kestrelcjx.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 布局模块常量
 */
public class LayoutConstant {
    /**
     * 类型
     */
    public static Map<Integer, String> LAYOUT_TYPE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "新闻资讯");
            put(2, "其他");
        }
    };
}