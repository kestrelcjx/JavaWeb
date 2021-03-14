package com.kestrelcjx.admin.dto;

/**
 * 删除商品SKU设置Dto
 */
public class DeleteSkuDto {
    /**
     * 商品ID
     */
    private Integer productId;
    /**
     * SKU属性值
     */
    private String attributeValue;

    public DeleteSkuDto() {
    }

    public Integer getProductId() {
        return this.productId;
    }

    public String getAttributeValue() {
        return this.attributeValue;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DeleteSkuDto)) return false;
        final DeleteSkuDto other = (DeleteSkuDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) return false;
        final Object this$attributeValue = this.getAttributeValue();
        final Object other$attributeValue = other.getAttributeValue();
        if (this$attributeValue == null ? other$attributeValue != null : !this$attributeValue.equals(other$attributeValue))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DeleteSkuDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $attributeValue = this.getAttributeValue();
        result = result * PRIME + ($attributeValue == null ? 43 : $attributeValue.hashCode());
        return result;
    }

    public String toString() {
        return "DeleteSkuDto(productId=" + this.getProductId() + ", attributeValue=" + this.getAttributeValue() + ")";
    }
}
