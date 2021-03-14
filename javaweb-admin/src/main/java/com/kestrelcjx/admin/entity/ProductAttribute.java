package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;


/**
 * 商品属性
 */
@TableName("pms_product_attribute")
public class ProductAttribute extends BaseEntity {
    /**
     * 商品属性分类ID
     */
    private Integer productAttributeCategoryId;
    /**
     * 属性名称
     */
    private String name;
    /**
     * 属性的类型：1规格 2属性
     */
    private Integer type;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 所属店铺ID
     */
    private Integer storeId;

    public ProductAttribute() {
    }

    public Integer getProductAttributeCategoryId() {
        return this.productAttributeCategoryId;
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public ProductAttribute setProductAttributeCategoryId(Integer productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
        return this;
    }

    public ProductAttribute setName(String name) {
        this.name = name;
        return this;
    }

    public ProductAttribute setType(Integer type) {
        this.type = type;
        return this;
    }

    public ProductAttribute setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public ProductAttribute setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public String toString() {
        return "ProductAttribute(productAttributeCategoryId=" + this.getProductAttributeCategoryId() + ", name=" + this.getName() + ", type=" + this.getType() + ", sort=" + this.getSort() + ", storeId=" + this.getStoreId() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductAttribute)) return false;
        final ProductAttribute other = (ProductAttribute) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$productAttributeCategoryId = this.getProductAttributeCategoryId();
        final Object other$productAttributeCategoryId = other.getProductAttributeCategoryId();
        if (this$productAttributeCategoryId == null ? other$productAttributeCategoryId != null : !this$productAttributeCategoryId.equals(other$productAttributeCategoryId))
            return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductAttribute;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $productAttributeCategoryId = this.getProductAttributeCategoryId();
        result = result * PRIME + ($productAttributeCategoryId == null ? 43 : $productAttributeCategoryId.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        return result;
    }
}