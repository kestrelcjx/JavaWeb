package com.kestrelcjx.admin.dto;

import java.math.BigDecimal;

/**
 * 商品SKU列表Dto
 */
public class ProductSkuListDto {
    /**
     * SKU值
     */
    private String attributeValue;
    /**
     * 商品图片
     */
    private String productPic;
    /**
     * 销售价
     */
    private BigDecimal price;
    /**
     * 成本价
     */
    private BigDecimal costPrice;
    /**
     * 原价
     */
    private BigDecimal originalPrice;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * SKU编码
     */
    private String skuCode;
    /**
     * 体积(m³)
     */
    private BigDecimal volume;
    /**
     * 重量(KG)
     */
    private BigDecimal weight;
    /**
     * 状态：1在用 2停用
     */
    private Integer status;

    public ProductSkuListDto() {
    }

    public String getAttributeValue() {
        return this.attributeValue;
    }

    public String getProductPic() {
        return this.productPic;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public BigDecimal getCostPrice() {
        return this.costPrice;
    }

    public BigDecimal getOriginalPrice() {
        return this.originalPrice;
    }

    public Integer getStock() {
        return this.stock;
    }

    public String getSkuCode() {
        return this.skuCode;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductSkuListDto)) return false;
        final ProductSkuListDto other = (ProductSkuListDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$attributeValue = this.getAttributeValue();
        final Object other$attributeValue = other.getAttributeValue();
        if (this$attributeValue == null ? other$attributeValue != null : !this$attributeValue.equals(other$attributeValue))
            return false;
        final Object this$productPic = this.getProductPic();
        final Object other$productPic = other.getProductPic();
        if (this$productPic == null ? other$productPic != null : !this$productPic.equals(other$productPic))
            return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$costPrice = this.getCostPrice();
        final Object other$costPrice = other.getCostPrice();
        if (this$costPrice == null ? other$costPrice != null : !this$costPrice.equals(other$costPrice)) return false;
        final Object this$originalPrice = this.getOriginalPrice();
        final Object other$originalPrice = other.getOriginalPrice();
        if (this$originalPrice == null ? other$originalPrice != null : !this$originalPrice.equals(other$originalPrice))
            return false;
        final Object this$stock = this.getStock();
        final Object other$stock = other.getStock();
        if (this$stock == null ? other$stock != null : !this$stock.equals(other$stock)) return false;
        final Object this$skuCode = this.getSkuCode();
        final Object other$skuCode = other.getSkuCode();
        if (this$skuCode == null ? other$skuCode != null : !this$skuCode.equals(other$skuCode)) return false;
        final Object this$volume = this.getVolume();
        final Object other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) return false;
        final Object this$weight = this.getWeight();
        final Object other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductSkuListDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $attributeValue = this.getAttributeValue();
        result = result * PRIME + ($attributeValue == null ? 43 : $attributeValue.hashCode());
        final Object $productPic = this.getProductPic();
        result = result * PRIME + ($productPic == null ? 43 : $productPic.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $costPrice = this.getCostPrice();
        result = result * PRIME + ($costPrice == null ? 43 : $costPrice.hashCode());
        final Object $originalPrice = this.getOriginalPrice();
        result = result * PRIME + ($originalPrice == null ? 43 : $originalPrice.hashCode());
        final Object $stock = this.getStock();
        result = result * PRIME + ($stock == null ? 43 : $stock.hashCode());
        final Object $skuCode = this.getSkuCode();
        result = result * PRIME + ($skuCode == null ? 43 : $skuCode.hashCode());
        final Object $volume = this.getVolume();
        result = result * PRIME + ($volume == null ? 43 : $volume.hashCode());
        final Object $weight = this.getWeight();
        result = result * PRIME + ($weight == null ? 43 : $weight.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSkuListDto(attributeValue=" + this.getAttributeValue() + ", productPic=" + this.getProductPic() + ", price=" + this.getPrice() + ", costPrice=" + this.getCostPrice() + ", originalPrice=" + this.getOriginalPrice() + ", stock=" + this.getStock() + ", skuCode=" + this.getSkuCode() + ", volume=" + this.getVolume() + ", weight=" + this.getWeight() + ", status=" + this.getStatus() + ")";
    }
}
