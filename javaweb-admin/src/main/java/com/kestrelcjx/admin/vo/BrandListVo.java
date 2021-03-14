package com.kestrelcjx.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 商品品牌列表Vo
 */
public class BrandListVo {
    /**
     * 商品品牌ID
     */
    private Integer id;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 品牌logo
     */
    private String brandLogo;
    /**
     * 品牌logo
     */
    private String brandLogoUrl;
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
     * 专区大图
     */
    private String bigPicUrl;
    /**
     * 所属店铺
     */
    private Integer storeId;
    /**
     * 状态：1启用 2停用
     */
    private Integer status;
    /**
     * 状态描述
     */
    private String statusName;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 添加人
     */
    private Integer createUser;
    /**
     * 添加人名称
     */
    private String createUserName;
    /**
     * 创建时间
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

    public BrandListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getBrandLogo() {
        return this.brandLogo;
    }

    public String getBrandLogoUrl() {
        return this.brandLogoUrl;
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

    public String getBigPicUrl() {
        return this.bigPicUrl;
    }

    public Integer getStoreId() {
        return this.storeId;
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

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public void setBrandLogoUrl(String brandLogoUrl) {
        this.brandLogoUrl = brandLogoUrl;
    }

    public void setBrandIntro(String brandIntro) {
        this.brandIntro = brandIntro;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public void setBrandCompanyId(Integer brandCompanyId) {
        this.brandCompanyId = brandCompanyId;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public void setBigPicUrl(String bigPicUrl) {
        this.bigPicUrl = bigPicUrl;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
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
        if (!(o instanceof BrandListVo)) return false;
        final BrandListVo other = (BrandListVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$brandName = this.getBrandName();
        final Object other$brandName = other.getBrandName();
        if (this$brandName == null ? other$brandName != null : !this$brandName.equals(other$brandName)) return false;
        final Object this$brandLogo = this.getBrandLogo();
        final Object other$brandLogo = other.getBrandLogo();
        if (this$brandLogo == null ? other$brandLogo != null : !this$brandLogo.equals(other$brandLogo)) return false;
        final Object this$brandLogoUrl = this.getBrandLogoUrl();
        final Object other$brandLogoUrl = other.getBrandLogoUrl();
        if (this$brandLogoUrl == null ? other$brandLogoUrl != null : !this$brandLogoUrl.equals(other$brandLogoUrl))
            return false;
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
        final Object this$bigPicUrl = this.getBigPicUrl();
        final Object other$bigPicUrl = other.getBigPicUrl();
        if (this$bigPicUrl == null ? other$bigPicUrl != null : !this$bigPicUrl.equals(other$bigPicUrl)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
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
        return other instanceof BrandListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $brandName = this.getBrandName();
        result = result * PRIME + ($brandName == null ? 43 : $brandName.hashCode());
        final Object $brandLogo = this.getBrandLogo();
        result = result * PRIME + ($brandLogo == null ? 43 : $brandLogo.hashCode());
        final Object $brandLogoUrl = this.getBrandLogoUrl();
        result = result * PRIME + ($brandLogoUrl == null ? 43 : $brandLogoUrl.hashCode());
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
        final Object $bigPicUrl = this.getBigPicUrl();
        result = result * PRIME + ($bigPicUrl == null ? 43 : $bigPicUrl.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $statusName = this.getStatusName();
        result = result * PRIME + ($statusName == null ? 43 : $statusName.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
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
        return "BrandListVo(id=" + this.getId() + ", brandName=" + this.getBrandName() + ", brandLogo=" + this.getBrandLogo() + ", brandLogoUrl=" + this.getBrandLogoUrl() + ", brandIntro=" + this.getBrandIntro() + ", firstLetter=" + this.getFirstLetter() + ", productCount=" + this.getProductCount() + ", brandCompanyId=" + this.getBrandCompanyId() + ", bigPic=" + this.getBigPic() + ", bigPicUrl=" + this.getBigPicUrl() + ", storeId=" + this.getStoreId() + ", status=" + this.getStatus() + ", statusName=" + this.getStatusName() + ", sort=" + this.getSort() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}