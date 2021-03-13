package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 站点查询条件
 */
public class ItemQuery extends BaseQuery {
    /**
     * 站点名称
     */
    private String name;
    /**
     * 站点类型：1=普通站点，2=其他
     */
    private Integer type;

    /**
     * 是否二级域名：1=是，2=否
     */
    private Integer isDomain;
    /**
     * 状态：1=在用，2=停用
     */
    private Integer status;

    public ItemQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getIsDomain() {
        return this.isDomain;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setIsDomain(Integer isDomain) {
        this.isDomain = isDomain;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ItemQuery)) return false;
        final ItemQuery other = (ItemQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getIsDomain() == null ? other.getIsDomain() != null :
                !this.getIsDomain().equals(other.getIsDomain())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ItemQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getIsDomain() == null ? 43 : this.getIsDomain().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }

    public String toString() {
        return "ItemQuery(" +
                "name=" + this.getName() +
                ", type=" + this.getType() +
                ", isDomain=" + this.getIsDomain() +
                ", status=" + this.getStatus() +
                ")";
    }
}
