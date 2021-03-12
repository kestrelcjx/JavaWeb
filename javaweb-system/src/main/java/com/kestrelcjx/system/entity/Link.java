package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 友链
 */
@TableName("sys_link")
public class Link extends BaseEntity {
    /**
     * 友链名称
     */
    private String name;
    /**
     * 类型：1=友情链接，2=合作伙伴
     */
    private Integer type;
    /**
     * 友链地址
     */
    private String url;
    /**
     * 站点ID
     */
    private Integer itemId;
    /**
     * 栏目ID
     */
    private Integer cateId;
    /**
     * 平台：1=PC站，2=WAP站，3=微信小程序，4=APP应用
     */
    private Integer platform;
    /**
     * 友链形式：1=文字链接，2=图片链接
     */
    private Integer form;
    /**
     * 友链图片
     */
    private String image;
    /**
     * 状态：1=在用，2=停用
     */
    private Integer status;
    /**
     * 显示顺序
     */
    private Integer sort;

    public Link() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getCateId() {
        return this.cateId;
    }

    public Integer getPlatform() {
        return this.platform;
    }

    public Integer getForm() {
        return this.form;
    }

    public String getImage() {
        return this.image;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Link setName(String name) {
        this.name = name;
        return this;
    }

    public Link setType(Integer type) {
        this.type = type;
        return this;
    }

    public Link setUrl(String url) {
        this.url = url;
        return this;
    }

    public Link setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Link setCateId(Integer cateId) {
        this.cateId = cateId;
        return this;
    }

    public Link setPlatform(Integer platform) {
        this.platform = platform;
        return this;
    }

    public Link setForm(Integer form) {
        this.form = form;
        return this;
    }

    public Link setImage(String image) {
        this.image = image;
        return this;
    }

    public Link setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Link setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "Link(" +
                "name=" + this.getName() +
                ", type=" + this.getType() +
                ", url=" + this.getUrl() +
                ", itemId=" + this.getItemId() +
                ", cateId=" + this.getCateId() +
                ", platform=" + this.getPlatform() +
                ", form=" + this.getForm() +
                ", image=" + this.getImage() +
                ", status=" + this.getStatus() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Link)) return false;
        final Link other = (Link) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getUrl() == null ? other.getUrl() != null : !this.getUrl().equals(other.getUrl())) return false;
        if (this.getItemId() == null ? other.getItemId() != null : !this.getItemId().equals(other.getItemId()))
            return false;
        if (this.getCateId() == null ? other.getCateId() != null : !this.getCateId().equals(other.getCateId()))
            return false;
        if (this.getPlatform() == null ? other.getPlatform() != null :
                !this.getPlatform().equals(other.getPlatform())) return false;
        if (this.getForm() == null ? other.getForm() != null : !this.getForm().equals(other.getForm())) return false;
        if (this.getImage() == null ? other.getImage() != null : !this.getImage().equals(other.getImage()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Link;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getUrl() == null ? 43 : this.getUrl().hashCode());
        result = result * PRIME + (this.getItemId() == null ? 43 : this.getItemId().hashCode());
        result = result * PRIME + (this.getCateId() == null ? 43 : this.getCateId().hashCode());
        result = result * PRIME + (this.getPlatform() == null ? 43 : this.getPlatform().hashCode());
        result = result * PRIME + (this.getForm() == null ? 43 : this.getForm().hashCode());
        result = result * PRIME + (this.getImage() == null ? 43 : this.getImage().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
