package com.kestrelcjx.system.dto;

/**
 * 系统登录Dto
 */
public class LoginDto {
    /**
     * 登录用户名
     */
    private String username;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 验证码
     */
    private String captcha;
    /**
     * 验证码KEY
     */
    private String key;
    /**
     * 是否记住我
     */
    private boolean rememberMe;

    public LoginDto() {
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getCaptcha() {
        return this.captcha;
    }

    public String getKey() {
        return this.key;
    }

    public boolean isRememberMe() {
        return this.rememberMe;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginDto)) return false;
        final LoginDto other = (LoginDto) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getUsername() == null ? other.getUsername() != null :
                !this.getUsername().equals(other.getUsername())) return false;
        if (this.getPassword() == null ? other.getPassword() != null :
                !this.getPassword().equals(other.getPassword())) return false;
        if (this.getCaptcha() == null ? other.getCaptcha() != null : !this.getCaptcha().equals(other.getCaptcha()))
            return false;
        if (this.getKey() == null ? other.getKey() != null : !this.getKey().equals(other.getKey())) return false;
        if (this.isRememberMe() != other.isRememberMe()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LoginDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getUsername() == null ? 43 : this.getUsername().hashCode());
        result = result * PRIME + (this.getPassword() == null ? 43 : this.getPassword().hashCode());
        result = result * PRIME + (this.getCaptcha() == null ? 43 : this.getCaptcha().hashCode());
        result = result * PRIME + (this.getKey() == null ? 43 : this.getKey().hashCode());
        result = result * PRIME + (this.isRememberMe() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "LoginDto(" +
                "username=" + this.getUsername() +
                ", password=" + this.getPassword() +
                ", captcha=" + this.getCaptcha() +
                ", key=" + this.getKey() +
                ", rememberMe=" + this.isRememberMe() +
                ")";
    }
}
