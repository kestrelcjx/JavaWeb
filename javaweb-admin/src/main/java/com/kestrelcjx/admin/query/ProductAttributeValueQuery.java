package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 商品属性值查询条件
 */
public class ProductAttributeValueQuery extends BaseQuery {

    public ProductAttributeValueQuery() {
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductAttributeValueQuery)) return false;
        final ProductAttributeValueQuery other = (ProductAttributeValueQuery) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductAttributeValueQuery;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "ProductAttributeValueQuery()";
    }
}
