package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;


/**
 * 产品属性分类
 */
@TableName("pms_product_attribute_category")
public class ProductAttributeCategory extends BaseEntity {
    /**
     * 分类名称
     */
    private String name;
    /**
     * 分类图片
     */
    private String image;
    /**
     * 店铺ID
     */
    private Integer storeId;
    /**
     * 排序号
     */
    private Integer sort;

    public ProductAttributeCategory() {
    }

    public String getName() {
        return this.name;
    }

    public String getImage() {
        return this.image;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public Integer getSort() {
        return this.sort;
    }

    public ProductAttributeCategory setName(String name) {
        this.name = name;
        return this;
    }

    public ProductAttributeCategory setImage(String image) {
        this.image = image;
        return this;
    }

    public ProductAttributeCategory setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public ProductAttributeCategory setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "ProductAttributeCategory(name=" + this.getName() + ", image=" + this.getImage() + ", storeId=" + this.getStoreId() + ", sort=" + this.getSort() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductAttributeCategory)) return false;
        final ProductAttributeCategory other = (ProductAttributeCategory) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$image = this.getImage();
        final Object other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductAttributeCategory;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $image = this.getImage();
        result = result * PRIME + ($image == null ? 43 : $image.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        return result;
    }
}