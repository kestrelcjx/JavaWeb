package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 会员地址查询条件
 */
public class UserAddressQuery extends BaseQuery {
    /**
     * 收货人电话
     */
    private String mobile;
    /**
     * 默认地址：1是 2否
     */
    private Integer isDefault;

    public UserAddressQuery() {
    }

    public String getMobile() {
        return this.mobile;
    }

    public Integer getIsDefault() {
        return this.isDefault;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserAddressQuery)) return false;
        final UserAddressQuery other = (UserAddressQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$mobile = this.getMobile();
        final Object other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) return false;
        final Object this$isDefault = this.getIsDefault();
        final Object other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !this$isDefault.equals(other$isDefault)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserAddressQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $mobile = this.getMobile();
        result = result * PRIME + ($mobile == null ? 43 : $mobile.hashCode());
        final Object $isDefault = this.getIsDefault();
        result = result * PRIME + ($isDefault == null ? 43 : $isDefault.hashCode());
        return result;
    }

    public String toString() {
        return "UserAddressQuery(mobile=" + this.getMobile() + ", isDefault=" + this.getIsDefault() + ")";
    }
}
