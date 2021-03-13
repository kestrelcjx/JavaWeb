package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 部门查询条件
 */
public class DepQuery extends BaseQuery {
    /**
     * 部门名称
     */
    private String name;
    /**
     * 类型：1=公司，2=部门
     */
    private Integer type;
    /**
     * 是否有子级：1=是，2=否
     */
    private Integer hasChild;

    public DepQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getHasChild() {
        return this.hasChild;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setHasChild(Integer hasChild) {
        this.hasChild = hasChild;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DepQuery)) return false;
        final DepQuery other = (DepQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getHasChild() == null ? other.getHasChild() != null :
                !this.getHasChild().equals(other.getHasChild())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DepQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getHasChild() == null ? 43 : this.getHasChild().hashCode());
        return result;
    }

    public String toString() {
        return "DepQuery(" +
                "name=" + this.getName() +
                ", type=" + this.getType() +
                ", hasChild=" + this.getHasChild() +
                ")";
    }
}
