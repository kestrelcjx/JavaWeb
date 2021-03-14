package com.kestrelcjx.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品列表Vo
 */
public class ProductListVo {
    /**
     * 商品ID
     */
    private Integer id;
    /**
     * 商品分类ID
     */
    private Integer productCategoryId;
    /**
     * 商品分类名称
     */
    private String productCategoryName;
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
     * 品牌ID
     */
    private Integer brandId;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 商品封面
     */
    private String cover;
    /**
     * 商品封面
     */
    private String coverUrl;
    /**
     * 商品图片,连产品图片限制为5张，以逗号分割
     */
    private String image;
    /**
     * 商品图片,连产品图片限制为5张，以逗号分割
     */
    private String imageUrl;
    /**
     * 主图视频链接
     */
    private String video;
    /**
     * 是否热卖：1是 2否
     */
    private Integer isHot;
    /**
     * 是否热卖描述
     */
    private String isHotName;
    /**
     * 是否推荐：1是 2否
     */
    private Integer isRecommand;
    /**
     * 是否推荐描述
     */
    private String isRecommandName;
    /**
     * 是否新品：1是 2否
     */
    private Integer isNew;
    /**
     * 是否新品描述
     */
    private String isNewName;
    /**
     * 审核状态：1已审核 2待审核
     */
    private Integer verifyStatus;
    /**
     * 审核状态描述
     */
    private String verifyStatusName;
    /**
     * 上架状态：1已上架 2已下架
     */
    private Integer status;
    /**
     * 上架状态描述
     */
    private String statusName;
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
     * 促销价格
     */
    private BigDecimal promotionPrice;
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
     * 产品服务描述
     */
    private String serviceName;
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
     * 活动限购数量
     */
    private Integer promotionPerLimit;
    /**
     * 促销类型：0没有促销使用原价 1使用促销价 2使用会员价 3使用阶梯价格 4使用满减价 5限时购
     */
    private Integer promotionType;
    /**
     * 促销类型描述
     */
    private String promotionTypeName;
    /**
     * 是否包邮：1是 2否
     */
    private Integer isPostage;
    /**
     * 是否包邮描述
     */
    private String isPostageName;
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

    public ProductListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getProductCategoryId() {
        return this.productCategoryId;
    }

