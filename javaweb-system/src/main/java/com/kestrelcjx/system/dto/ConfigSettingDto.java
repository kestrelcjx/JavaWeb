package com.kestrelcjx.system.dto;

public class ConfigSettingDto {
    /**
     * 字段名
     */
    private String name;
    /**
     * 字段值
     */
    private String value;

    public ConfigSettingDto() {
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConfigSettingDto)) return false;
        final ConfigSettingDto other = (ConfigSettingDto) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getValue() == null ? other.getValue() != null : !this.getValue().equals(other.getValue()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConfigSettingDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getValue() == null ? 43 : this.getValue().hashCode());
        return result;
    }

    public String toString() {
        return "ConfigSettingDto(" +
                "name=" + this.getName() +
                ", value=" + this.getValue() +
                ")";
    }
}
