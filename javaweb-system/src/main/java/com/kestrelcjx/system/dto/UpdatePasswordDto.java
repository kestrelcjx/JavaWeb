package com.kestrelcjx.system.dto;

/**
 * 修改密码
 */
public class UpdatePasswordDto {
    /**
     * 旧密码
     */
    private String oldPassword;
    /**
     * 新密码
     */
    private String newPassword;
    /**
     * 确认密码
     */
    private String rePassword;

    public UpdatePasswordDto() {
    }

    public String getOldPassword() {
        return this.oldPassword;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public String getRePassword() {
        return this.rePassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UpdatePasswordDto)) return false;
        final UpdatePasswordDto other = (UpdatePasswordDto) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getOldPassword() == null ? other.getOldPassword() != null :
                !this.getOldPassword().equals(other.getOldPassword()))
            return false;
        if (this.getNewPassword() == null ? other.getNewPassword() != null :
                !this.getNewPassword().equals(other.getNewPassword()))
            return false;
        if (this.getRePassword() == null ? other.getRePassword() != null :
                !this.getRePassword().equals(other.getRePassword()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UpdatePasswordDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getOldPassword() == null ? 43 : this.getOldPassword().hashCode());
        result = result * PRIME + (this.getNewPassword() == null ? 43 : this.getNewPassword().hashCode());
        result = result * PRIME + (this.getRePassword() == null ? 43 : this.getRePassword().hashCode());
        return result;
    }

    public String toString() {
        return "UpdatePasswordDto(" +
                "oldPassword=" + this.getOldPassword() +
                ", newPassword=" + this.getNewPassword() +
                ", rePassword=" + this.getRePassword() +
                ")";
    }
}
