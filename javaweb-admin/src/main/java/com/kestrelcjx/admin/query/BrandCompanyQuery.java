package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 品牌商查询条件
 */
public class BrandCompanyQuery extends BaseQuery {
    /**
     * 品牌商名称
     */
    private String name;

    public BrandCompanyQuery() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BrandCompanyQuery)) return false;
        final BrandCompanyQuery other = (BrandCompanyQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BrandCompanyQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "BrandCompanyQuery(name=" + this.getName() + ")";
    }
}
