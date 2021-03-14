package com.kestrelcjx.admin.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品品牌模块常量
 */
public class BrandConstant {
    /**
     * 状态
     */
    public static Map<Integer, String> BRAND_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "启用");
            put(2, "停用");
        }
    };
}