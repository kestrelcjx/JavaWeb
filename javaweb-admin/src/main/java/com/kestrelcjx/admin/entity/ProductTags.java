package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;


/**
 * 商品标签
 */
@TableName("pms_product_tags")
public class ProductTags extends BaseEntity {
    /**
     * 标签名
     */
    private String name;
    /**
     * 状态：1启用 2停用
     */
    private Integer status;
    /**
     * 排序号
     */
    private Integer sort;

    public ProductTags() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getSort() {
        return this.sort;
    }

    public ProductTags setName(String name) {
        this.name = name;
        return this;
    }

    public ProductTags setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public ProductTags setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "ProductTags(name=" + this.getName() + ", status=" + this.getStatus() + ", sort=" + this.getSort() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductTags)) return false;
        final ProductTags other = (ProductTags) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductTags;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        return result;
    }
}