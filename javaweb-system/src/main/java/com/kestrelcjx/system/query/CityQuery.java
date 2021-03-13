package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 城市查询条件
 */
public class CityQuery extends BaseQuery {
    /**
     * 城市名称
     */
    private String name;
    /**
     * 城市级别：1=省份，2=市区，3=区县
     */
    private Integer level;

    public CityQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CityQuery)) return false;
        final CityQuery other = (CityQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getLevel() == null ? other.getLevel() != null : !this.getLevel().equals(other.getLevel()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CityQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getLevel() == null ? 43 : this.getLevel().hashCode());
        return result;
    }

    public String toString() {
        return "CityQuery(" +
                "name=" + this.getName() +
                ", level=" + this.getLevel() +
                ")";
    }
}
