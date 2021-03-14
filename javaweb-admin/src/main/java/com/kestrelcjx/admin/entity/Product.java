package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kestrelcjx.common.common.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 商品
 */
@TableName("pms_product")
public class Product extends BaseEntity {
    /**
     * 商品分类ID
     */
    private Integer productCategoryId;
    /**
     * 商品属性分类ID
     */
    private Integer productAttributeCategoryId;
    /**
     * 商品标题
     */
    private String productTitle;
    /**
     * 商品副标题
     */
    private String productSubTitle;
    /**
     * 商品简介
     */
    private String productInfo;
    /**
     * 商品标签
     */
    private String productTags;
    /**
     * 品牌ID
     */
    private Integer brandId;
    /**
     * 商品封面
     */
    private String cover;
    /**
     * 商品图片,连产品图片限制为5张，以逗号分割
     */
    private String image;
    /**
     * 主图视频链接
     */
    private String video;
    /**
     * 是否热卖：1是 2否
     */
    private Integer isHot;
    /**
     * 是否推荐：1是 2否
     */
    private Integer isRecommand;
    /**
     * 是否新品：1是 2否
     */
    private Integer isNew;
    /**
     * 预告商品：1是 2否
     */
    private Integer isPreview;
    /**
     * 审核状态：1已审核 2待审核
     */
    private Integer verifyStatus;
    /**
     * 上架状态：1已上架 2已下架
     */
    private Integer status;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 销量
     */
    private Integer sales;
    /**
     * 商品售价（单位 元）
     */
    private BigDecimal price;
    /**
     * 赠送的成长值
     */
    private Integer giftGrowth;
    /**
     * 赠送的积分
     */
    private Integer giftIntegral;
    /**
     * 限制使用的积分数
     */
    private Integer useIntegralLimit;
    /**
     * 成本价(单位 元)
     */
    private BigDecimal costPrice;
    /**
     * 市场价
     */
    private BigDecimal originalPrice;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * 库存预警值
     */
    private Integer lowStock;
    /**
     * 计量单位
     */
    private String unit;
    /**
     * 商品编号
     */
    private String productSn;
    /**
     * 体积(m³)
     */
    private BigDecimal volume;
    /**
     * 重量(KG)
     */
    private BigDecimal weight;
    /**
     * 产品服务：1无忧退货 2快速退款 3免费包邮
     */
    private String service;
    /**
     * 关键词
     */
    private String keywords;
    /**
     * 商品备注
     */
    private String note;
    /**
     * 促销开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date promotionStartTime;
    /**
     * 促销结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date promotionEndTime;
    /**
     * 促销价格
     */
    private BigDecimal promotionPrice;
    /**
     * 活动限购数量
     */
    private Integer promotionPerLimit;
    /**
     * 促销类型：0没有促销使用原价 1使用促销价 2使用会员价 3使用阶梯价格 4使用满减价 5限时购
     */
    private Integer promotionType;
    /**
     * 是否包邮：1是 2否
     */
    private Integer isPostage;
    /**
     * 邮费(单位 元)
     */
    private BigDecimal postage;
    /**
     * 运费模板ID
     */
    private Integer feightTemplateId;
    /**
     * 浏览量
     */
    private Integer browse;
    /**
     * 所属店铺ID
     */
    private Integer storeId;

    public Product() {
    }

    public Integer getProductCategoryId() {
        return this.productCategoryId;
    }

