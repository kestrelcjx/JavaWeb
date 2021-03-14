package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;


/**
 * 会员地址
 */
@TableName("ums_user_address")
public class UserAddress extends BaseEntity {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 收货人姓名
     */
    private String realname;
    /**
     * 收货人电话
     */
    private String mobile;
    /**
     * 收货人所在省ID
     */
    private Integer provinceId;
    /**
     * 收货人所在市ID
     */
    private Integer cityId;
    /**
     * 收货人所在区/县ID
     */
    private Integer districtId;
    /**
     * 收货人所在城市
     */
    private String cityArea;
    /**
     * 收货人详细地址
     */
    private String address;
    /**
     * 邮编
     */
    private Integer zipCode;
    /**
     * 默认地址：1是 2否
     */
    private Integer isDefault;

    public UserAddress() {
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getRealname() {
        return this.realname;
    }

    public String getMobile() {
        return this.mobile;
    }

    public Integer getProvinceId() {
        return this.provinceId;
    }

    public Integer getCityId() {
        return this.cityId;
    }

    public Integer getDistrictId() {
        return this.districtId;
    }

    public String getCityArea() {
        return this.cityArea;
    }

    public String getAddress() {
        return this.address;
    }

    public Integer getZipCode() {
        return this.zipCode;
    }

    public Integer getIsDefault() {
        return this.isDefault;
    }

    public UserAddress setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public UserAddress setRealname(String realname) {
        this.realname = realname;
        return this;
    }

    public UserAddress setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public UserAddress setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public UserAddress setCityId(Integer cityId) {
        this.cityId = cityId;
        return this;
    }

    public UserAddress setDistrictId(Integer districtId) {
        this.districtId = districtId;
        return this;
    }

    public UserAddress setCityArea(String cityArea) {
        this.cityArea = cityArea;
        return this;
    }

    public UserAddress setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserAddress setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public UserAddress setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public String toString() {
        return "UserAddress(userId=" + this.getUserId() + ", realname=" + this.getRealname() + ", mobile=" + this.getMobile() + ", provinceId=" + this.getProvinceId() + ", cityId=" + this.getCityId() + ", districtId=" + this.getDistrictId() + ", cityArea=" + this.getCityArea() + ", address=" + this.getAddress() + ", zipCode=" + this.getZipCode() + ", isDefault=" + this.getIsDefault() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserAddress)) return false;
        final UserAddress other = (UserAddress) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$realname = this.getRealname();
        final Object other$realname = other.getRealname();
        if (this$realname == null ? other$realname != null : !this$realname.equals(other$realname)) return false;
        final Object this$mobile = this.getMobile();
        final Object other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) return false;
        final Object this$provinceId = this.getProvinceId();
        final Object other$provinceId = other.getProvinceId();
        if (this$provinceId == null ? other$provinceId != null : !this$provinceId.equals(other$provinceId))
            return false;
        final Object this$cityId = this.getCityId();
        final Object other$cityId = other.getCityId();
        if (this$cityId == null ? other$cityId != null : !this$cityId.equals(other$cityId)) return false;
        final Object this$districtId = this.getDistrictId();
        final Object other$districtId = other.getDistrictId();
        if (this$districtId == null ? other$districtId != null : !this$districtId.equals(other$districtId))
            return false;
        final Object this$cityArea = this.getCityArea();
        final Object other$cityArea = other.getCityArea();
        if (this$cityArea == null ? other$cityArea != null : !this$cityArea.equals(other$cityArea)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$zipCode = this.getZipCode();
        final Object other$zipCode = other.getZipCode();
        if (this$zipCode == null ? other$zipCode != null : !this$zipCode.equals(other$zipCode)) return false;
        final Object this$isDefault = this.getIsDefault();
        final Object other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !this$isDefault.equals(other$isDefault)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserAddress;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $realname = this.getRealname();
        result = result * PRIME + ($realname == null ? 43 : $realname.hashCode());
        final Object $mobile = this.getMobile();
        result = result * PRIME + ($mobile == null ? 43 : $mobile.hashCode());
        final Object $provinceId = this.getProvinceId();
        result = result * PRIME + ($provinceId == null ? 43 : $provinceId.hashCode());
        final Object $cityId = this.getCityId();
        result = result * PRIME + ($cityId == null ? 43 : $cityId.hashCode());
        final Object $districtId = this.getDistrictId();
        result = result * PRIME + ($districtId == null ? 43 : $districtId.hashCode());
        final Object $cityArea = this.getCityArea();
        result = result * PRIME + ($cityArea == null ? 43 : $cityArea.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $zipCode = this.getZipCode();
        result = result * PRIME + ($zipCode == null ? 43 : $zipCode.hashCode());
        final Object $isDefault = this.getIsDefault();
        result = result * PRIME + ($isDefault == null ? 43 : $isDefault.hashCode());
        return result;
    }
}