package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 系统角色查询条件
 */
public class RoleQuery extends BaseQuery {
    /**
     * 角色名称
     */
    private String name;
    /**
     * 状态：1=正常，2=禁用
     */
    private Integer status;

    public RoleQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RoleQuery)) return false;
        final RoleQuery other = (RoleQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RoleQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }

    public String toString() {
        return "RoleQuery(" +
                "name=" + this.getName() +
                ", status=" + this.getStatus() +
                ")";
    }
}
