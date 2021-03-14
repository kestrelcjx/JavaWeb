package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 商品属性查询条件
 */
public class ProductAttributeQuery extends BaseQuery {
    /**
     * 属性名称
     */
    private String name;
    /**
     * 属性的类型：1规格 2属性
     */
    private Integer type;

    public ProductAttributeQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductAttributeQuery)) return false;
        final ProductAttributeQuery other = (ProductAttributeQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductAttributeQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "ProductAttributeQuery(name=" + this.getName() + ", type=" + this.getType() + ")";
    }
}
