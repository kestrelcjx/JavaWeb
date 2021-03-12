package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 系统人员列表Vo
 */
public class AdminListVo {
    /**
     * 系统人员ID
     */
    private Integer id;
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 性别：1=男，2=女，3=保密
     */
    private Integer gender;
    /**
     * 性别描述
     */
    private String genderName;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 头像URL
     */
    private String avatarUrl;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 邮箱地址
     */
    private String email;
    /**
     * 出生日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;
    /**
     * 公司ID
     */
    private Integer companyId;
    /**
     * 部门ID
     */
    private Integer deptId;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 职级ID
     */
    private Integer levelId;
    /**
     * 职级名称
     */
    private String levelName;
    /**
     * 岗位ID
     */
    private Integer positionId;
    /**
     * 岗位名称
     */
    private String positionName;
    /**
     * 省份ID
     */
    private Integer provinceId;
    /**
     * 市区ID
     */
    private Integer cityId;
    /**
     * 区县ID
     */
    private Integer districtId;
    /**
     * 所属城市名称
     */
    private String cityName;
    /**
     * 登录用户名
     */
    private String username;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 盐加密
     */
    private String salt;
    /**
     * 状态：1=正常，2=禁用
     */
    private Integer status;
    /**
     * 状态描述
     */
    private String statusName;
    /**
     * 人员独立权限的菜单ID，多个规则逗号“,”隔开
     */
    private String rules;
    /**
     * 用户角色ID(多个规则逗号“,”隔开)
     */
    private String roleIds;
    /**
     * 备注
     */
    private String note;
    /**
     * 显示顺序
     */
    private Integer sort;
    /**
     * 登录次数
     */
    private Integer loginNum;
    /**
     * 最近登录IP
     */
    private String loginIp;
    /**
     * 最近登录时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date loginTime;
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

    public AdminListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getRealname() {
        return this.realname;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Integer getGender() {
        return this.gender;
    }

    public String getGenderName() {
        return this.genderName;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public Integer getDeptId() {
        return this.deptId;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public Integer getLevelId() {
        return this.levelId;
    }

    public String getLevelName() {
        return this.levelName;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public Integer getProvinceId() {
        return this.provinceId;
    }

    public Integer getCityId() {
        return this.cityId;
    }

    public Integer getDistrictId() {
        return this.districtId;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getSalt() {
        return this.salt;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getStatusName() {
        return this.statusName;
    }

    public String getRules() {
        return this.rules;
    }

    public String getRoleIds() {
        return this.roleIds;
    }

    public String getNote() {
        return this.note;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getLoginNum() {
        return this.loginNum;
    }

    public String getLoginIp() {
        return this.loginIp;
    }

    public Date getLoginTime() {
        return this.loginTime;
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

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
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
        if (!(o instanceof AdminListVo)) return false;
        final AdminListVo other = (AdminListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getRealname() == null ? other.getRealname() != null :
                !this.getRealname().equals(other.getRealname())) return false;
        if (this.getNickname() == null ? other.getNickname() != null :
                !this.getNickname().equals(other.getNickname())) return false;
        if (this.getGender() == null ? other.getGender() != null : !this.getGender().equals(other.getGender()))
            return false;
        if (this.getGenderName() == null ? other.getGenderName() != null :
                !this.getGenderName().equals(other.getGenderName()))
            return false;
        if (this.getAvatar() == null ? other.getAvatar() != null : !this.getAvatar().equals(other.getAvatar()))
            return false;
        if (this.getAvatarUrl() == null ? other.getAvatarUrl() != null :
                !this.getAvatarUrl().equals(other.getAvatarUrl())) return false;
        if (this.getMobile() == null ? other.getMobile() != null : !this.getMobile().equals(other.getMobile()))
            return false;
        if (this.getEmail() == null ? other.getEmail() != null : !this.getEmail().equals(other.getEmail()))
            return false;
        if (this.getBirthday() == null ? other.getBirthday() != null :
                !this.getBirthday().equals(other.getBirthday())) return false;
        if (this.getCompanyId() == null ? other.getCompanyId() != null :
                !this.getCompanyId().equals(other.getCompanyId())) return false;
        if (this.getDeptId() == null ? other.getDeptId() != null : !this.getDeptId().equals(other.getDeptId()))
            return false;
        if (this.getDeptName() == null ? other.getDeptName() != null :
                !this.getDeptName().equals(other.getDeptName())) return false;
        if (this.getLevelId() == null ? other.getLevelId() != null : !this.getLevelId().equals(other.getLevelId()))
            return false;
        if (this.getLevelName() == null ? other.getLevelName() != null :
                !this.getLevelName().equals(other.getLevelName())) return false;
        if (this.getPositionId() == null ? other.getPositionId() != null :
                !this.getPositionId().equals(other.getPositionId()))
            return false;
        if (this.getPositionName() == null ? other.getPositionName() != null :
                !this.getPositionName().equals(other.getPositionName()))
            return false;
        if (this.getProvinceId() == null ? other.getProvinceId() != null :
                !this.getProvinceId().equals(other.getProvinceId()))
            return false;
        if (this.getCityId() == null ? other.getCityId() != null : !this.getCityId().equals(other.getCityId()))
            return false;
        if (this.getDistrictId() == null ? other.getDistrictId() != null :
                !this.getDistrictId().equals(other.getDistrictId()))
            return false;
        if (this.getCityName() == null ? other.getCityName() != null :
                !this.getCityName().equals(other.getCityName())) return false;
        if (this.getUsername() == null ? other.getUsername() != null :
                !this.getUsername().equals(other.getUsername())) return false;
        if (this.getPassword() == null ? other.getPassword() != null :
                !this.getPassword().equals(other.getPassword())) return false;
        if (this.getSalt() == null ? other.getSalt() != null : !this.getSalt().equals(other.getSalt())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getStatusName() == null ? other.getStatusName() != null :
                !this.getStatusName().equals(other.getStatusName()))
            return false;
        if (this.getRules() == null ? other.getRules() != null : !this.getRules().equals(other.getRules()))
            return false;
        if (this.getRoleIds() == null ? other.getRoleIds() != null : !this.getRoleIds().equals(other.getRoleIds()))
            return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        if (this.getLoginNum() == null ? other.getLoginNum() != null :
                !this.getLoginNum().equals(other.getLoginNum())) return false;
        if (this.getLoginIp() == null ? other.getLoginIp() != null : !this.getLoginIp().equals(other.getLoginIp()))
            return false;
        if (this.getLoginTime() == null ? other.getLoginTime() != null :
                !this.getLoginTime().equals(other.getLoginTime())) return false;
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
        return other instanceof AdminListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getRealname() == null ? 43 : this.getRealname().hashCode());
        result = result * PRIME + (this.getNickname() == null ? 43 : this.getNickname().hashCode());
        result = result * PRIME + (this.getGender() == null ? 43 : this.getGender().hashCode());
        result = result * PRIME + (this.getGenderName() == null ? 43 : this.getGenderName().hashCode());
        result = result * PRIME + (this.getAvatar() == null ? 43 : this.getAvatar().hashCode());
        result = result * PRIME + (this.getAvatarUrl() == null ? 43 : this.getAvatarUrl().hashCode());
        result = result * PRIME + (this.getMobile() == null ? 43 : this.getMobile().hashCode());
        result = result * PRIME + (this.getEmail() == null ? 43 : this.getEmail().hashCode());
        result = result * PRIME + (this.getBirthday() == null ? 43 : this.getBirthday().hashCode());
        result = result * PRIME + (this.getCompanyId() == null ? 43 : this.getCompanyId().hashCode());
        result = result * PRIME + (this.getDeptId() == null ? 43 : this.getDeptId().hashCode());
        result = result * PRIME + (this.getDeptName() == null ? 43 : this.getDeptName().hashCode());
        result = result * PRIME + (this.getLevelId() == null ? 43 : this.getLevelId().hashCode());
        result = result * PRIME + (this.getLevelName() == null ? 43 : this.getLevelName().hashCode());
        result = result * PRIME + (this.getPositionId() == null ? 43 : this.getPositionId().hashCode());
        result = result * PRIME + (this.getPositionName() == null ? 43 : this.getPositionName().hashCode());
        result = result * PRIME + (this.getProvinceId() == null ? 43 : this.getProvinceId().hashCode());
        result = result * PRIME + (this.getCityId() == null ? 43 : this.getCityId().hashCode());
        result = result * PRIME + (this.getDistrictId() == null ? 43 : this.getDistrictId().hashCode());
        result = result * PRIME + (this.getCityName() == null ? 43 : this.getCityName().hashCode());
        result = result * PRIME + (this.getUsername() == null ? 43 : this.getUsername().hashCode());
        result = result * PRIME + (this.getPassword() == null ? 43 : this.getPassword().hashCode());
        result = result * PRIME + (this.getSalt() == null ? 43 : this.getSalt().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getStatusName() == null ? 43 : this.getStatusName().hashCode());
        result = result * PRIME + (this.getRules() == null ? 43 : this.getRules().hashCode());
        result = result * PRIME + (this.getRoleIds() == null ? 43 : this.getRoleIds().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        result = result * PRIME + (this.getLoginNum() == null ? 43 : this.getLoginNum().hashCode());
        result = result * PRIME + (this.getLoginIp() == null ? 43 : this.getLoginIp().hashCode());
        result = result * PRIME + (this.getLoginTime() == null ? 43 : this.getLoginTime().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateUserName() == null ? 43 : this.getCreateUserName().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateUserName() == null ? 43 : this.getUpdateUserName().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        return result;
    }

    public String toString() {
        return "AdminListVo(" +
                "id=" + this.getId() +
                ", realname=" + this.getRealname() +
                ", nickname=" + this.getNickname() +
                ", gender=" + this.getGender() +
                ", genderName=" + this.getGenderName() +
                ", avatar=" + this.getAvatar() +
                ", avatarUrl=" + this.getAvatarUrl() +
                ", mobile=" + this.getMobile() +
                ", email=" + this.getEmail() +
                ", birthday=" + this.getBirthday() +
                ", companyId=" + this.getCompanyId() +
                ", deptId=" + this.getDeptId() +
                ", deptName=" + this.getDeptName() +
                ", levelId=" + this.getLevelId() +
                ", levelName=" + this.getLevelName() +
                ", positionId=" + this.getPositionId() +
                ", positionName=" + this.getPositionName() +
                ", provinceId=" + this.getProvinceId() +
                ", cityId=" + this.getCityId() +
                ", districtId=" + this.getDistrictId() +
                ", cityName=" + this.getCityName() +
                ", username=" + this.getUsername() +
                ", password=" + this.getPassword() +
                ", salt=" + this.getSalt() +
                ", status=" + this.getStatus() +
                ", statusName=" + this.getStatusName() +
                ", rules=" + this.getRules() +
                ", roleIds=" + this.getRoleIds() +
                ", note=" + this.getNote() +
                ", sort=" + this.getSort() +
                ", loginNum=" + this.getLoginNum() +
                ", loginIp=" + this.getLoginIp() +
                ", loginTime=" + this.getLoginTime() +
                ", createUser=" + this.getCreateUser() +
                ", createUserName=" + this.getCreateUserName() +
                ", createTime=" + this.getCreateTime() +
                ", updateUser=" + this.getUpdateUser() +
                ", updateUserName=" + this.getUpdateUserName() +
                ", updateTime=" + this.getUpdateTime() +
                ")";
    }
}
