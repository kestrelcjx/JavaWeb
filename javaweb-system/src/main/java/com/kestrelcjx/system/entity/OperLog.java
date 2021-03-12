package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 操作日志
 */
@TableName("sys_oper_log")
public class OperLog extends BaseEntity {
    /**
     * 模块标题
     */
    private String title;
    /**
     * 业务类型：0=其它，1=新增，2=修改，3=删除
     */
    private Integer businessType;
    /**
     * 方法名称
     */
    private String method;
    /**
     * 请求方式
     */
    private String requestMethod;
    /**
     * 操作类型：0=其它，1=后台用户，2=手机端用户
     */
    private Integer operatorType;
    /**
     * 操作人员
     */
    private String operName;
    /**
     * 请求URL
     */
    private String operUrl;
    /**
     * 主机地址
     */
    private String operIp;
    /**
     * 操作地点
     */
    private String operLocaotion;
    /**
     * 请求参数
     */
    private String operParam;
    /**
     * 返回参数
     */
    private String jsonResult;
    /**
     * 操作类型：1=正常，2=异常
     */
    private Integer status;
    /**
     * 错误消息
     */
    private String errorMsg;

    public OperLog() {
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getBusinessType() {
        return this.businessType;
    }

    public String getMethod() {
        return this.method;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public Integer getOperatorType() {
        return this.operatorType;
    }

    public String getOperName() {
        return this.operName;
    }

    public String getOperUrl() {
        return this.operUrl;
    }

    public String getOperIp() {
        return this.operIp;
    }

    public String getOperLocaotion() {
        return this.operLocaotion;
    }

    public String getOperParam() {
        return this.operParam;
    }

    public String getJsonResult() {
        return this.jsonResult;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public OperLog setTitle(String title) {
        this.title = title;
        return this;
    }

    public OperLog setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }

    public OperLog setMethod(String method) {
        this.method = method;
        return this;
    }

    public OperLog setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    public OperLog setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
        return this;
    }

    public OperLog setOperName(String operName) {
        this.operName = operName;
        return this;
    }

    public OperLog setOperUrl(String operUrl) {
        this.operUrl = operUrl;
        return this;
    }

    public OperLog setOperIp(String operIp) {
        this.operIp = operIp;
        return this;
    }

    public OperLog setOperLocaotion(String operLocaotion) {
        this.operLocaotion = operLocaotion;
        return this;
    }

    public OperLog setOperParam(String operParam) {
        this.operParam = operParam;
        return this;
    }

    public OperLog setJsonResult(String jsonResult) {
        this.jsonResult = jsonResult;
        return this;
    }

    public OperLog setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public OperLog setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public String toString() {
        return "OperLog(" +
                "title=" + this.getTitle() +
                ", businessType=" + this.getBusinessType() +
                ", method=" + this.getMethod() +
                ", requestMethod=" + this.getRequestMethod() +
                ", operatorTypes=" + this.getOperatorType() +
                ", operName=" + this.getOperName() +
                ", operUrl=" + this.getOperUrl() +
                ", operIp=" + this.getOperIp() +
                ", operLocaotion=" + this.getOperLocaotion() +
                ", operParam=" + this.getOperParam() +
                ", jsonResult=" + this.getJsonResult() +
                ", status=" + this.getStatus() +
                ", errorMsg=" + this.getErrorMsg() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OperLog)) return false;
        final OperLog other = (OperLog) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getBusinessType() == null ? other.getBusinessType() != null :
                !this.getBusinessType().equals(other.getBusinessType()))
            return false;
        if (this.getMethod() == null ? other.getMethod() != null : !this.getMethod().equals(other.getMethod()))
            return false;
        if (this.getRequestMethod() == null ? other.getRequestMethod() != null :
                !this.getRequestMethod().equals(other.getRequestMethod()))
            return false;
        if (this.getOperatorType() == null ? other.getOperatorType() != null :
                !this.getOperatorType().equals(other.getOperatorType()))
            return false;
        if (this.getOperName() == null ? other.getOperName() != null :
                !this.getOperName().equals(other.getOperName())) return false;
        if (this.getOperUrl() == null ? other.getOperUrl() != null : !this.getOperUrl().equals(other.getOperUrl()))
            return false;
        if (this.getOperIp() == null ? other.getOperIp() != null : !this.getOperIp().equals(other.getOperIp()))
            return false;
        if (this.getOperLocaotion() == null ? other.getOperLocaotion() != null :
                !this.getOperLocaotion().equals(other.getOperLocaotion()))
            return false;
        if (this.getOperParam() == null ? other.getOperParam() != null :
                !this.getOperParam().equals(other.getOperParam())) return false;
        if (this.getJsonResult() == null ? other.getJsonResult() != null :
                !this.getJsonResult().equals(other.getJsonResult()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getErrorMsg() == null ? other.getErrorMsg() != null :
                !this.getErrorMsg().equals(other.getErrorMsg())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OperLog;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getBusinessType() == null ? 43 : this.getBusinessType().hashCode());
        result = result * PRIME + (this.getMethod() == null ? 43 : this.getMethod().hashCode());
        result = result * PRIME + (this.getRequestMethod() == null ? 43 : this.getRequestMethod().hashCode());
        result = result * PRIME + (this.getOperatorType() == null ? 43 : this.getOperatorType().hashCode());
        result = result * PRIME + (this.getOperName() == null ? 43 : this.getOperName().hashCode());
        result = result * PRIME + (this.getOperUrl() == null ? 43 : this.getOperUrl().hashCode());
        result = result * PRIME + (this.getOperIp() == null ? 43 : this.getOperIp().hashCode());
        result = result * PRIME + (this.getOperLocaotion() == null ? 43 : this.getOperLocaotion().hashCode());
        result = result * PRIME + (this.getOperParam() == null ? 43 : this.getOperParam().hashCode());
        result = result * PRIME + (this.getJsonResult() == null ? 43 : this.getJsonResult().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getErrorMsg() == null ? 43 : this.getErrorMsg().hashCode());
        return result;
    }
}
