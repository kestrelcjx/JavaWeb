package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 城市列表Vo
 */
public class CityListVo {
    /**
     * 城市ID
     */
    private Integer id;
    /**
     * 城市名称
     */
    private String name;
    /**
     * 城市级别：1=省份，2=市区，3=区县
     */
    private Integer level;
    /**
     * 城市级别描述
     */
    private String levelName;
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
     * 城市坐标中心点经度（* 1e6）如果是中国，此值是 1e7
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
    /**
     * 添加人
     */
    private Integer createUser;
    /**
     * 添加人名称
     */
    private String createUserName;
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
     * 更新人名称
     */
    private String updateUserName;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    public CityListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getLevelName() {
        return this.levelName;
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

    public Integer getCreateUser() {
        return this.createUser;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public String getUpdateUserName() {
        return this.updateUserName;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public void setPAdcode(String pAdcode) {
        this.pAdcode = pAdcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public void setLng(Integer lng) {
        this.lng = lng;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CityListVo)) return false;
        final CityListVo other = (CityListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getLevel() == null ? other.getLevel() != null : !this.getLevel().equals(other.getLevel()))
            return false;
        if (this.getLevelName() == null ? other.getLevelName() != null :
                !this.getLevelName().equals(other.getLevelName())) return false;
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
        if (this.getCreateUser() == null ? other.getCreateUser() != null :
                !this.getCreateUser().equals(other.getCreateUser()))
            return false;
        if (this.getCreateUserName() == null ? other.getCreateUserName() != null :
                !this.getCreateUserName().equals(other.getCreateUserName()))
            return false;
        if (this.getCreateTime() == null ? other.getCreateTime() != null :
                !this.getCreateTime().equals(other.getCreateTime()))
            return false;
        if (this.getUpdateUser() == null ? other.getUpdateUser() != null :
                !this.getUpdateUser().equals(other.getUpdateUser()))
            return false;
        if (this.getUpdateUserName() == null ? other.getUpdateUserName() != null :
                !this.getUpdateUserName().equals(other.getUpdateUserName()))
            return false;
        if (this.getUpdateTime() == null ? other.getUpdateTime() != null :
                !this.getUpdateTime().equals(other.getUpdateTime()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CityListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getLevel() == null ? 43 : this.getLevel().hashCode());
        result = result * PRIME + (this.getLevelName() == null ? 43 : this.getLevelName().hashCode());
        result = result * PRIME + (this.getPid() == null ? 43 : this.getPid().hashCode());
        result = result * PRIME + (this.getCitycode() == null ? 43 : this.getCitycode().hashCode());
        result = result * PRIME + (this.getPAdcode() == null ? 43 : this.getPAdcode().hashCode());
        result = result * PRIME + (this.getAdcode() == null ? 43 : this.getAdcode().hashCode());
        result = result * PRIME + (this.getLat() == null ? 43 : this.getLat().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateUserName() == null ? 43 : this.getCreateUserName().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateUserName() == null ? 43 : this.getUpdateUserName().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        return result;
    }

    public String toString() {
        return "CityListVo(" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", level=" + this.getLevel() +
                ", levelName=" + this.getLevelName() +
                ", pid=" + this.getPid() +
                ", citycode=" + this.getCitycode() +
                ", pAdcode=" + this.getPAdcode() +
                ", adcode=" + this.getAdcode() +
                ", lng=" + this.getLng() +
                ", lat=" + this.getLat() +
                ", sort=" + this.getSort() +
                ", createUser=" + this.getCreateUser() +
                ", createUserName=" + this.getCreateUserName() +
                ", createTime=" + this.getCreateTime() +
                ", updateUser=" + this.getUpdateUser() +
                ", updateUserName=" + this.getUpdateUserName() +
                ", updateTime=" + this.getUpdateTime() +
                ")";
    }
}
