package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

import java.math.BigDecimal;


/**
 * 商品SKU
 */
@TableName("pms_product_sku")
public class ProductSku extends BaseEntity {
    /**
     * 商品ID
     */
    private Integer productId;
    /**
     * 商品图片
     */
    private String productPic;
    /**
     * SKU编码
     */
    private String skuCode;
    /**
     * 商品属性索引值 (attribute_value,attribute_value[,....])
     */
    private String attributeValue;
    /**
     * 属性对应的库存
     */
    private Integer stock;
    /**
     * 销量
     */
    private Integer sales;
    /**
     * 预警库存
     */
    private Integer lowStock;
    /**
     * 锁定库存
     */
    private Integer lockStock;
    /**
     * 属性金额
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
     * 图片
     */
    private String image;
    /**
     * 重量
     */
    private BigDecimal weight;
    /**
     * 体积
     */
    private BigDecimal volume;
    /**
     * 状态：1在用 2停用
     */
    private Integer status;
    /**
     * 活动类型：1商品 2秒杀 3砍价 4拼团
     */
    private Integer type;
    /**
     * 活动限购数量
     */
    private Integer quota;
    /**
     * 所属店铺ID
     */
    private Integer storeId;

    public ProductSku() {
    }

    public Integer getProductId() {
        return this.productId;
    }

    public String getProductPic() {
        return this.productPic;
    }

    public String getSkuCode() {
        return this.skuCode;
    }

    public String getAttributeValue() {
        return this.attributeValue;
    }

    public Integer getStock() {
        return this.stock;
    }

    public Integer getSales() {
        return this.sales;
    }

    public Integer getLowStock() {
        return this.lowStock;
    }

    public Integer getLockStock() {
        return this.lockStock;
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

    public String getImage() {
        return this.image;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getQuota() {
        return this.quota;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public ProductSku setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public ProductSku setProductPic(String productPic) {
        this.productPic = productPic;
        return this;
    }

    public ProductSku setSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }

    public ProductSku setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }

    public ProductSku setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public ProductSku setSales(Integer sales) {
        this.sales = sales;
        return this;
    }

    public ProductSku setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
        return this;
    }

    public ProductSku setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
        return this;
    }

    public ProductSku setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ProductSku setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
        return this;
    }

    public ProductSku setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    public ProductSku setImage(String image) {
        this.image = image;
        return this;
    }

    public ProductSku setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    public ProductSku setVolume(BigDecimal volume) {
        this.volume = volume;
        return this;
    }

    public ProductSku setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public ProductSku setType(Integer type) {
        this.type = type;
        return this;
    }

    public ProductSku setQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    public ProductSku setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public String toString() {
        return "ProductSku(productId=" + this.getProductId() + ", productPic=" + this.getProductPic() + ", skuCode=" + this.getSkuCode() + ", attributeValue=" + this.getAttributeValue() + ", stock=" + this.getStock() + ", sales=" + this.getSales() + ", lowStock=" + this.getLowStock() + ", lockStock=" + this.getLockStock() + ", price=" + this.getPrice() + ", costPrice=" + this.getCostPrice() + ", originalPrice=" + this.getOriginalPrice() + ", image=" + this.getImage() + ", weight=" + this.getWeight() + ", volume=" + this.getVolume() + ", status=" + this.getStatus() + ", type=" + this.getType() + ", quota=" + this.getQuota() + ", storeId=" + this.getStoreId() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductSku)) return false;
        final ProductSku other = (ProductSku) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) return false;
        final Object this$productPic = this.getProductPic();
        final Object other$productPic = other.getProductPic();
        if (this$productPic == null ? other$productPic != null : !this$productPic.equals(other$productPic))
            return false;
        final Object this$skuCode = this.getSkuCode();
        final Object other$skuCode = other.getSkuCode();
        if (this$skuCode == null ? other$skuCode != null : !this$skuCode.equals(other$skuCode)) return false;
        final Object this$attributeValue = this.getAttributeValue();
        final Object other$attributeValue = other.getAttributeValue();
        if (this$attributeValue == null ? other$attributeValue != null : !this$attributeValue.equals(other$attributeValue))
            return false;
        final Object this$stock = this.getStock();
        final Object other$stock = other.getStock();
        if (this$stock == null ? other$stock != null : !this$stock.equals(other$stock)) return false;
        final Object this$sales = this.getSales();
        final Object other$sales = other.getSales();
        if (this$sales == null ? other$sales != null : !this$sales.equals(other$sales)) return false;
        final Object this$lowStock = this.getLowStock();
        final Object other$lowStock = other.getLowStock();
        if (this$lowStock == null ? other$lowStock != null : !this$lowStock.equals(other$lowStock)) return false;
        final Object this$lockStock = this.getLockStock();
        final Object other$lockStock = other.getLockStock();
        if (this$lockStock == null ? other$lockStock != null : !this$lockStock.equals(other$lockStock)) return false;
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
        final Object this$image = this.getImage();
        final Object other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
        final Object this$weight = this.getWeight();
        final Object other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) return false;
        final Object this$volume = this.getVolume();
        final Object other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$quota = this.getQuota();
        final Object other$quota = other.getQuota();
        if (this$quota == null ? other$quota != null : !this$quota.equals(other$quota)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductSku;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $productPic = this.getProductPic();
        result = result * PRIME + ($productPic == null ? 43 : $productPic.hashCode());
        final Object $skuCode = this.getSkuCode();
        result = result * PRIME + ($skuCode == null ? 43 : $skuCode.hashCode());
        final Object $attributeValue = this.getAttributeValue();
        result = result * PRIME + ($attributeValue == null ? 43 : $attributeValue.hashCode());
        final Object $stock = this.getStock();
        result = result * PRIME + ($stock == null ? 43 : $stock.hashCode());
        final Object $sales = this.getSales();
        result = result * PRIME + ($sales == null ? 43 : $sales.hashCode());
        final Object $lowStock = this.getLowStock();
        result = result * PRIME + ($lowStock == null ? 43 : $lowStock.hashCode());
        final Object $lockStock = this.getLockStock();
        result = result * PRIME + ($lockStock == null ? 43 : $lockStock.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $costPrice = this.getCostPrice();
        result = result * PRIME + ($costPrice == null ? 43 : $costPrice.hashCode());
        final Object $originalPrice = this.getOriginalPrice();
        result = result * PRIME + ($originalPrice == null ? 43 : $originalPrice.hashCode());
        final Object $image = this.getImage();
        result = result * PRIME + ($image == null ? 43 : $image.hashCode());
        final Object $weight = this.getWeight();
        result = result * PRIME + ($weight == null ? 43 : $weight.hashCode());
        final Object $volume = this.getVolume();
        result = result * PRIME + ($volume == null ? 43 : $volume.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $quota = this.getQuota();
        result = result * PRIME + ($quota == null ? 43 : $quota.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        return result;
    }
}