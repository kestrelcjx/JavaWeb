package com.kestrelcjx.admin.dto;

import java.util.List;

/**
 * 生成商品SKU设置Dto
 */
public class GenerateSkuDto {
    /**
     * 商品ID
     */
    private Integer productId;
    /**
     * 规格
     */
    private List<String> specs;
    /**
     * 属性
     */
    private List<List<String>> attrs;
    /**
     * SKU列表
     */
    private List<ProductSkuListDto> skuList;

    public GenerateSkuDto() {
    }

    public Integer getProductId() {
        return this.productId;
    }

    public List<String> getSpecs() {
        return this.specs;
    }

    public List<List<String>> getAttrs() {
        return this.attrs;
    }

    public List<ProductSkuListDto> getSkuList() {
        return this.skuList;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setSpecs(List<String> specs) {
        this.specs = specs;
    }

    public void setAttrs(List<List<String>> attrs) {
        this.attrs = attrs;
    }

    public void setSkuList(List<ProductSkuListDto> skuList) {
        this.skuList = skuList;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GenerateSkuDto)) return false;
        final GenerateSkuDto other = (GenerateSkuDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) return false;
        final Object this$specs = this.getSpecs();
        final Object other$specs = other.getSpecs();
        if (this$specs == null ? other$specs != null : !this$specs.equals(other$specs)) return false;
        final Object this$attrs = this.getAttrs();
        final Object other$attrs = other.getAttrs();
        if (this$attrs == null ? other$attrs != null : !this$attrs.equals(other$attrs)) return false;
        final Object this$skuList = this.getSkuList();
        final Object other$skuList = other.getSkuList();
        if (this$skuList == null ? other$skuList != null : !this$skuList.equals(other$skuList)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GenerateSkuDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $specs = this.getSpecs();
        result = result * PRIME + ($specs == null ? 43 : $specs.hashCode());
        final Object $attrs = this.getAttrs();
        result = result * PRIME + ($attrs == null ? 43 : $attrs.hashCode());
        final Object $skuList = this.getSkuList();
        result = result * PRIME + ($skuList == null ? 43 : $skuList.hashCode());
        return result;
    }

    public String toString() {
        return "GenerateSkuDto(productId=" + this.getProductId() + ", specs=" + this.getSpecs() + ", attrs=" + this.getAttrs() + ", skuList=" + this.getSkuList() + ")";
    }
}
