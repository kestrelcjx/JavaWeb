package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 栏目
 */
@TableName("sys_item_cate")
public class ItemCate extends BaseEntity {
    /**
     * 栏目名称
     */
    private String name;
    /**
     * 父级ID
     */
    private Integer pid;
    /**
     * 站点ID
     */
    private Integer itemId;
    /**
     * 拼音（全）
     */
    private String pinyin;
    /**
     * 拼音（简）
     */
    private String code;
    /**
     * 有无封面
     */
    private Integer isCover;
    /**
     * 封面
     */
    private String cover;
    /**
     * 状态：1=启用，2=停用
     */
    private Integer status;
    /**
     * 备注
     */
    private String note;
    /**
     * 排序
     */
    private Integer sort;

    public ItemCate() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getPid() {
        return this.pid;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public String getPinyin() {
        return this.pinyin;
    }

    public String getCode() {
        return this.code;
    }

    public Integer getIsCover() {
        return this.isCover;
    }

    public String getCover() {
        return this.cover;
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

    public ItemCate setName(String name) {
        this.name = name;
        return this;
    }

    public ItemCate setPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    public ItemCate setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public ItemCate setPinyin(String pinyin) {
        this.pinyin = pinyin;
        return this;
    }

    public ItemCate setCode(String code) {
        this.code = code;
        return this;
    }

    public ItemCate setIsCover(Integer isCover) {
        this.isCover = isCover;
        return this;
    }

    public ItemCate setCover(String cover) {
        this.cover = cover;
        return this;
    }

    public ItemCate setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public ItemCate setNote(String note) {
        this.note = note;
        return this;
    }

    public ItemCate setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "ItemCate(" +
                "name=" + this.getName() +
                ", pid=" + this.getPid() +
                ", itemId=" + this.getItemId() +
                ", pinyin=" + this.getPinyin() +
                ", code=" + this.getCode() +
                ", isCover=" + this.getIsCover() +
                ", cover=" + this.getCover() +
                ", status=" + this.getStatus() +
                ", note=" + this.getNote() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ItemCate)) return false;
        final ItemCate other = (ItemCate) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getPid() == null ? other.getPid() != null : !this.getPid().equals(other.getPid())) return false;
        if (this.getItemId() == null ? other.getItemId() != null : !this.getItemId().equals(other.getItemId()))
            return false;
        if (this.getPinyin() == null ? other.getPinyin() != null : !this.getPinyin().equals(other.getPinyin()))
            return false;
        if (this.getCode() == null ? other.getCode() != null : !this.getCode().equals(other.getCode())) return false;
        if (this.getIsCover() == null ? other.getIsCover() != null : !this.getIsCover().equals(other.getIsCover()))
            return false;
        if (this.getCover() == null ? other.getCover() != null : !this.getCover().equals(other.getCover()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ItemCate;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getPid() == null ? 43 : this.getPid().hashCode());
        result = result * PRIME + (this.getItemId() == null ? 43 : this.getItemId().hashCode());
        result = result * PRIME + (this.getPinyin() == null ? 43 : this.getPinyin().hashCode());
        result = result * PRIME + (this.getCode() == null ? 43 : this.getCode().hashCode());
        result = result * PRIME + (this.getIsCover() == null ? 43 : this.getIsCover().hashCode());
        result = result * PRIME + (this.getCover() == null ? 43 : this.getCover().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
