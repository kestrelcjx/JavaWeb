package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 角色菜单关系
 */
@TableName("sys_role_menu")
public class RoleMenu extends BaseEntity {
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 菜单ID
     */
    private Integer menuId;

    public RoleMenu() {
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public Integer getMenuId() {
        return this.menuId;
    }

    public RoleMenu setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public RoleMenu setMenuId(Integer menuId) {
        this.menuId = menuId;
        return this;
    }

    public String toString() {
        return "RoleMenu(" +
                "roleId=" + this.getRoleId() +
                ", menuId=" + this.getMenuId() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RoleMenu)) return false;
        final RoleMenu other = (RoleMenu) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getRoleId() == null ? other.getRoleId() != null : !this.getRoleId().equals(other.getRoleId()))
            return false;
        if (this.getMenuId() == null ? other.getMenuId() != null : !this.getMenuId().equals(other.getMenuId()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RoleMenu;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getRoleId() == null ? 43 : this.getRoleId().hashCode());
        result = result * PRIME + (this.getMenuId() == null ? 43 : this.getMenuId().hashCode());
        return result;
    }
}
