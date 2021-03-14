package com.kestrelcjx.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 会员地址列表Vo
 */
public class UserAddressListVo {
    /**
     * 会员地址ID
     */
    private Integer id;
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
    /**
     * 默认地址描述
     */
    private String isDefaultName;
    /**
     * 创建人
     */
    private Integer createUser;
    /**
     * 创建人名称
     */
    private String createUserName;
    /**
     * 添加时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date updateTime;

    public UserAddressListVo() {
    }

    public Integer getId() {
        return this.id;
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

    public String getIsDefaultName() {
        return this.isDefaultName;
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

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public void setCityArea(String cityArea) {
        this.cityArea = cityArea;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public void setIsDefaultName(String isDefaultName) {
        this.isDefaultName = isDefaultName;
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
        if (!(o instanceof UserAddressListVo)) return false;
        final UserAddressListVo other = (UserAddressListVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
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
        final Object this$isDefaultName = this.getIsDefaultName();
        final Object other$isDefaultName = other.getIsDefaultName();
        if (this$isDefaultName == null ? other$isDefaultName != null : !this$isDefaultName.equals(other$isDefaultName))
            return false;
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
        return other instanceof UserAddressListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
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
        final Object $isDefaultName = this.getIsDefaultName();
        result = result * PRIME + ($isDefaultName == null ? 43 : $isDefaultName.hashCode());
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
        return "UserAddressListVo(id=" + this.getId() + ", userId=" + this.getUserId() + ", realname=" + this.getRealname() + ", mobile=" + this.getMobile() + ", provinceId=" + this.getProvinceId() + ", cityId=" + this.getCityId() + ", districtId=" + this.getDistrictId() + ", cityArea=" + this.getCityArea() + ", address=" + this.getAddress() + ", zipCode=" + this.getZipCode() + ", isDefault=" + this.getIsDefault() + ", isDefaultName=" + this.getIsDefaultName() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}