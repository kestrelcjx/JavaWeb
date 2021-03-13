package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 操作日志查询条件
 */
public class OperLogQuery extends BaseQuery {
    /**
     * 模块标题
     */
    private String title;
    /**
     * 业务类型：0=其它，1=新增，2=修改，3=删除
     */
    private Integer businessType;
    /**
     * 操作类别：0=其它，1=后台用户，2=手机端用户
     */
    private Integer operatorType;
    /**
     * 操作状态：1=正常，2=异常
     */
    private Integer status;

    public OperLogQuery() {
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getBusinessType() {
        return this.businessType;
    }

    public Integer getOperatorType() {
        return this.operatorType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OperLogQuery)) return false;
        final OperLogQuery other = (OperLogQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getBusinessType() == null ? other.getBusinessType() != null :
                !this.getBusinessType().equals(other.getBusinessType()))
            return false;
        if (this.getOperatorType() == null ? other.getOperatorType() != null :
                !this.getOperatorType().equals(other.getOperatorType()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OperLogQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getBusinessType() == null ? 43 : this.getBusinessType().hashCode());
        result = result * PRIME + (this.getOperatorType() == null ? 43 : this.getOperatorType().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }

    public String toString() {
        return "OperLogQuery(" +
                "title=" + this.getTitle() +
                ", businessType=" + this.getBusinessType() +
                ", operatorType=" + this.getOperatorType() +
                ", status=" + this.getStatus() +
                ")";
    }
}
