package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 短信日志
 */
@TableName("sys_sms_log")
public class SmsLog extends BaseEntity {
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 发送类型：1=用户注册，2=修改密码，3=找回面貌，4=换绑手机号验证，5=换绑手机号，6=钱包提现，7=设置支付密码，8=系统通知
     */
    private Integer type;
    /**
     * 短信内容
     */
    private String content;
    /**
     * 项目签名
     */
    private String sign;
    /**
     * 模板类型
     */
    private String templateCode;
    /**
     * 参数
     */
    private String params;
    /**
     * 阿里云返回的ID
     */
    private String bizId;
    /**
     * 阿里云返回的code
     */
    private String code;
    /**
     * 阿里云返回的message
     */
    private String message;
    /**
     * 状态：1=成功，2=失败，3=待处理
     */
    private Integer status;

    public SmsLog() {
    }

    public String getMobile() {
        return this.mobile;
    }

    public Integer getType() {
        return this.type;
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

    public SmsLog setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public SmsLog setType(Integer type) {
        this.type = type;
        return this;
    }

    public SmsLog setContent(String content) {
        this.content = content;
        return this;
    }

    public SmsLog setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public SmsLog setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }

    public SmsLog setParams(String params) {
        this.params = params;
        return this;
    }

    public SmsLog setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }

    public SmsLog setCode(String code) {
        this.code = code;
        return this;
    }

    public SmsLog setMessage(String message) {
        this.message = message;
        return this;
    }

    public SmsLog setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String toString() {
        return "SmsLog(" +
                "mobile=" + this.getMobile() +
                ", type=" + this.getType() +
                ", content=" + this.getContent() +
                ", sign=" + this.getSign() +
                ", templateCode=" + this.getTemplateCode() +
                ", params=" + this.getParams() +
                ", bizId=" + this.getBizId() +
                ", code=" + this.getCode() +
                ", message=" + this.getMessage() +
                ", status=" + this.getStatus() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SmsLog)) return false;
        final SmsLog other = (SmsLog) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getMobile() == null ? other.getMobile() != null : !this.getMobile().equals(other.getMobile()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
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
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SmsLog;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getMobile() == null ? 43 : this.getMobile().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getContent() == null ? 43 : this.getContent().hashCode());
        result = result * PRIME + (this.getSign() == null ? 43 : this.getSign().hashCode());
        result = result * PRIME + (this.getTemplateCode() == null ? 43 : this.getTemplateCode().hashCode());
        result = result * PRIME + (this.getParams() == null ? 43 : this.getParams().hashCode());
        result = result * PRIME + (this.getBizId() == null ? 43 : this.getBizId().hashCode());
        result = result * PRIME + (this.getCode() == null ? 43 : this.getCode().hashCode());
        result = result * PRIME + (this.getMessage() == null ? 43 : this.getMessage().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }
}
