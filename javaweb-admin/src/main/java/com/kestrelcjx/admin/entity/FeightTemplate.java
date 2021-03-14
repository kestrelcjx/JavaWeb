package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

import java.math.BigDecimal;


/**
 * 运费模版
 */
@TableName("pms_feight_template")
public class FeightTemplate extends BaseEntity {
    /**
     * 模板名称
     */
    private String name;
    /**
     * 计费类型：1按重量 2按件数
     */
    private Integer chargeType;
    /**
     * 首重kg
     */
    private BigDecimal firstWeight;
    /**
     * 首费（元）
     */
    private BigDecimal firstFee;
    /**
     * 后重量
     */
    private BigDecimal continueWeight;
    /**
     * 后费用
     */
    private BigDecimal continueFee;
    /**
     * 目的地（省、市）
     */
    private String dest;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 所属店铺ID
     */
    private Integer storeId;

    public FeightTemplate() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getChargeType() {
        return this.chargeType;
    }

    public BigDecimal getFirstWeight() {
        return this.firstWeight;
    }

    public BigDecimal getFirstFee() {
        return this.firstFee;
    }

    public BigDecimal getContinueWeight() {
        return this.continueWeight;
    }

    public BigDecimal getContinueFee() {
        return this.continueFee;
    }

    public String getDest() {
        return this.dest;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public FeightTemplate setName(String name) {
        this.name = name;
        return this;
    }

    public FeightTemplate setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    public FeightTemplate setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
        return this;
    }

    public FeightTemplate setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
        return this;
    }

    public FeightTemplate setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
        return this;
    }

    public FeightTemplate setContinueFee(BigDecimal continueFee) {
        this.continueFee = continueFee;
        return this;
    }

    public FeightTemplate setDest(String dest) {
        this.dest = dest;
        return this;
    }

    public FeightTemplate setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public FeightTemplate setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public String toString() {
        return "FeightTemplate(name=" + this.getName() + ", chargeType=" + this.getChargeType() + ", firstWeight=" + this.getFirstWeight() + ", firstFee=" + this.getFirstFee() + ", continueWeight=" + this.getContinueWeight() + ", continueFee=" + this.getContinueFee() + ", dest=" + this.getDest() + ", sort=" + this.getSort() + ", storeId=" + this.getStoreId() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FeightTemplate)) return false;
        final FeightTemplate other = (FeightTemplate) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$chargeType = this.getChargeType();
        final Object other$chargeType = other.getChargeType();
        if (this$chargeType == null ? other$chargeType != null : !this$chargeType.equals(other$chargeType))
            return false;
        final Object this$firstWeight = this.getFirstWeight();
        final Object other$firstWeight = other.getFirstWeight();
        if (this$firstWeight == null ? other$firstWeight != null : !this$firstWeight.equals(other$firstWeight))
            return false;
        final Object this$firstFee = this.getFirstFee();
        final Object other$firstFee = other.getFirstFee();
        if (this$firstFee == null ? other$firstFee != null : !this$firstFee.equals(other$firstFee)) return false;
        final Object this$continueWeight = this.getContinueWeight();
        final Object other$continueWeight = other.getContinueWeight();
        if (this$continueWeight == null ? other$continueWeight != null : !this$continueWeight.equals(other$continueWeight))
            return false;
        final Object this$continueFee = this.getContinueFee();
        final Object other$continueFee = other.getContinueFee();
        if (this$continueFee == null ? other$continueFee != null : !this$continueFee.equals(other$continueFee))
            return false;
        final Object this$dest = this.getDest();
        final Object other$dest = other.getDest();
        if (this$dest == null ? other$dest != null : !this$dest.equals(other$dest)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FeightTemplate;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $chargeType = this.getChargeType();
        result = result * PRIME + ($chargeType == null ? 43 : $chargeType.hashCode());
        final Object $firstWeight = this.getFirstWeight();
        result = result * PRIME + ($firstWeight == null ? 43 : $firstWeight.hashCode());
        final Object $firstFee = this.getFirstFee();
        result = result * PRIME + ($firstFee == null ? 43 : $firstFee.hashCode());
        final Object $continueWeight = this.getContinueWeight();
        result = result * PRIME + ($continueWeight == null ? 43 : $continueWeight.hashCode());
        final Object $continueFee = this.getContinueFee();
        result = result * PRIME + ($continueFee == null ? 43 : $continueFee.hashCode());
        final Object $dest = this.getDest();
        result = result * PRIME + ($dest == null ? 43 : $dest.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        return result;
    }
}