    public String getProductCategoryName() {
        return this.productCategoryName;
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

    public Integer getBrandId() {
        return this.brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getCover() {
        return this.cover;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public String getImage() {
        return this.image;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getVideo() {
        return this.video;
    }

    public Integer getIsHot() {
        return this.isHot;
    }

    public String getIsHotName() {
        return this.isHotName;
    }

    public Integer getIsRecommand() {
        return this.isRecommand;
    }

    public String getIsRecommandName() {
        return this.isRecommandName;
    }

    public Integer getIsNew() {
        return this.isNew;
    }

    public String getIsNewName() {
        return this.isNewName;
    }

    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public String getVerifyStatusName() {
        return this.verifyStatusName;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getStatusName() {
        return this.statusName;
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

    public BigDecimal getPromotionPrice() {
        return this.promotionPrice;
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

    public String getServiceName() {
        return this.serviceName;
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

    public Integer getPromotionPerLimit() {
        return this.promotionPerLimit;
    }

    public Integer getPromotionType() {
        return this.promotionType;
    }

    public String getPromotionTypeName() {
        return this.promotionTypeName;
    }

    public Integer getIsPostage() {
        return this.isPostage;
    }

    public String getIsPostageName() {
        return this.isPostageName;
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

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public void setProductAttributeCategoryId(Integer productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public void setIsHotName(String isHotName) {
        this.isHotName = isHotName;
    }

    public void setIsRecommand(Integer isRecommand) {
        this.isRecommand = isRecommand;
    }

    public void setIsRecommandName(String isRecommandName) {
        this.isRecommandName = isRecommandName;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public void setIsNewName(String isNewName) {
        this.isNewName = isNewName;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public void setVerifyStatusName(String verifyStatusName) {
        this.verifyStatusName = verifyStatusName;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public void setGiftIntegral(Integer giftIntegral) {
        this.giftIntegral = giftIntegral;
    }

    public void setUseIntegralLimit(Integer useIntegralLimit) {
        this.useIntegralLimit = useIntegralLimit;
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

    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public void setPromotionTypeName(String promotionTypeName) {
        this.promotionTypeName = promotionTypeName;
    }

    public void setIsPostage(Integer isPostage) {
        this.isPostage = isPostage;
    }

    public void setIsPostageName(String isPostageName) {
        this.isPostageName = isPostageName;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public void setFeightTemplateId(Integer feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
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
        if (!(o instanceof ProductListVo)) return false;
        final ProductListVo other = (ProductListVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$productCategoryId = this.getProductCategoryId();
        final Object other$productCategoryId = other.getProductCategoryId();
        if (this$productCategoryId == null ? other$productCategoryId != null : !this$productCategoryId.equals(other$productCategoryId))
            return false;
        final Object this$productCategoryName = this.getProductCategoryName();
        final Object other$productCategoryName = other.getProductCategoryName();
        if (this$productCategoryName == null ? other$productCategoryName != null : !this$productCategoryName.equals(other$productCategoryName))
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
        final Object this$brandId = this.getBrandId();
        final Object other$brandId = other.getBrandId();
        if (this$brandId == null ? other$brandId != null : !this$brandId.equals(other$brandId)) return false;
        final Object this$brandName = this.getBrandName();
        final Object other$brandName = other.getBrandName();
        if (this$brandName == null ? other$brandName != null : !this$brandName.equals(other$brandName)) return false;
        final Object this$cover = this.getCover();
        final Object other$cover = other.getCover();
        if (this$cover == null ? other$cover != null : !this$cover.equals(other$cover)) return false;
        final Object this$coverUrl = this.getCoverUrl();
        final Object other$coverUrl = other.getCoverUrl();
        if (this$coverUrl == null ? other$coverUrl != null : !this$coverUrl.equals(other$coverUrl)) return false;
        final Object this$image = this.getImage();
        final Object other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
        final Object this$imageUrl = this.getImageUrl();
        final Object other$imageUrl = other.getImageUrl();
        if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) return false;
        final Object this$video = this.getVideo();
        final Object other$video = other.getVideo();
        if (this$video == null ? other$video != null : !this$video.equals(other$video)) return false;
        final Object this$isHot = this.getIsHot();
        final Object other$isHot = other.getIsHot();
        if (this$isHot == null ? other$isHot != null : !this$isHot.equals(other$isHot)) return false;
        final Object this$isHotName = this.getIsHotName();
        final Object other$isHotName = other.getIsHotName();
        if (this$isHotName == null ? other$isHotName != null : !this$isHotName.equals(other$isHotName)) return false;
        final Object this$isRecommand = this.getIsRecommand();
        final Object other$isRecommand = other.getIsRecommand();
        if (this$isRecommand == null ? other$isRecommand != null : !this$isRecommand.equals(other$isRecommand))
            return false;
        final Object this$isRecommandName = this.getIsRecommandName();
        final Object other$isRecommandName = other.getIsRecommandName();
        if (this$isRecommandName == null ? other$isRecommandName != null : !this$isRecommandName.equals(other$isRecommandName))
            return false;
        final Object this$isNew = this.getIsNew();
        final Object other$isNew = other.getIsNew();
        if (this$isNew == null ? other$isNew != null : !this$isNew.equals(other$isNew)) return false;
        final Object this$isNewName = this.getIsNewName();
        final Object other$isNewName = other.getIsNewName();
        if (this$isNewName == null ? other$isNewName != null : !this$isNewName.equals(other$isNewName)) return false;
        final Object this$verifyStatus = this.getVerifyStatus();
        final Object other$verifyStatus = other.getVerifyStatus();
        if (this$verifyStatus == null ? other$verifyStatus != null : !this$verifyStatus.equals(other$verifyStatus))
            return false;
        final Object this$verifyStatusName = this.getVerifyStatusName();
        final Object other$verifyStatusName = other.getVerifyStatusName();
        if (this$verifyStatusName == null ? other$verifyStatusName != null : !this$verifyStatusName.equals(other$verifyStatusName))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$statusName = this.getStatusName();
        final Object other$statusName = other.getStatusName();
        if (this$statusName == null ? other$statusName != null : !this$statusName.equals(other$statusName))
            return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$sales = this.getSales();
        final Object other$sales = other.getSales();
        if (this$sales == null ? other$sales != null : !this$sales.equals(other$sales)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$promotionPrice = this.getPromotionPrice();
        final Object other$promotionPrice = other.getPromotionPrice();
        if (this$promotionPrice == null ? other$promotionPrice != null : !this$promotionPrice.equals(other$promotionPrice))
            return false;
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
        final Object this$serviceName = this.getServiceName();
        final Object other$serviceName = other.getServiceName();
        if (this$serviceName == null ? other$serviceName != null : !this$serviceName.equals(other$serviceName))
            return false;
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
        final Object this$promotionPerLimit = this.getPromotionPerLimit();
        final Object other$promotionPerLimit = other.getPromotionPerLimit();
        if (this$promotionPerLimit == null ? other$promotionPerLimit != null : !this$promotionPerLimit.equals(other$promotionPerLimit))
            return false;
        final Object this$promotionType = this.getPromotionType();
        final Object other$promotionType = other.getPromotionType();
        if (this$promotionType == null ? other$promotionType != null : !this$promotionType.equals(other$promotionType))
            return false;
        final Object this$promotionTypeName = this.getPromotionTypeName();
        final Object other$promotionTypeName = other.getPromotionTypeName();
        if (this$promotionTypeName == null ? other$promotionTypeName != null : !this$promotionTypeName.equals(other$promotionTypeName))
            return false;
        final Object this$isPostage = this.getIsPostage();
        final Object other$isPostage = other.getIsPostage();
        if (this$isPostage == null ? other$isPostage != null : !this$isPostage.equals(other$isPostage)) return false;
        final Object this$isPostageName = this.getIsPostageName();
        final Object other$isPostageName = other.getIsPostageName();
        if (this$isPostageName == null ? other$isPostageName != null : !this$isPostageName.equals(other$isPostageName))
            return false;
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
        return other instanceof ProductListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $productCategoryId = this.getProductCategoryId();
        result = result * PRIME + ($productCategoryId == null ? 43 : $productCategoryId.hashCode());
        final Object $productCategoryName = this.getProductCategoryName();
        result = result * PRIME + ($productCategoryName == null ? 43 : $productCategoryName.hashCode());
        final Object $productAttributeCategoryId = this.getProductAttributeCategoryId();
        result = result * PRIME + ($productAttributeCategoryId == null ? 43 : $productAttributeCategoryId.hashCode());
        final Object $productTitle = this.getProductTitle();
        result = result * PRIME + ($productTitle == null ? 43 : $productTitle.hashCode());
        final Object $productSubTitle = this.getProductSubTitle();
        result = result * PRIME + ($productSubTitle == null ? 43 : $productSubTitle.hashCode());
        final Object $productInfo = this.getProductInfo();
        result = result * PRIME + ($productInfo == null ? 43 : $productInfo.hashCode());
        final Object $brandId = this.getBrandId();
        result = result * PRIME + ($brandId == null ? 43 : $brandId.hashCode());
        final Object $brandName = this.getBrandName();
        result = result * PRIME + ($brandName == null ? 43 : $brandName.hashCode());
        final Object $cover = this.getCover();
        result = result * PRIME + ($cover == null ? 43 : $cover.hashCode());
        final Object $coverUrl = this.getCoverUrl();
        result = result * PRIME + ($coverUrl == null ? 43 : $coverUrl.hashCode());
        final Object $image = this.getImage();
        result = result * PRIME + ($image == null ? 43 : $image.hashCode());
        final Object $imageUrl = this.getImageUrl();
        result = result * PRIME + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        final Object $video = this.getVideo();
        result = result * PRIME + ($video == null ? 43 : $video.hashCode());
        final Object $isHot = this.getIsHot();
        result = result * PRIME + ($isHot == null ? 43 : $isHot.hashCode());
        final Object $isHotName = this.getIsHotName();
        result = result * PRIME + ($isHotName == null ? 43 : $isHotName.hashCode());
        final Object $isRecommand = this.getIsRecommand();
        result = result * PRIME + ($isRecommand == null ? 43 : $isRecommand.hashCode());
        final Object $isRecommandName = this.getIsRecommandName();
        result = result * PRIME + ($isRecommandName == null ? 43 : $isRecommandName.hashCode());
        final Object $isNew = this.getIsNew();
        result = result * PRIME + ($isNew == null ? 43 : $isNew.hashCode());
        final Object $isNewName = this.getIsNewName();
        result = result * PRIME + ($isNewName == null ? 43 : $isNewName.hashCode());
        final Object $verifyStatus = this.getVerifyStatus();
        result = result * PRIME + ($verifyStatus == null ? 43 : $verifyStatus.hashCode());
        final Object $verifyStatusName = this.getVerifyStatusName();
        result = result * PRIME + ($verifyStatusName == null ? 43 : $verifyStatusName.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $statusName = this.getStatusName();
        result = result * PRIME + ($statusName == null ? 43 : $statusName.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $sales = this.getSales();
        result = result * PRIME + ($sales == null ? 43 : $sales.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $promotionPrice = this.getPromotionPrice();
        result = result * PRIME + ($promotionPrice == null ? 43 : $promotionPrice.hashCode());
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
        final Object $serviceName = this.getServiceName();
        result = result * PRIME + ($serviceName == null ? 43 : $serviceName.hashCode());
        final Object $keywords = this.getKeywords();
        result = result * PRIME + ($keywords == null ? 43 : $keywords.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        final Object $promotionStartTime = this.getPromotionStartTime();
        result = result * PRIME + ($promotionStartTime == null ? 43 : $promotionStartTime.hashCode());
        final Object $promotionEndTime = this.getPromotionEndTime();
        result = result * PRIME + ($promotionEndTime == null ? 43 : $promotionEndTime.hashCode());
        final Object $promotionPerLimit = this.getPromotionPerLimit();
        result = result * PRIME + ($promotionPerLimit == null ? 43 : $promotionPerLimit.hashCode());
        final Object $promotionType = this.getPromotionType();
        result = result * PRIME + ($promotionType == null ? 43 : $promotionType.hashCode());
        final Object $promotionTypeName = this.getPromotionTypeName();
        result = result * PRIME + ($promotionTypeName == null ? 43 : $promotionTypeName.hashCode());
        final Object $isPostage = this.getIsPostage();
        result = result * PRIME + ($isPostage == null ? 43 : $isPostage.hashCode());
        final Object $isPostageName = this.getIsPostageName();
        result = result * PRIME + ($isPostageName == null ? 43 : $isPostageName.hashCode());
        final Object $postage = this.getPostage();
        result = result * PRIME + ($postage == null ? 43 : $postage.hashCode());
        final Object $feightTemplateId = this.getFeightTemplateId();
        result = result * PRIME + ($feightTemplateId == null ? 43 : $feightTemplateId.hashCode());
        final Object $browse = this.getBrowse();
        result = result * PRIME + ($browse == null ? 43 : $browse.hashCode());
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
        return "ProductListVo(id=" + this.getId() + ", productCategoryId=" + this.getProductCategoryId() + ", productCategoryName=" + this.getProductCategoryName() + ", productAttributeCategoryId=" + this.getProductAttributeCategoryId() + ", productTitle=" + this.getProductTitle() + ", productSubTitle=" + this.getProductSubTitle() + ", productInfo=" + this.getProductInfo() + ", brandId=" + this.getBrandId() + ", brandName=" + this.getBrandName() + ", cover=" + this.getCover() + ", coverUrl=" + this.getCoverUrl() + ", image=" + this.getImage() + ", imageUrl=" + this.getImageUrl() + ", video=" + this.getVideo() + ", isHot=" + this.getIsHot() + ", isHotName=" + this.getIsHotName() + ", isRecommand=" + this.getIsRecommand() + ", isRecommandName=" + this.getIsRecommandName() + ", isNew=" + this.getIsNew() + ", isNewName=" + this.getIsNewName() + ", verifyStatus=" + this.getVerifyStatus() + ", verifyStatusName=" + this.getVerifyStatusName() + ", status=" + this.getStatus() + ", statusName=" + this.getStatusName() + ", sort=" + this.getSort() + ", sales=" + this.getSales() + ", price=" + this.getPrice() + ", promotionPrice=" + this.getPromotionPrice() + ", giftGrowth=" + this.getGiftGrowth() + ", giftIntegral=" + this.getGiftIntegral() + ", useIntegralLimit=" + this.getUseIntegralLimit() + ", costPrice=" + this.getCostPrice() + ", originalPrice=" + this.getOriginalPrice() + ", stock=" + this.getStock() + ", lowStock=" + this.getLowStock() + ", unit=" + this.getUnit() + ", productSn=" + this.getProductSn() + ", volume=" + this.getVolume() + ", weight=" + this.getWeight() + ", service=" + this.getService() + ", serviceName=" + this.getServiceName() + ", keywords=" + this.getKeywords() + ", note=" + this.getNote() + ", promotionStartTime=" + this.getPromotionStartTime() + ", promotionEndTime=" + this.getPromotionEndTime() + ", promotionPerLimit=" + this.getPromotionPerLimit() + ", promotionType=" + this.getPromotionType() + ", promotionTypeName=" + this.getPromotionTypeName() + ", isPostage=" + this.getIsPostage() + ", isPostageName=" + this.getIsPostageName() + ", postage=" + this.getPostage() + ", feightTemplateId=" + this.getFeightTemplateId() + ", browse=" + this.getBrowse() + ", storeId=" + this.getStoreId() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}