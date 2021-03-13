package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 菜单查询条件
 */
public class MenuQuery extends BaseQuery {
    /**
     * 菜单名称
     */
    private String name;
    /**
     * 类型：1=模块，2=导航，3=菜单，4=节点
     */
    private Integer type;
    /**
     * 是否显示：1=显示，2=不显示
     */
    private Integer status;
    /**
     * 是否公共：1=是，2=否
     */
    private Integer isPublic;

    public MenuQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getIsPublic() {
        return this.isPublic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MenuQuery)) return false;
        final MenuQuery other = (MenuQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getIsPublic() == null ? other.getIsPublic() != null :
                !this.getIsPublic().equals(other.getIsPublic())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MenuQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getIsPublic() == null ? 43 : this.getIsPublic().hashCode());
        return result;
    }

    public String toString() {
        return "MenuQuery(" +
                "name=" + this.getName() +
                ", type=" + this.getType() +
                ", status=" + this.getStatus() +
                ", isPublic=" + this.getIsPublic() +
                ")";
    }
}
