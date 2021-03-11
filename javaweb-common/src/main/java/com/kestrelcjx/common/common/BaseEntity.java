package com.kestrelcjx.common.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 基类实体对象
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 添加人
     */
    private Integer createUser;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新人
     */
    private Integer updateUser;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    /**
     * 有效标识
     */
    private Integer mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "BaseEntity(" +
                "id=" + id +
                ", createUser=" + createUser +
                ", createTime=" + createTime +
                ", updateUser=" + updateUser +
                ", updateTime=" + updateTime +
                ", mark=" + mark +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BaseEntity)) {
            return false;
        }
        BaseEntity other = (BaseEntity) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        if (this.getId() == null ? other.getId() != null
                : Integer.compare(this.getId(), other.getId()) != 0) {
            return false;
        }
        if (this.getCreateUser() == null ? other.getCreateUser() != null
                : Integer.compare(this.getCreateUser(), other.getCreateUser()) != 0) {
            return false;
        }
        if (!Objects.equals(this.getCreateTime(), other.getCreateTime())) {
            return false;
        }
        if (this.getUpdateUser() == null ? other.getUpdateUser() != null
                : Integer.compare(this.getUpdateUser(), other.getUpdateUser()) != 0) {
            return false;
        }
        if (!Objects.equals(this.getUpdateTime(), other.getUpdateTime())) {
            return false;
        }
        if (this.getMark() == null ? other.getMark() != null
                : Integer.compare(this.getMark(), other.getMark()) != 0) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.getId() == null ? 43 : this.getId().hashCode());
        result = (result * PRIME) + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = (result * PRIME) + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = (result * PRIME) + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = (result * PRIME) + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        result = (result * PRIME) + (this.getMark() == null ? 43 : this.getMark().hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseEntity;
    }
}
