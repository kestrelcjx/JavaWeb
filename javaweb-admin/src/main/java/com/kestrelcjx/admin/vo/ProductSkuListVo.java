package com.kestrelcjx.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品SKU列表Vo
 */
public class ProductSkuListVo {
    /**
     * 商品SKUID
     */
    private Integer id;
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
     * 图片
     */
    private String imageUrl;
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
     * 活动类型描述
     */
    private String typeName;
    /**
     * 活动限购数量
     */
    private Integer quota;
    /**
     * 所属店铺ID
     */
    private Integer storeId;
    /**
     * 添加人
     */
    private Integer createUser;
    /**
     * 添加人名称
     */
    private String createUserName;
    /**
     * 添加时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新人
     */
    private Integer updateUser;
    /**
     * 更新人名称
     */
    private String updateUserName;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    public ProductSkuListVo() {
    }

    public Integer getId() {
        return this.id;
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

    public String getImageUrl() {
        return this.imageUrl;
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

    public String getTypeName() {
        return this.typeName;
    }

    public Integer getQuota() {
        return this.quota;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public Integer getCreateUser() {
        return this.createUser;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public String getUpdateUserName() {
        return this.updateUserName;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
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

    public void setImage(String image) {
        this.image = image;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductSkuListVo)) return false;
        final ProductSkuListVo other = (ProductSkuListVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
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
        final Object this$imageUrl = this.getImageUrl();
        final Object other$imageUrl = other.getImageUrl();
        if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) return false;
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
        final Object this$typeName = this.getTypeName();
        final Object other$typeName = other.getTypeName();
        if (this$typeName == null ? other$typeName != null : !this$typeName.equals(other$typeName)) return false;
        final Object this$quota = this.getQuota();
        final Object other$quota = other.getQuota();
        if (this$quota == null ? other$quota != null : !this$quota.equals(other$quota)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        final Object this$createUser = this.getCreateUser();
        final Object other$createUser = other.getCreateUser();
        if (this$createUser == null ? other$createUser != null : !this$createUser.equals(other$createUser))
            return false;
        final Object this$createUserName = this.getCreateUserName();
        final Object other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName))
            return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$updateUser = this.getUpdateUser();
        final Object other$updateUser = other.getUpdateUser();
        if (this$updateUser == null ? other$updateUser != null : !this$updateUser.equals(other$updateUser))
            return false;
        final Object this$updateUserName = this.getUpdateUserName();
        final Object other$updateUserName = other.getUpdateUserName();
        if (this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductSkuListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
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
        final Object $imageUrl = this.getImageUrl();
        result = result * PRIME + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        final Object $weight = this.getWeight();
        result = result * PRIME + ($weight == null ? 43 : $weight.hashCode());
        final Object $volume = this.getVolume();
        result = result * PRIME + ($volume == null ? 43 : $volume.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $typeName = this.getTypeName();
        result = result * PRIME + ($typeName == null ? 43 : $typeName.hashCode());
        final Object $quota = this.getQuota();
        result = result * PRIME + ($quota == null ? 43 : $quota.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        final Object $createUser = this.getCreateUser();
        result = result * PRIME + ($createUser == null ? 43 : $createUser.hashCode());
        final Object $createUserName = this.getCreateUserName();
        result = result * PRIME + ($createUserName == null ? 43 : $createUserName.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateUser = this.getUpdateUser();
        result = result * PRIME + ($updateUser == null ? 43 : $updateUser.hashCode());
        final Object $updateUserName = this.getUpdateUserName();
        result = result * PRIME + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSkuListVo(id=" + this.getId() + ", productId=" + this.getProductId() + ", productPic=" + this.getProductPic() + ", skuCode=" + this.getSkuCode() + ", attributeValue=" + this.getAttributeValue() + ", stock=" + this.getStock() + ", sales=" + this.getSales() + ", lowStock=" + this.getLowStock() + ", lockStock=" + this.getLockStock() + ", price=" + this.getPrice() + ", costPrice=" + this.getCostPrice() + ", originalPrice=" + this.getOriginalPrice() + ", image=" + this.getImage() + ", imageUrl=" + this.getImageUrl() + ", weight=" + this.getWeight() + ", volume=" + this.getVolume() + ", status=" + this.getStatus() + ", type=" + this.getType() + ", typeName=" + this.getTypeName() + ", quota=" + this.getQuota() + ", storeId=" + this.getStoreId() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}