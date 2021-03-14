package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 商品查询条件
 */
public class ProductQuery extends BaseQuery {
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
     * 审核状态：1已审核 2待审核
     */
    private Integer verifyStatus;
    /**
     * 上架状态：1已上架 2已下架
     */
    private Integer status;
    /**
     * 产品服务：1无忧退货 2快速退款 3免费包邮
     */
    private Integer service;
    /**
     * 促销类型：0没有促销使用原价 1使用促销价 2使用会员价 3使用阶梯价格 4使用满减价 5限时购
     */
    private Integer promotionType;
    /**
     * 是否包邮：1是 2否
     */
    private Integer isPostage;

    public ProductQuery() {
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

    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getService() {
        return this.service;
    }

    public Integer getPromotionType() {
        return this.promotionType;
    }

    public Integer getIsPostage() {
        return this.isPostage;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public void setIsRecommand(Integer isRecommand) {
        this.isRecommand = isRecommand;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public void setIsPostage(Integer isPostage) {
        this.isPostage = isPostage;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductQuery)) return false;
        final ProductQuery other = (ProductQuery) o;
        if (!other.canEqual((Object) this)) return false;
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
        final Object this$verifyStatus = this.getVerifyStatus();
        final Object other$verifyStatus = other.getVerifyStatus();
        if (this$verifyStatus == null ? other$verifyStatus != null : !this$verifyStatus.equals(other$verifyStatus))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$service = this.getService();
        final Object other$service = other.getService();
        if (this$service == null ? other$service != null : !this$service.equals(other$service)) return false;
        final Object this$promotionType = this.getPromotionType();
        final Object other$promotionType = other.getPromotionType();
        if (this$promotionType == null ? other$promotionType != null : !this$promotionType.equals(other$promotionType))
            return false;
        final Object this$isPostage = this.getIsPostage();
        final Object other$isPostage = other.getIsPostage();
        if (this$isPostage == null ? other$isPostage != null : !this$isPostage.equals(other$isPostage)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $isHot = this.getIsHot();
        result = result * PRIME + ($isHot == null ? 43 : $isHot.hashCode());
        final Object $isRecommand = this.getIsRecommand();
        result = result * PRIME + ($isRecommand == null ? 43 : $isRecommand.hashCode());
        final Object $isNew = this.getIsNew();
        result = result * PRIME + ($isNew == null ? 43 : $isNew.hashCode());
        final Object $verifyStatus = this.getVerifyStatus();
        result = result * PRIME + ($verifyStatus == null ? 43 : $verifyStatus.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $service = this.getService();
        result = result * PRIME + ($service == null ? 43 : $service.hashCode());
        final Object $promotionType = this.getPromotionType();
        result = result * PRIME + ($promotionType == null ? 43 : $promotionType.hashCode());
        final Object $isPostage = this.getIsPostage();
        result = result * PRIME + ($isPostage == null ? 43 : $isPostage.hashCode());
        return result;
    }

    public String toString() {
        return "ProductQuery(isHot=" + this.getIsHot() + ", isRecommand=" + this.getIsRecommand() + ", isNew=" + this.getIsNew() + ", verifyStatus=" + this.getVerifyStatus() + ", status=" + this.getStatus() + ", service=" + this.getService() + ", promotionType=" + this.getPromotionType() + ", isPostage=" + this.getIsPostage() + ")";
    }
}
