package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 友链查询条件
 */
public class LinkQuery extends BaseQuery {
    /**
     * 友链名称
     */
    private String name;
    /**
     * 类型：1=友情链接，2=合作伙伴
     */
    private Integer type;
    /**
     * 平台：1=PC站，2=WAP站，3=微信小程序，4=APP应用
     */
    private Integer platform;
    /**
     * 友链形式：1=文字链接，2=图片链接
     */
    private Integer form;
    /**
     * 状态：1=在用，2=停用
     */
    private Integer status;

    public LinkQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getPlatform() {
        return this.platform;
    }

    public Integer getForm() {
        return this.form;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public void setForm(Integer form) {
        this.form = form;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LinkQuery)) return false;
        final LinkQuery other = (LinkQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getPlatform() == null ? other.getPlatform() != null :
                !this.getPlatform().equals(other.getPlatform())) return false;
        if (this.getForm() == null ? other.getForm() != null : !this.getForm().equals(other.getForm())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LinkQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getPlatform() == null ? 43 : this.getPlatform().hashCode());
        result = result * PRIME + (this.getForm() == null ? 43 : this.getForm().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }

    public String toString() {
        return "LinkQuery(" +
                "name=" + this.getName() +
                ", type=" + this.getType() +
                ", platform=" + this.getPlatform() +
                ", form=" + this.getForm() +
                ", status=" + this.getStatus() +
                ")";
    }
}
