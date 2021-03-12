package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 部门角色
 */
@TableName("sys_role_dept")
public class RoleDept extends BaseEntity {
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 部门ID
     */
    private Integer deptId;

    public RoleDept() {
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public Integer getDeptId() {
        return this.deptId;
    }

    public RoleDept setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public RoleDept setDeptId(Integer deptId) {
        this.deptId = deptId;
        return this;
    }

    public String toString() {
        return "RoleDept(" +
                "roleId=" + this.getRoleId() +
                ", deptId=" + this.getDeptId() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RoleDept)) return false;
        final RoleDept other = (RoleDept) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getRoleId() == null ? other.getRoleId() != null : !this.getRoleId().equals(other.getRoleId()))
            return false;
        if (this.getDeptId() == null ? other.getDeptId() != null : !this.getDeptId().equals(other.getDeptId()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RoleDept;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getRoleId() == null ? 43 : this.getRoleId().hashCode());
        result = result * PRIME + (this.getDeptId() == null ? 43 : this.getDeptId().hashCode());
        return result;
    }
}