    public Integer getProductAttributeCategoryId() {
        return this.productAttributeCategoryId;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public String getProductSubTitle() {
        return this.productSubTitle;
    }

    public String getProductInfo() {
        return this.productInfo;
    }

    public String getProductTags() {
        return this.productTags;
    }

    public Integer getBrandId() {
        return this.brandId;
    }

    public String getCover() {
        return this.cover;
    }

    public String getImage() {
        return this.image;
    }

    public String getVideo() {
        return this.video;
    }

    public Integer getIsHot() {
        return this.isHot;
    }

    public Integer getIsRecommand() {
        return this.isRecommand;
    }

    public Integer getIsNew() {
        return this.isNew;
    }

    public Integer getIsPreview() {
        return this.isPreview;
    }

    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getSales() {
        return this.sales;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Integer getGiftGrowth() {
        return this.giftGrowth;
    }

    public Integer getGiftIntegral() {
        return this.giftIntegral;
    }

    public Integer getUseIntegralLimit() {
        return this.useIntegralLimit;
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

    public Integer getLowStock() {
        return this.lowStock;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getProductSn() {
        return this.productSn;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public String getService() {
        return this.service;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public String getNote() {
        return this.note;
    }

    public Date getPromotionStartTime() {
        return this.promotionStartTime;
    }

    public Date getPromotionEndTime() {
        return this.promotionEndTime;
    }

    public BigDecimal getPromotionPrice() {
        return this.promotionPrice;
    }

    public Integer getPromotionPerLimit() {
        return this.promotionPerLimit;
    }

    public Integer getPromotionType() {
        return this.promotionType;
    }

    public Integer getIsPostage() {
        return this.isPostage;
    }

    public BigDecimal getPostage() {
        return this.postage;
    }

    public Integer getFeightTemplateId() {
        return this.feightTemplateId;
    }

    public Integer getBrowse() {
        return this.browse;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public Product setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
        return this;
    }

    public Product setProductAttributeCategoryId(Integer productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
        return this;
    }

    public Product setProductTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }

    public Product setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
        return this;
    }

    public Product setProductInfo(String productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public Product setProductTags(String productTags) {
        this.productTags = productTags;
        return this;
    }

    public Product setBrandId(Integer brandId) {
        this.brandId = brandId;
        return this;
    }

    public Product setCover(String cover) {
        this.cover = cover;
        return this;
    }

    public Product setImage(String image) {
        this.image = image;
        return this;
    }

    public Product setVideo(String video) {
        this.video = video;
        return this;
    }

    public Product setIsHot(Integer isHot) {
        this.isHot = isHot;
        return this;
    }

    public Product setIsRecommand(Integer isRecommand) {
        this.isRecommand = isRecommand;
        return this;
    }

    public Product setIsNew(Integer isNew) {
        this.isNew = isNew;
        return this;
    }

    public Product setIsPreview(Integer isPreview) {
        this.isPreview = isPreview;
        return this;
    }

    public Product setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }

    public Product setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Product setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public Product setSales(Integer sales) {
        this.sales = sales;
        return this;
    }

    public Product setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Product setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
        return this;
    }

    public Product setGiftIntegral(Integer giftIntegral) {
        this.giftIntegral = giftIntegral;
        return this;
    }

    public Product setUseIntegralLimit(Integer useIntegralLimit) {
        this.useIntegralLimit = useIntegralLimit;
        return this;
    }

    public Product setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
        return this;
    }

    public Product setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    public Product setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public Product setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
        return this;
    }

    public Product setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public Product setProductSn(String productSn) {
        this.productSn = productSn;
        return this;
    }

    public Product setVolume(BigDecimal volume) {
        this.volume = volume;
        return this;
    }

    public Product setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    public Product setService(String service) {
        this.service = service;
        return this;
    }

    public Product setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    public Product setNote(String note) {
        this.note = note;
        return this;
    }

    public Product setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
        return this;
    }

