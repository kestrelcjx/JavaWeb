package com.kestrelcjx.admin.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品属性模块常量
 */
public class ProductAttributeConstant {
    /**
     * 属性的类型
     */
    public static Map<Integer, String> PRODUCTATTRIBUTE_TYPE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "规格");
            put(2, "属性");
        }
    };
}