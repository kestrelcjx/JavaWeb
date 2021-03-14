package com.kestrelcjx.admin.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品标签模块常量
 */
public class ProductTagsConstant {
    /**
     * 状态
     */
    public static Map<Integer, String> PRODUCTTAGS_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "启用");
            put(2, "停用");
        }
    };
}