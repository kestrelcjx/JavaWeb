package com.kestrelcjx.system.dto;

public class RolePermissionDto {
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 角色ID
     */
    private String authIds;

    public RolePermissionDto() {
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public String getAuthIds() {
        return this.authIds;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public void setAuthIds(String authIds) {
        this.authIds = authIds;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RolePermissionDto)) return false;
        final RolePermissionDto other = (RolePermissionDto) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getRoleId() == null ? other.getRoleId() != null : !this.getRoleId().equals(other.getRoleId()))
            return false;
        if (this.getAuthIds() == null ? other.getAuthIds() != null : !this.getAuthIds().equals(other.getAuthIds()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RolePermissionDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getRoleId() == null ? 43 : this.getRoleId().hashCode());
        result = result * PRIME + (this.getAuthIds() == null ? 43 : this.getAuthIds().hashCode());
        return result;
    }

    public String toString() {
        return "RolePermissionDto(" +
                "roleId=" + this.getRoleId() +
                ", authIds=" + this.getAuthIds() +
                ")";
    }
}
