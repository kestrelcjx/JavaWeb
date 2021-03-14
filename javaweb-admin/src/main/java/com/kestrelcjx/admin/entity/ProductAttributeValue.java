package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;


/**
 * 商品属性值
 */
@TableName("pms_product_attribute_value")
public class ProductAttributeValue extends BaseEntity {
    /**
     * 商品ID
     */
    private Integer productId;
    /**
     * 商品属性ID
     */
    private Integer productAttributeId;
    /**
     * 商品属性名称
     */
    private String productAttributeName;
    /**
     * 商品属性类型
     */
    private Integer productAttributeType;
    /**
     * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    private String productAttributeValue;
    /**
     * 所属店铺ID
     */
    private Integer storeId;
    /**
     * 排序号
     */
    private Integer sort;

    public ProductAttributeValue() {
    }

    public Integer getProductId() {
        return this.productId;
    }

    public Integer getProductAttributeId() {
        return this.productAttributeId;
    }

    public String getProductAttributeName() {
        return this.productAttributeName;
    }

    public Integer getProductAttributeType() {
        return this.productAttributeType;
    }

    public String getProductAttributeValue() {
        return this.productAttributeValue;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public Integer getSort() {
        return this.sort;
    }

    public ProductAttributeValue setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public ProductAttributeValue setProductAttributeId(Integer productAttributeId) {
        this.productAttributeId = productAttributeId;
        return this;
    }

    public ProductAttributeValue setProductAttributeName(String productAttributeName) {
        this.productAttributeName = productAttributeName;
        return this;
    }

    public ProductAttributeValue setProductAttributeType(Integer productAttributeType) {
        this.productAttributeType = productAttributeType;
        return this;
    }

    public ProductAttributeValue setProductAttributeValue(String productAttributeValue) {
        this.productAttributeValue = productAttributeValue;
        return this;
    }

    public ProductAttributeValue setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public ProductAttributeValue setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "ProductAttributeValue(productId=" + this.getProductId() + ", productAttributeId=" + this.getProductAttributeId() + ", productAttributeName=" + this.getProductAttributeName() + ", productAttributeType=" + this.getProductAttributeType() + ", productAttributeValue=" + this.getProductAttributeValue() + ", storeId=" + this.getStoreId() + ", sort=" + this.getSort() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductAttributeValue)) return false;
        final ProductAttributeValue other = (ProductAttributeValue) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) return false;
        final Object this$productAttributeId = this.getProductAttributeId();
        final Object other$productAttributeId = other.getProductAttributeId();
        if (this$productAttributeId == null ? other$productAttributeId != null : !this$productAttributeId.equals(other$productAttributeId))
            return false;
        final Object this$productAttributeName = this.getProductAttributeName();
        final Object other$productAttributeName = other.getProductAttributeName();
        if (this$productAttributeName == null ? other$productAttributeName != null : !this$productAttributeName.equals(other$productAttributeName))
            return false;
        final Object this$productAttributeType = this.getProductAttributeType();
        final Object other$productAttributeType = other.getProductAttributeType();
        if (this$productAttributeType == null ? other$productAttributeType != null : !this$productAttributeType.equals(other$productAttributeType))
            return false;
        final Object this$productAttributeValue = this.getProductAttributeValue();
        final Object other$productAttributeValue = other.getProductAttributeValue();
        if (this$productAttributeValue == null ? other$productAttributeValue != null : !this$productAttributeValue.equals(other$productAttributeValue))
            return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductAttributeValue;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $productAttributeId = this.getProductAttributeId();
        result = result * PRIME + ($productAttributeId == null ? 43 : $productAttributeId.hashCode());
        final Object $productAttributeName = this.getProductAttributeName();
        result = result * PRIME + ($productAttributeName == null ? 43 : $productAttributeName.hashCode());
        final Object $productAttributeType = this.getProductAttributeType();
        result = result * PRIME + ($productAttributeType == null ? 43 : $productAttributeType.hashCode());
        final Object $productAttributeValue = this.getProductAttributeValue();
        result = result * PRIME + ($productAttributeValue == null ? 43 : $productAttributeValue.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        return result;
    }
}