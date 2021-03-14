package com.kestrelcjx.admin.dto;

import java.util.List;

/**
 * 更新商品SKU设置Dto
 */
public class UpdateSkuDto {
    /**
     * 商品ID
     */
    private Integer productId;
    /**
     * SKU列表
     */
    private List<ProductSkuListDto> skuList;

    public UpdateSkuDto() {
    }

    public Integer getProductId() {
        return this.productId;
    }

    public List<ProductSkuListDto> getSkuList() {
        return this.skuList;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setSkuList(List<ProductSkuListDto> skuList) {
        this.skuList = skuList;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UpdateSkuDto)) return false;
        final UpdateSkuDto other = (UpdateSkuDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) return false;
        final Object this$skuList = this.getSkuList();
        final Object other$skuList = other.getSkuList();
        if (this$skuList == null ? other$skuList != null : !this$skuList.equals(other$skuList)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UpdateSkuDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $skuList = this.getSkuList();
        result = result * PRIME + ($skuList == null ? 43 : $skuList.hashCode());
        return result;
    }

    public String toString() {
        return "UpdateSkuDto(productId=" + this.getProductId() + ", skuList=" + this.getSkuList() + ")";
    }
}
