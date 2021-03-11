package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

@TableName("sys_admin_role")
public class AdminRole extends BaseEntity {
    /**
     * 人员ID
     */
    private Integer adminId;
    /**
     * 角色ID
     */
    private Integer roleId;

    public AdminRole() {
    }

    public Integer getAdminId() {
        return this.adminId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public AdminRole setAdminId(Integer adminId) {
        this.adminId = adminId;
        return this;
    }

    public AdminRole setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public String toString() {
        return "AdminRole(adminId=" + this.getAdminId() + ", roleId=" + this.getRoleId() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AdminRole)) return false;
        final AdminRole other = (AdminRole) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getAdminId() == null ? other.getAdminId() != null : !this.getAdminId().equals(other.getAdminId()))
            return false;
        if (this.getRoleId() == null ? other.getRoleId() != null : !this.getRoleId().equals(other.getRoleId()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AdminRole;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getAdminId() == null ? 43 : this.getAdminId().hashCode());
        result = result * PRIME + (this.getRoleId() == null ? 43 : this.getRoleId().hashCode());
        return result;
    }
}
