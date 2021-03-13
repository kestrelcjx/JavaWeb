package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 布局描述查询条件
 */
public class LayoutDescQuery extends BaseQuery {
    /**
     * 推荐位名称
     */
    private String name;

    public LayoutDescQuery() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LayoutDescQuery)) return false;
        final LayoutDescQuery other = (LayoutDescQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LayoutDescQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        return result;
    }

    public String toString() {
        return "LayoutDescQuery(" +
                "name=" + this.getName() +
                ")";
    }
}
