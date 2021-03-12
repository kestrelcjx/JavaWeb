package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 站点
 */
@TableName("sys_item")
public class Item extends BaseEntity {
    /**
     * 站点名称
     */
    private String name;
    /**
     * 站点类型：1=普通站点，2=其它
     */
    private Integer type;
    /**
     * 站点地址
     */
    private String url;
    /**
     * 站点图片
     */
    private String image;
    /**
     * 是否二级域名：1=是，2=否
     */
    private Integer isDomain;
    /**
     * 状态：1=在用，2=停用
     */
    private Integer status;
    /**
     * 站点备注
     */
    private String note;
    /**
     * 显示顺序
     */
    private Integer sort;

    public Item() {
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

    public String getImage() {
        return this.image;
    }

    public Integer getIsDomain() {
        return this.isDomain;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getNote() {
        return this.note;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public Item setType(Integer type) {
        this.type = type;
        return this;
    }

    public Item setUrl(String url) {
        this.url = url;
        return this;
    }

    public Item setImage(String image) {
        this.image = image;
        return this;
    }

    public Item setIsDomain(Integer isDomain) {
        this.isDomain = isDomain;
        return this;
    }

    public Item setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Item setNote(String note) {
        this.note = note;
        return this;
    }

    public Item setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "Item(" +
                "name=" + this.getName() +
                ", type=" + this.getType() +
                ", url=" + this.getUrl() +
                ", image=" + this.getImage() +
                ", isDomain=" + this.getIsDomain() +
                ", status=" + this.getStatus() +
                ", note=" + this.getNote() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Item)) return false;
        final Item other = (Item) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getUrl() == null ? other.getUrl() != null : !this.getUrl().equals(other.getUrl())) return false;
        if (this.getImage() == null ? other.getImage() != null : !this.getImage().equals(other.getImage()))
            return false;
        if (this.getIsDomain() == null ? other.getIsDomain() != null :
                !this.getIsDomain().equals(other.getIsDomain())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Item;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getUrl() == null ? 43 : this.getUrl().hashCode());
        result = result * PRIME + (this.getImage() == null ? 43 : this.getImage().hashCode());
        result = result * PRIME + (this.getIsDomain() == null ? 43 : this.getIsDomain().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
