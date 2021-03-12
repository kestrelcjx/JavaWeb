package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 定时任务
 */
@TableName("sys_crontab")
public class Crontab extends BaseEntity {
    /**
     * 任务标题
     */
    private String title;
    /**
     * crontab格式
     */
    private String cron;
    /**
     * 延迟秒数（单位 毫秒）
     */
    private Integer delay;
    /**
     * 间隔秒数（单位 毫秒）
     */
    private Integer fixed;
    /**
     * 已执行次数
     */
    private Integer execute;
    /**
     * 状态：1=正常，2=暂停
     */
    private Integer status;
    /**
     * 备注
     */
    private String note;

    public Crontab() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getCron() {
        return this.cron;
    }

    public Integer getDelay() {
        return this.delay;
    }

    public Integer getFixed() {
        return this.fixed;
    }

    public Integer getExecute() {
        return this.execute;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getNote() {
        return this.note;
    }

    public Crontab setTitle(String title) {
        this.title = title;
        return this;
    }

    public Crontab setCron(String cron) {
        this.cron = cron;
        return this;
    }

    public Crontab setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    public Crontab setFixed(Integer fixed) {
        this.fixed = fixed;
        return this;
    }

    public Crontab setExecute(Integer execute) {
        this.execute = execute;
        return this;
    }

    public Crontab setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Crontab setNote(String note) {
        this.note = note;
        return this;
    }

    public String toString() {
        return "Crontab(" +
                "title=" + this.getTitle() +
                ", cron=" + this.getCron() +
                ", delay=" + this.getDelay() +
                ", fixed=" + this.getFixed() +
                ", execute=" + this.getExecute() +
                ", status=" + this.getStatus() +
                ", note=" + this.getNote() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Crontab)) return false;
        final Crontab other = (Crontab) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getCron() == null ? other.getCron() != null : !this.getCron().equals(other.getCron())) return false;
        if (this.getDelay() == null ? other.getDelay() != null : !this.getDelay().equals(other.getDelay()))
            return false;
        if (this.getFixed() == null ? other.getFixed() != null : !this.getFixed().equals(other.getFixed()))
            return false;
        if (this.getExecute() == null ? other.getExecute() != null : !this.getExecute().equals(other.getExecute()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Crontab;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getCron() == null ? 43 : this.getCron().hashCode());
        result = result * PRIME + (this.getDelay() == null ? 43 : this.getDelay().hashCode());
        result = result * PRIME + (this.getFixed() == null ? 43 : this.getFixed().hashCode());
        result = result * PRIME + (this.getExecute() == null ? 43 : this.getExecute().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        return result;
    }
}
