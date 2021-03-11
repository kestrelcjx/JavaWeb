package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 城市
 */
@TableName("sys_city")
public class City extends BaseEntity {
    /**
     * 城市名称
     */
    private String name;
    /**
     * 城市级别：1=省份，2=市区，3=区县
     */
    private Integer level;
    /**
     * 父级编号
     */
    private Integer pid;
    /**
     * 城市编号（区号）
     */
    private String citycode;
    /**
     * 父级地理编号
     */
    private String pAdcode;
    /**
     * 地理编号
     */
    private String adcode;
    /**
     * 城市坐标中心点经度（* 1e6）如果是中国，此值时1e7
     */
    private Integer lng;
    /**
     * 城市坐标中心点纬度（* 1e6）
     */
    private Integer lat;
    /**
     * 排序号
     */
    private Integer sort;

    public City() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getPid() {
        return this.pid;
    }

    public String getCitycode() {
        return this.citycode;
    }

    public String getPAdcode() {
        return this.pAdcode;
    }

    public String getAdcode() {
        return this.adcode;
    }

    public Integer getLng() {
        return this.lng;
    }

    public Integer getLat() {
        return this.lat;
    }

    public Integer getSort() {
        return this.sort;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }

    public City setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public City setPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    public City setCitycode(String citycode) {
        this.citycode = citycode;
        return this;
    }

    public City setPAdcode(String pAdcode) {
        this.pAdcode = pAdcode;
        return this;
    }

    public City setAdcode(String adcode) {
        this.adcode = adcode;
        return this;
    }

    public City setLng(Integer lng) {
        this.lng = lng;
        return this;
    }

    public City setLat(Integer lat) {
        this.lat = lat;
        return this;
    }

    public City setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "City(" +
                "name=" + this.getName() +
                ", level=" + this.getLevel() +
                ", pid=" + this.getPid() +
                ", citycode=" + this.getCitycode() +
                ", pAdcode=" + this.getPAdcode() +
                ", adcode=" + this.getAdcode() +
                ", lng=" + this.getLng() +
                ", lat=" + this.getLat() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof City)) return false;
        final City other = (City) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getLevel() == null ? other.getLevel() != null : !this.getLevel().equals(other.getLevel()))
            return false;
        if (this.getPid() == null ? other.getPid() != null : !this.getPid().equals(other.getPid())) return false;
        if (this.getCitycode() == null ? other.getCitycode() != null :
                !this.getCitycode().equals(other.getCitycode())) return false;
        if (this.getPAdcode() == null ? other.getPAdcode() != null : !this.getPAdcode().equals(other.getPAdcode()))
            return false;
        if (this.getAdcode() == null ? other.getAdcode() != null : !this.getAdcode().equals(other.getAdcode()))
            return false;
        if (this.getLng() == null ? other.getLng() != null : !this.getLng().equals(other.getLng())) return false;
        if (this.getLat() == null ? other.getLat() != null : !this.getLat().equals(other.getLat())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof City;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getLevel() == null ? 43 : this.getLevel().hashCode());
        result = result * PRIME + (this.getPid() == null ? 43 : this.getPid().hashCode());
        result = result * PRIME + (this.getCitycode() == null ? 43 : this.getCitycode().hashCode());
        result = result * PRIME + (this.getPAdcode() == null ? 43 : this.getPAdcode().hashCode());
        result = result * PRIME + (this.getAdcode() == null ? 43 : this.getAdcode().hashCode());
        result = result * PRIME + (this.getLng() == null ? 43 : this.getLng().hashCode());
        result = result * PRIME + (this.getLat() == null ? 43 : this.getLat().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
