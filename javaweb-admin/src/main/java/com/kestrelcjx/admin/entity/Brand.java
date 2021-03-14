package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;


/**
 * 商品品牌
 */
@TableName("pms_brand")
public class Brand extends BaseEntity {
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 品牌logo
     */
    private String brandLogo;
    /**
     * 品牌简介
     */
    private String brandIntro;
    /**
     * 品牌首字母
     */
    private String firstLetter;
    /**
     * 产品数量
     */
    private Integer productCount;
    /**
     * 品牌商ID
     */
    private Integer brandCompanyId;
    /**
     * 专区大图
     */
    private String bigPic;
    /**
     * 所属店铺
     */
    private Integer storeId;
    /**
     * 状态：1启用 2停用
     */
    private Integer status;
    /**
     * 排序号
     */
    private Integer sort;

    public Brand() {
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getBrandLogo() {
        return this.brandLogo;
    }

    public String getBrandIntro() {
        return this.brandIntro;
    }

    public String getFirstLetter() {
        return this.firstLetter;
    }

    public Integer getProductCount() {
        return this.productCount;
    }

    public Integer getBrandCompanyId() {
        return this.brandCompanyId;
    }

    public String getBigPic() {
        return this.bigPic;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Brand setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public Brand setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
        return this;
    }

    public Brand setBrandIntro(String brandIntro) {
        this.brandIntro = brandIntro;
        return this;
    }

    public Brand setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
        return this;
    }

    public Brand setProductCount(Integer productCount) {
        this.productCount = productCount;
        return this;
    }

    public Brand setBrandCompanyId(Integer brandCompanyId) {
        this.brandCompanyId = brandCompanyId;
        return this;
    }

    public Brand setBigPic(String bigPic) {
        this.bigPic = bigPic;
        return this;
    }

    public Brand setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public Brand setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Brand setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "Brand(brandName=" + this.getBrandName() + ", brandLogo=" + this.getBrandLogo() + ", brandIntro=" + this.getBrandIntro() + ", firstLetter=" + this.getFirstLetter() + ", productCount=" + this.getProductCount() + ", brandCompanyId=" + this.getBrandCompanyId() + ", bigPic=" + this.getBigPic() + ", storeId=" + this.getStoreId() + ", status=" + this.getStatus() + ", sort=" + this.getSort() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Brand)) return false;
        final Brand other = (Brand) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$brandName = this.getBrandName();
        final Object other$brandName = other.getBrandName();
        if (this$brandName == null ? other$brandName != null : !this$brandName.equals(other$brandName)) return false;
        final Object this$brandLogo = this.getBrandLogo();
        final Object other$brandLogo = other.getBrandLogo();
        if (this$brandLogo == null ? other$brandLogo != null : !this$brandLogo.equals(other$brandLogo)) return false;
        final Object this$brandIntro = this.getBrandIntro();
        final Object other$brandIntro = other.getBrandIntro();
        if (this$brandIntro == null ? other$brandIntro != null : !this$brandIntro.equals(other$brandIntro))
            return false;
        final Object this$firstLetter = this.getFirstLetter();
        final Object other$firstLetter = other.getFirstLetter();
        if (this$firstLetter == null ? other$firstLetter != null : !this$firstLetter.equals(other$firstLetter))
            return false;
        final Object this$productCount = this.getProductCount();
        final Object other$productCount = other.getProductCount();
        if (this$productCount == null ? other$productCount != null : !this$productCount.equals(other$productCount))
            return false;
        final Object this$brandCompanyId = this.getBrandCompanyId();
        final Object other$brandCompanyId = other.getBrandCompanyId();
        if (this$brandCompanyId == null ? other$brandCompanyId != null : !this$brandCompanyId.equals(other$brandCompanyId))
            return false;
        final Object this$bigPic = this.getBigPic();
        final Object other$bigPic = other.getBigPic();
        if (this$bigPic == null ? other$bigPic != null : !this$bigPic.equals(other$bigPic)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Brand;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $brandName = this.getBrandName();
        result = result * PRIME + ($brandName == null ? 43 : $brandName.hashCode());
        final Object $brandLogo = this.getBrandLogo();
        result = result * PRIME + ($brandLogo == null ? 43 : $brandLogo.hashCode());
        final Object $brandIntro = this.getBrandIntro();
        result = result * PRIME + ($brandIntro == null ? 43 : $brandIntro.hashCode());
        final Object $firstLetter = this.getFirstLetter();
        result = result * PRIME + ($firstLetter == null ? 43 : $firstLetter.hashCode());
        final Object $productCount = this.getProductCount();
        result = result * PRIME + ($productCount == null ? 43 : $productCount.hashCode());
        final Object $brandCompanyId = this.getBrandCompanyId();
        result = result * PRIME + ($brandCompanyId == null ? 43 : $brandCompanyId.hashCode());
        final Object $bigPic = this.getBigPic();
        result = result * PRIME + ($bigPic == null ? 43 : $bigPic.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        return result;
    }
}