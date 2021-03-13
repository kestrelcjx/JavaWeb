package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 布局查询条件
 */
public class LayoutQuery extends BaseQuery {
    /**
     * 类型：1=新闻资讯，2=其他
     */
    private Integer type;

    public LayoutQuery() {
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LayoutQuery)) return false;
        final LayoutQuery other = (LayoutQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LayoutQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        return result;
    }

    public String toString() {
        return "LayoutQuery(" +
                "type=" + this.getType() +
                ")";
    }
}
