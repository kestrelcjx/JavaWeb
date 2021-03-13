package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 广告位描述查询条件
 */
public class AdSortQuery extends BaseQuery {
    /**
     * 广告位名称
     */
    private String name;
    /**
     * 站点类型：1=PC网站，2=WAP手机站，3=小程序，4=APP移动端
     */
    private Integer platform;

    public AdSortQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getPlatform() {
        return this.platform;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AdSortQuery)) return false;
        final AdSortQuery other = (AdSortQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getPlatform() == null ? other.getPlatform() != null :
                !this.getPlatform().equals(other.getPlatform())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AdSortQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getPlatform() == null ? 43 : this.getPlatform().hashCode());
        return result;
    }

    public String toString() {
        return "AdSortQuery(" +
                "name=" + this.getName() +
                ", platform=" + this.getPlatform() +
                ")";
    }
}