    public Product setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
        return this;
    }

    public Product setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
        return this;
    }

    public Product setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
        return this;
    }

    public Product setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
        return this;
    }

    public Product setIsPostage(Integer isPostage) {
        this.isPostage = isPostage;
        return this;
    }

    public Product setPostage(BigDecimal postage) {
        this.postage = postage;
        return this;
    }

    public Product setFeightTemplateId(Integer feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
        return this;
    }

    public Product setBrowse(Integer browse) {
        this.browse = browse;
        return this;
    }

    public Product setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public String toString() {
        return "Product(productCategoryId=" + this.getProductCategoryId() + ", productAttributeCategoryId=" + this.getProductAttributeCategoryId() + ", productTitle=" + this.getProductTitle() + ", productSubTitle=" + this.getProductSubTitle() + ", productInfo=" + this.getProductInfo() + ", productTags=" + this.getProductTags() + ", brandId=" + this.getBrandId() + ", cover=" + this.getCover() + ", image=" + this.getImage() + ", video=" + this.getVideo() + ", isHot=" + this.getIsHot() + ", isRecommand=" + this.getIsRecommand() + ", isNew=" + this.getIsNew() + ", isPreview=" + this.getIsPreview() + ", verifyStatus=" + this.getVerifyStatus() + ", status=" + this.getStatus() + ", sort=" + this.getSort() + ", sales=" + this.getSales() + ", price=" + this.getPrice() + ", giftGrowth=" + this.getGiftGrowth() + ", giftIntegral=" + this.getGiftIntegral() + ", useIntegralLimit=" + this.getUseIntegralLimit() + ", costPrice=" + this.getCostPrice() + ", originalPrice=" + this.getOriginalPrice() + ", stock=" + this.getStock() + ", lowStock=" + this.getLowStock() + ", unit=" + this.getUnit() + ", productSn=" + this.getProductSn() + ", volume=" + this.getVolume() + ", weight=" + this.getWeight() + ", service=" + this.getService() + ", keywords=" + this.getKeywords() + ", note=" + this.getNote() + ", promotionStartTime=" + this.getPromotionStartTime() + ", promotionEndTime=" + this.getPromotionEndTime() + ", promotionPrice=" + this.getPromotionPrice() + ", promotionPerLimit=" + this.getPromotionPerLimit() + ", promotionType=" + this.getPromotionType() + ", isPostage=" + this.getIsPostage() + ", postage=" + this.getPostage() + ", feightTemplateId=" + this.getFeightTemplateId() + ", browse=" + this.getBrowse() + ", storeId=" + this.getStoreId() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Product)) return false;
        final Product other = (Product) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$productCategoryId = this.getProductCategoryId();
        final Object other$productCategoryId = other.getProductCategoryId();
        if (this$productCategoryId == null ? other$productCategoryId != null : !this$productCategoryId.equals(other$productCategoryId))
            return false;
        final Object this$productAttributeCategoryId = this.getProductAttributeCategoryId();
        final Object other$productAttributeCategoryId = other.getProductAttributeCategoryId();
        if (this$productAttributeCategoryId == null ? other$productAttributeCategoryId != null : !this$productAttributeCategoryId.equals(other$productAttributeCategoryId))
            return false;
        final Object this$productTitle = this.getProductTitle();
        final Object other$productTitle = other.getProductTitle();
        if (this$productTitle == null ? other$productTitle != null : !this$productTitle.equals(other$productTitle))
            return false;
        final Object this$productSubTitle = this.getProductSubTitle();
        final Object other$productSubTitle = other.getProductSubTitle();
        if (this$productSubTitle == null ? other$productSubTitle != null : !this$productSubTitle.equals(other$productSubTitle))
            return false;
        final Object this$productInfo = this.getProductInfo();
        final Object other$productInfo = other.getProductInfo();
        if (this$productInfo == null ? other$productInfo != null : !this$productInfo.equals(other$productInfo))
            return false;
        final Object this$productTags = this.getProductTags();
        final Object other$productTags = other.getProductTags();
        if (this$productTags == null ? other$productTags != null : !this$productTags.equals(other$productTags))
            return false;
        final Object this$brandId = this.getBrandId();
        final Object other$brandId = other.getBrandId();
        if (this$brandId == null ? other$brandId != null : !this$brandId.equals(other$brandId)) return false;
        final Object this$cover = this.getCover();
        final Object other$cover = other.getCover();
        if (this$cover == null ? other$cover != null : !this$cover.equals(other$cover)) return false;
        final Object this$image = this.getImage();
        final Object other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
        final Object this$video = this.getVideo();
        final Object other$video = other.getVideo();
        if (this$video == null ? other$video != null : !this$video.equals(other$video)) return false;
        final Object this$isHot = this.getIsHot();
        final Object other$isHot = other.getIsHot();
        if (this$isHot == null ? other$isHot != null : !this$isHot.equals(other$isHot)) return false;
        final Object this$isRecommand = this.getIsRecommand();
        final Object other$isRecommand = other.getIsRecommand();
        if (this$isRecommand == null ? other$isRecommand != null : !this$isRecommand.equals(other$isRecommand))
            return false;
        final Object this$isNew = this.getIsNew();
        final Object other$isNew = other.getIsNew();
        if (this$isNew == null ? other$isNew != null : !this$isNew.equals(other$isNew)) return false;
        final Object this$isPreview = this.getIsPreview();
        final Object other$isPreview = other.getIsPreview();
        if (this$isPreview == null ? other$isPreview != null : !this$isPreview.equals(other$isPreview)) return false;
        final Object this$verifyStatus = this.getVerifyStatus();
        final Object other$verifyStatus = other.getVerifyStatus();
        if (this$verifyStatus == null ? other$verifyStatus != null : !this$verifyStatus.equals(other$verifyStatus))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$sales = this.getSales();
        final Object other$sales = other.getSales();
        if (this$sales == null ? other$sales != null : !this$sales.equals(other$sales)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$giftGrowth = this.getGiftGrowth();
        final Object other$giftGrowth = other.getGiftGrowth();
        if (this$giftGrowth == null ? other$giftGrowth != null : !this$giftGrowth.equals(other$giftGrowth))
            return false;
        final Object this$giftIntegral = this.getGiftIntegral();
        final Object other$giftIntegral = other.getGiftIntegral();
        if (this$giftIntegral == null ? other$giftIntegral != null : !this$giftIntegral.equals(other$giftIntegral))
            return false;
        final Object this$useIntegralLimit = this.getUseIntegralLimit();
        final Object other$useIntegralLimit = other.getUseIntegralLimit();
        if (this$useIntegralLimit == null ? other$useIntegralLimit != null : !this$useIntegralLimit.equals(other$useIntegralLimit))
            return false;
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
        final Object this$lowStock = this.getLowStock();
        final Object other$lowStock = other.getLowStock();
        if (this$lowStock == null ? other$lowStock != null : !this$lowStock.equals(other$lowStock)) return false;
        final Object this$unit = this.getUnit();
        final Object other$unit = other.getUnit();
        if (this$unit == null ? other$unit != null : !this$unit.equals(other$unit)) return false;
        final Object this$productSn = this.getProductSn();
        final Object other$productSn = other.getProductSn();
        if (this$productSn == null ? other$productSn != null : !this$productSn.equals(other$productSn)) return false;
        final Object this$volume = this.getVolume();
        final Object other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) return false;
        final Object this$weight = this.getWeight();
        final Object other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) return false;
        final Object this$service = this.getService();
        final Object other$service = other.getService();
        if (this$service == null ? other$service != null : !this$service.equals(other$service)) return false;
        final Object this$keywords = this.getKeywords();
        final Object other$keywords = other.getKeywords();
        if (this$keywords == null ? other$keywords != null : !this$keywords.equals(other$keywords)) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        final Object this$promotionStartTime = this.getPromotionStartTime();
        final Object other$promotionStartTime = other.getPromotionStartTime();
        if (this$promotionStartTime == null ? other$promotionStartTime != null : !this$promotionStartTime.equals(other$promotionStartTime))
            return false;
        final Object this$promotionEndTime = this.getPromotionEndTime();
        final Object other$promotionEndTime = other.getPromotionEndTime();
        if (this$promotionEndTime == null ? other$promotionEndTime != null : !this$promotionEndTime.equals(other$promotionEndTime))
            return false;
        final Object this$promotionPrice = this.getPromotionPrice();
        final Object other$promotionPrice = other.getPromotionPrice();
        if (this$promotionPrice == null ? other$promotionPrice != null : !this$promotionPrice.equals(other$promotionPrice))
            return false;
        final Object this$promotionPerLimit = this.getPromotionPerLimit();
        final Object other$promotionPerLimit = other.getPromotionPerLimit();
        if (this$promotionPerLimit == null ? other$promotionPerLimit != null : !this$promotionPerLimit.equals(other$promotionPerLimit))
            return false;
        final Object this$promotionType = this.getPromotionType();
        final Object other$promotionType = other.getPromotionType();
        if (this$promotionType == null ? other$promotionType != null : !this$promotionType.equals(other$promotionType))
            return false;
        final Object this$isPostage = this.getIsPostage();
        final Object other$isPostage = other.getIsPostage();
        if (this$isPostage == null ? other$isPostage != null : !this$isPostage.equals(other$isPostage)) return false;
        final Object this$postage = this.getPostage();
        final Object other$postage = other.getPostage();
        if (this$postage == null ? other$postage != null : !this$postage.equals(other$postage)) return false;
        final Object this$feightTemplateId = this.getFeightTemplateId();
        final Object other$feightTemplateId = other.getFeightTemplateId();
        if (this$feightTemplateId == null ? other$feightTemplateId != null : !this$feightTemplateId.equals(other$feightTemplateId))
            return false;
        final Object this$browse = this.getBrowse();
        final Object other$browse = other.getBrowse();
        if (this$browse == null ? other$browse != null : !this$browse.equals(other$browse)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Product;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $productCategoryId = this.getProductCategoryId();
        result = result * PRIME + ($productCategoryId == null ? 43 : $productCategoryId.hashCode());
        final Object $productAttributeCategoryId = this.getProductAttributeCategoryId();
        result = result * PRIME + ($productAttributeCategoryId == null ? 43 : $productAttributeCategoryId.hashCode());
        final Object $productTitle = this.getProductTitle();
        result = result * PRIME + ($productTitle == null ? 43 : $productTitle.hashCode());
        final Object $productSubTitle = this.getProductSubTitle();
        result = result * PRIME + ($productSubTitle == null ? 43 : $productSubTitle.hashCode());
        final Object $productInfo = this.getProductInfo();
        result = result * PRIME + ($productInfo == null ? 43 : $productInfo.hashCode());
        final Object $productTags = this.getProductTags();
        result = result * PRIME + ($productTags == null ? 43 : $productTags.hashCode());
        final Object $brandId = this.getBrandId();
        result = result * PRIME + ($brandId == null ? 43 : $brandId.hashCode());
        final Object $cover = this.getCover();
        result = result * PRIME + ($cover == null ? 43 : $cover.hashCode());
        final Object $image = this.getImage();
        result = result * PRIME + ($image == null ? 43 : $image.hashCode());
        final Object $video = this.getVideo();
        result = result * PRIME + ($video == null ? 43 : $video.hashCode());
        final Object $isHot = this.getIsHot();
        result = result * PRIME + ($isHot == null ? 43 : $isHot.hashCode());
        final Object $isRecommand = this.getIsRecommand();
        result = result * PRIME + ($isRecommand == null ? 43 : $isRecommand.hashCode());
        final Object $isNew = this.getIsNew();
        result = result * PRIME + ($isNew == null ? 43 : $isNew.hashCode());
        final Object $isPreview = this.getIsPreview();
        result = result * PRIME + ($isPreview == null ? 43 : $isPreview.hashCode());
        final Object $verifyStatus = this.getVerifyStatus();
        result = result * PRIME + ($verifyStatus == null ? 43 : $verifyStatus.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $sales = this.getSales();
        result = result * PRIME + ($sales == null ? 43 : $sales.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $giftGrowth = this.getGiftGrowth();
        result = result * PRIME + ($giftGrowth == null ? 43 : $giftGrowth.hashCode());
        final Object $giftIntegral = this.getGiftIntegral();
        result = result * PRIME + ($giftIntegral == null ? 43 : $giftIntegral.hashCode());
        final Object $useIntegralLimit = this.getUseIntegralLimit();
        result = result * PRIME + ($useIntegralLimit == null ? 43 : $useIntegralLimit.hashCode());
        final Object $costPrice = this.getCostPrice();
        result = result * PRIME + ($costPrice == null ? 43 : $costPrice.hashCode());
        final Object $originalPrice = this.getOriginalPrice();
        result = result * PRIME + ($originalPrice == null ? 43 : $originalPrice.hashCode());
        final Object $stock = this.getStock();
        result = result * PRIME + ($stock == null ? 43 : $stock.hashCode());
        final Object $lowStock = this.getLowStock();
        result = result * PRIME + ($lowStock == null ? 43 : $lowStock.hashCode());
        final Object $unit = this.getUnit();
        result = result * PRIME + ($unit == null ? 43 : $unit.hashCode());
        final Object $productSn = this.getProductSn();
        result = result * PRIME + ($productSn == null ? 43 : $productSn.hashCode());
        final Object $volume = this.getVolume();
        result = result * PRIME + ($volume == null ? 43 : $volume.hashCode());
        final Object $weight = this.getWeight();
        result = result * PRIME + ($weight == null ? 43 : $weight.hashCode());
        final Object $service = this.getService();
        result = result * PRIME + ($service == null ? 43 : $service.hashCode());
        final Object $keywords = this.getKeywords();
        result = result * PRIME + ($keywords == null ? 43 : $keywords.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        final Object $promotionStartTime = this.getPromotionStartTime();
        result = result * PRIME + ($promotionStartTime == null ? 43 : $promotionStartTime.hashCode());
        final Object $promotionEndTime = this.getPromotionEndTime();
        result = result * PRIME + ($promotionEndTime == null ? 43 : $promotionEndTime.hashCode());
        final Object $promotionPrice = this.getPromotionPrice();
        result = result * PRIME + ($promotionPrice == null ? 43 : $promotionPrice.hashCode());
        final Object $promotionPerLimit = this.getPromotionPerLimit();
        result = result * PRIME + ($promotionPerLimit == null ? 43 : $promotionPerLimit.hashCode());
        final Object $promotionType = this.getPromotionType();
        result = result * PRIME + ($promotionType == null ? 43 : $promotionType.hashCode());
        final Object $isPostage = this.getIsPostage();
        result = result * PRIME + ($isPostage == null ? 43 : $isPostage.hashCode());
        final Object $postage = this.getPostage();
        result = result * PRIME + ($postage == null ? 43 : $postage.hashCode());
        final Object $feightTemplateId = this.getFeightTemplateId();
        result = result * PRIME + ($feightTemplateId == null ? 43 : $feightTemplateId.hashCode());
        final Object $browse = this.getBrowse();
        result = result * PRIME + ($browse == null ? 43 : $browse.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        return result;
    }
}