package com.kestrelcjx.admin.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品分类模块常量
 */
public class ProductCategoryConstant {
    /**
     * 状态
     */
    public static Map<Integer, String> PRODUCTCATEGORY_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "显示");
            put(2, "隐藏");
        }
    };
}