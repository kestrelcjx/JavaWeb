package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 短信日志列表Vo
 */
public class SmsLogListVo {
    /**
     * 短信日志ID
     */
    private Integer id;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 发送类型：1=用户注册，2=修改密码，3=找回密码，4=换绑手机号验证，5=换绑手机号
     * 6=钱包提现，7=设置支付密码，8=系统通知
     */
    private Integer type;
    /**
     * 发送类型描述
     */
    private String typeName;
    /**
     * 短信内容
     */
    private String content;
    /**
     * 项目签名
     */
    private String sign;
    /**
     *
     */
    private String templateCode;
    /**
     * 参数
     */
    private String params;
    /**
     * 阿里云返回的
     */
    private String bizId;
    /**
     * 阿里云返回的code
     */
    private String code;
    /**
     * 阿里云返回的
     */
    private String message;
    /**
     * 状态：1=成功，2=失败，3=待处理
     */
    private Integer status;
    /**
     * 状态描述
     */
    private String statusName;
    /**
     * 添加人
     */
    private Integer createUser;
    /**
     * 添加人名称
     */
    private String createUserName;
    /**
     * 添加时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新人
     */
    private Integer updateUser;
    /**
     * 更新人名称
     */
    private String updateUserName;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    public SmsLogListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getMobile() {
        return this.mobile;
    }

    public Integer getType() {
        return this.type;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public String getContent() {
        return this.content;
    }

    public String getSign() {
        return this.sign;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    public String getParams() {
        return this.params;
    }

    public String getBizId() {
        return this.bizId;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getStatusName() {
        return this.statusName;
    }

    public Integer getCreateUser() {
        return this.createUser;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public String getUpdateUserName() {
        return this.updateUserName;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SmsLogListVo)) return false;
        final SmsLogListVo other = (SmsLogListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getMobile() == null ? other.getMobile() != null : !this.getMobile().equals(other.getMobile()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getTypeName() == null ? other.getTypeName() != null :
                !this.getTypeName().equals(other.getTypeName())) return false;
        if (this.getContent() == null ? other.getContent() != null : !this.getContent().equals(other.getContent()))
            return false;
        if (this.getSign() == null ? other.getSign() != null : !this.getSign().equals(other.getSign())) return false;
        if (this.getTemplateCode() == null ? other.getTemplateCode() != null :
                !this.getTemplateCode().equals(other.getTemplateCode()))
            return false;
        if (this.getParams() == null ? other.getParams() != null : !this.getParams().equals(other.getParams()))
            return false;
        if (this.getBizId() == null ? other.getBizId() != null : !this.getBizId().equals(other.getBizId()))
            return false;
        if (this.getCode() == null ? other.getCode() != null : !this.getCode().equals(other.getCode())) return false;
        if (this.getMessage() == null ? other.getMessage() != null : !this.getMessage().equals(other.getMessage()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getStatusName() == null ? other.getStatusName() != null :
                !this.getStatusName().equals(other.getStatusName()))
            return false;
        if (this.getCreateUser() == null ? other.getCreateUser() != null :
                !this.getCreateUser().equals(other.getCreateUser()))
            return false;
        if (this.getCreateUserName() == null ? other.getCreateUserName() != null :
                !this.getCreateUserName().equals(other.getCreateUserName()))
            return false;
        if (this.getCreateTime() == null ? other.getCreateTime() != null :
                !this.getCreateTime().equals(other.getCreateTime()))
            return false;
        if (this.getUpdateUser() == null ? other.getUpdateUser() != null :
                !this.getUpdateUser().equals(other.getUpdateUser()))
            return false;
        if (this.getUpdateUserName() == null ? other.getUpdateUserName() != null :
                !this.getUpdateUserName().equals(other.getUpdateUserName()))
            return false;
        if (this.getUpdateTime() == null ? other.getUpdateTime() != null :
                !this.getUpdateTime().equals(other.getUpdateTime()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SmsLogListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getMobile() == null ? 43 : this.getMobile().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getTypeName() == null ? 43 : this.getTypeName().hashCode());
        result = result * PRIME + (this.getContent() == null ? 43 : this.getContent().hashCode());
        result = result * PRIME + (this.getSign() == null ? 43 : this.getSign().hashCode());
        result = result * PRIME + (this.getTemplateCode() == null ? 43 : this.getTemplateCode().hashCode());
        result = result * PRIME + (this.getParams() == null ? 43 : this.getParams().hashCode());
        result = result * PRIME + (this.getBizId() == null ? 43 : this.getBizId().hashCode());
        result = result * PRIME + (this.getCode() == null ? 43 : this.getCode().hashCode());
        result = result * PRIME + (this.getMessage() == null ? 43 : this.getMessage().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getStatusName() == null ? 43 : this.getStatusName().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateUserName() == null ? 43 : this.getCreateUserName().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateUserName() == null ? 43 : this.getUpdateUserName().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        return result;
    }

    public String toString() {
        return "SmsLogListVo(" +
                "id=" + this.getId() +
                ", mobile=" + this.getMobile() +
                ", type=" + this.getType() +
                ", typeName=" + this.getTypeName() +
                ", content=" + this.getContent() +
                ", sign=" + this.getSign() +
                ", templateCode=" + this.getTemplateCode() +
                ", params=" + this.getParams() +
                ", bizId=" + this.getBizId() +
                ", code=" + this.getCode() +
                ", message=" + this.getMessage() +
                ", status=" + this.getStatus() +
                ", statusName=" + this.getStatusName() +
                ", createUser=" + this.getCreateUser() +
                ", createUserName=" + this.getCreateUserName() +
                ", createTime=" + this.getCreateTime() +
                ", updateUser=" + this.getUpdateUser() +
                ", updateUserName=" + this.getUpdateUserName() +
                ", updateTime=" + this.getUpdateTime() +
                ")";
    }
}
