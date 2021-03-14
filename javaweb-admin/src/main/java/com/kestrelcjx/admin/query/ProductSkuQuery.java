package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 商品SKU查询条件
 */
public class ProductSkuQuery extends BaseQuery {
    /**
     * 活动类型：1商品 2秒杀 3砍价 4拼团
     */
    private Integer type;

    public ProductSkuQuery() {
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductSkuQuery)) return false;
        final ProductSkuQuery other = (ProductSkuQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductSkuQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSkuQuery(type=" + this.getType() + ")";
    }
}
