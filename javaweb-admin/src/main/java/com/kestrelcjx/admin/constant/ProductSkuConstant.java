package com.kestrelcjx.admin.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品SKU模块常量
 */
public class ProductSkuConstant {
    /**
     * 活动类型
     */
    public static Map<Integer, String> PRODUCTSKU_TYPE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "商品");
            put(2, "秒杀");
            put(3, "砍价");
            put(4, "拼团");
        }
    };
}