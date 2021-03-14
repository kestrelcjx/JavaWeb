package com.kestrelcjx.system.dto;

/**
 * 更新个人中心信息
 */
public class UpdateUserInfoDto {
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 个人简介
     */
    private String intro;
    /**
     * 详细地址
     */
    private String address;

    public UpdateUserInfoDto() {
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getEmail() {
        return this.email;
    }

    public String getIntro() {
        return this.intro;
    }

    public String getAddress() {
        return this.address;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UpdateUserInfoDto)) return false;
        final UpdateUserInfoDto other = (UpdateUserInfoDto) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getNickname() == null ? other.getNickname() != null :
                !this.getNickname().equals(other.getNickname())) return false;
        if (this.getEmail() == null ? other.getEmail() != null : !this.getEmail().equals(other.getEmail()))
            return false;
        if (this.getIntro() == null ? other.getIntro() != null : !this.getIntro().equals(other.getIntro()))
            return false;
        if (this.getAddress() == null ? other.getAddress() != null : !this.getAddress().equals(other.getAddress()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UpdateUserInfoDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getNickname() == null ? 43 : this.getNickname().hashCode());
        result = result * PRIME + (this.getEmail() == null ? 43 : this.getEmail().hashCode());
        result = result * PRIME + (this.getIntro() == null ? 43 : this.getIntro().hashCode());
        result = result * PRIME + (this.getAddress() == null ? 43 : this.getAddress().hashCode());
        return result;
    }

    public String toString() {
        return "UpdateUserInfoDto(" +
                "nickname=" + this.getNickname() +
                ", email=" + this.getEmail() +
                ", intro=" + this.getIntro() +
                ", address=" + this.getAddress() +
                ")";
    }
}
