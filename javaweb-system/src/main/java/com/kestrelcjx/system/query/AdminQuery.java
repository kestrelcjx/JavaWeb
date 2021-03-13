package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 系统人员查询条件
 */
public class AdminQuery extends BaseQuery {
    /**
     * 姓名/手机号
     */
    private String keywords;
    /**
     * 性别：1=男，2=女，3=保密
     */
    private Integer gender;
    /**
     * 状态：1=正常，2=禁用
     */
    private Integer status;

    public AdminQuery() {
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Integer getGender() {
        return this.gender;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AdminQuery)) return false;
        final AdminQuery other = (AdminQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getKeywords() == null ? other.getKeywords() != null :
                !this.getKeywords().equals(other.getKeywords())) return false;
        if (this.getGender() == null ? other.getGender() != null : !this.getGender().equals(other.getGender()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AdminQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getKeywords() == null ? 43 : this.getKeywords().hashCode());
        result = result * PRIME + (this.getGender() == null ? 43 : this.getGender().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }

    public String toString() {
        return "AdminQuery(" +
                "keywords=" + this.getKeywords() +
                ", gender=" + this.getGender() +
                ", status=" + this.getStatus() +
                ")";
    }
}
