package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 栏目查询条件
 */
public class ItemCateQuery extends BaseQuery {
    /**
     * 栏目名称
     */
    private String name;
    /**
     * 有无封面：1=有，2=无
     */
    private Integer isCover;
    /**
     * 状态：1=启用，2=停用
     */
    private Integer status;

    public ItemCateQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getIsCover() {
        return this.isCover;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsCover(Integer isCover) {
        this.isCover = isCover;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ItemCateQuery)) return false;
        final ItemCateQuery other = (ItemCateQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getIsCover() == null ? other.getIsCover() != null : !this.getIsCover().equals(other.getIsCover()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ItemCateQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getIsCover() == null ? 43 : this.getIsCover().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }

    public String toString() {
        return "ItemCateQuery(" +
                "name=" + this.getName() +
                ", isCover=" + this.getIsCover() +
                ", status=" + this.getStatus() +
                ")";
    }
}
