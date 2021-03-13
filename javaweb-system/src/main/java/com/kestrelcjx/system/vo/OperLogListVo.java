package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 操作日志列表Vo
 */
public class OperLogListVo {
    /**
     * 操作日志ID
     */
    private Integer id;
    /**
     * 模块标题
     */
    private String title;
    /**
     * 业务类型：0=其它，1=新增，2=修改，3=删除
     */
    private Integer businessType;
    /**
     * 业务类型描述
     */
    private String businessTypeName;
    /**
     * 方法名称
     */
    private String method;
    /**
     * 请求方式
     */
    private String requestMethod;
    /**
     * 操作类别：0=其它，1=后台用户，2=手机端用户
     */
    private Integer operatorType;
    /**
     * 操作类别描述
     */
    private String operatorTypeName;
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
    private String operLocation;
    /**
     * 请求参数
     */
    private String operParam;
    /**
     * 返回参数
     */
    private String jsonResult;
    /**
     * 操作状态：1=正常，2=异常
     */
    private Integer status;
    /**
     * 操作状态描述
     */
    private String statusName;
    /**
     * 错误消息
     */
    private String errorMsg;
    /**
     * 操作时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    public OperLogListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getBusinessType() {
        return this.businessType;
    }

    public String getBusinessTypeName() {
        return this.businessTypeName;
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

    public String getOperatorTypeName() {
        return this.operatorTypeName;
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

    public String getOperLocation() {
        return this.operLocation;
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

    public String getStatusName() {
        return this.statusName;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public void setOperatorTypeName(String operatorTypeName) {
        this.operatorTypeName = operatorTypeName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl;
    }

    public void setOperIp(String operIp) {
        this.operIp = operIp;
    }

    public void setOperLocation(String operLocation) {
        this.operLocation = operLocation;
    }

    public void setOperParam(String operParam) {
        this.operParam = operParam;
    }

    public void setJsonResult(String jsonResult) {
        this.jsonResult = jsonResult;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OperLogListVo)) return false;
        final OperLogListVo other = (OperLogListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getBusinessType() == null ? other.getBusinessType() != null :
                !this.getBusinessType().equals(other.getBusinessType()))
            return false;
        if (this.getBusinessTypeName() == null ? other.getBusinessTypeName() != null :
                !this.getBusinessTypeName().equals(other.getBusinessTypeName()))
            return false;
        if (this.getMethod() == null ? other.getMethod() != null : !this.getMethod().equals(other.getMethod()))
            return false;
        if (this.getRequestMethod() == null ? other.getRequestMethod() != null :
                !this.getRequestMethod().equals(other.getRequestMethod()))
            return false;
        if (this.getOperatorType() == null ? other.getOperatorType() != null :
                !this.getOperatorType().equals(other.getOperatorType()))
            return false;
        if (this.getOperatorTypeName() == null ? other.getOperatorTypeName() != null :
                !this.getOperatorTypeName().equals(other.getOperatorTypeName()))
            return false;
        if (this.getOperName() == null ? other.getOperName() != null :
                !this.getOperName().equals(other.getOperName())) return false;
        if (this.getOperUrl() == null ? other.getOperUrl() != null : !this.getOperUrl().equals(other.getOperUrl()))
            return false;
        if (this.getOperIp() == null ? other.getOperIp() != null : !this.getOperIp().equals(other.getOperIp()))
            return false;
        if (this.getOperLocation() == null ? other.getOperLocation() != null :
                !this.getOperLocation().equals(other.getOperLocation()))
            return false;
        if (this.getOperParam() == null ? other.getOperParam() != null :
                !this.getOperParam().equals(other.getOperParam())) return false;
        if (this.getJsonResult() == null ? other.getJsonResult() != null :
                !this.getJsonResult().equals(other.getJsonResult()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getStatusName() == null ? other.getStatusName() != null :
                !this.getStatusName().equals(other.getStatusName()))
            return false;
        if (this.getErrorMsg() == null ? other.getErrorMsg() != null :
                !this.getErrorMsg().equals(other.getErrorMsg())) return false;
        if (this.getCreateTime() == null ? other.getCreateTime() != null :
                !this.getCreateTime().equals(other.getCreateTime()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OperLogListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getBusinessType() == null ? 43 : this.getBusinessType().hashCode());
        result = result * PRIME + (this.getBusinessTypeName() == null ? 43 : this.getBusinessTypeName().hashCode());
        result = result * PRIME + (this.getMethod() == null ? 43 : this.getMethod().hashCode());
        result = result * PRIME + (this.getRequestMethod() == null ? 43 : this.getRequestMethod().hashCode());
        result = result * PRIME + (this.getOperatorType() == null ? 43 : this.getOperatorType().hashCode());
        result = result * PRIME + (this.getOperatorTypeName() == null ? 43 : this.getOperatorTypeName().hashCode());
        result = result * PRIME + (this.getOperName() == null ? 43 : this.getOperName().hashCode());
        result = result * PRIME + (this.getOperUrl() == null ? 43 : this.getOperUrl().hashCode());
        result = result * PRIME + (this.getOperIp() == null ? 43 : this.getOperIp().hashCode());
        result = result * PRIME + (this.getOperLocation() == null ? 43 : this.getOperLocation().hashCode());
        result = result * PRIME + (this.getOperParam() == null ? 43 : this.getOperParam().hashCode());
        result = result * PRIME + (this.getJsonResult() == null ? 43 : this.getJsonResult().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getStatusName() == null ? 43 : this.getStatusName().hashCode());
        result = result * PRIME + (this.getErrorMsg() == null ? 43 : this.getErrorMsg().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        return result;
    }

    public String toString() {
        return "OperLogListVo(" +
                "id=" + this.getId() +
                ", title=" + this.getTitle() +
                ", businessType=" + this.getBusinessType() +
                ", businessTypeName=" + this.getBusinessTypeName() +
                ", method=" + this.getMethod() +
                ", requestMethod=" + this.getRequestMethod() +
                ", operatorType=" + this.getOperatorType() +
                ", operatorTypeName=" + this.getOperatorTypeName() +
                ", operName=" + this.getOperName() +
                ", operUrl=" + this.getOperUrl() +
                ", operIp=" + this.getOperIp() +
                ", operLocation=" + this.getOperLocation() +
                ", operParam=" + this.getOperParam() +
                ", jsonResult=" + this.getJsonResult() +
                ", status=" + this.getStatus() +
                ", statusName=" + this.getStatusName() +
                ", errorMsg=" + this.getErrorMsg() +
                ", createTime=" + this.getCreateTime() +
                ")";
    }
}
