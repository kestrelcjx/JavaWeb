package com.kestrelcjx.system.dto;

public class LevelDto {
    /**
     * 数据源ID(逗号分隔)
     */
    String ids;
    /**
     * 设置状态
     */
    Integer status;

    public LevelDto() {
    }

    public String getIds() {
        return this.ids;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LevelDto)) return false;
        final LevelDto other = (LevelDto) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getIds() == null ? other.getIds() != null : !this.getIds().equals(other.getIds())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LevelDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getIds() == null ? 43 : this.getIds().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }

    public String toString() {
        return "LevelDto(" +
                "ids=" + this.getIds() +
                ", status=" + this.getStatus() +
                ")";
    }
}
