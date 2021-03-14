package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 商品标签查询条件
 */
public class ProductTagsQuery extends BaseQuery {
    /**
     * 标签名
     */
    private String name;
    /**
     * 状态：1启用 2停用
     */
    private Integer status;

    public ProductTagsQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductTagsQuery)) return false;
        final ProductTagsQuery other = (ProductTagsQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductTagsQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTagsQuery(name=" + this.getName() + ", status=" + this.getStatus() + ")";
    }
}
