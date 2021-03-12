package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统人员
 */
@TableName("sys_admin")
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
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
     * 头像
     */
    private String avatar;
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
    @JsonFormat(pattern = "yyyy-MM-dd")
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
     * 职级ID
     */
    private Integer levelId;
    /**
     * 岗位ID
     */
    private Integer positionId;
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
     * 详细地址
     */
    private String address;
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
     * 个性标签
     */
    private String tags;
    /**
     * 个人简历
     */
    private String intro;
    /**
     * 状态：1=正常，2=禁用
     */
    private Integer status;
    /**
     * 人员独立权限的菜单ID，多个规则使用“,”隔开
     */
    private String rules;
    /**
     * 用户角色ID（多个规则使用“,”隔开）
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

    public Admin() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
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
        return "Admin(" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender='" + gender + '\'' +
                ", avatar='" + avatar + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", companyId=" + companyId +
                ", deptId=" + deptId +
                ", levelId=" + levelId +
                ", positionId=" + positionId +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", districtId=" + districtId +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", tags='" + tags + '\'' +
                ", intro='" + intro + '\'' +
                ", status=" + status +
                ", rules='" + rules + '\'' +
                ", roleIds='" + roleIds + '\'' +
                ", note='" + note + '\'' +
                ", sort=" + sort +
                ", loginNum=" + loginNum +
                ", loginIp='" + loginIp + '\'' +
                ", loginTime=" + loginTime +
                ", createUser=" + createUser +
                ", createTime=" + createTime +
                ", updateUser=" + updateUser +
                ", updateTime=" + updateTime +
                ", mark=" + mark +
                ')';
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Admin)) return false;
        final Admin other = (Admin) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getRealname() == null ? other.getRealname() != null : !this.getRealname().equals(other.getRealname()))
            return false;
        if (this.getNickname() == null ? other.getNickname() != null : !this.getNickname().equals(other.getNickname()))
            return false;
        if (this.getGender() == null ? other.getGender() != null : !this.getGender().equals(other.getGender()))
            return false;
        if (this.getAvatar() == null ? other.getAvatar() != null : !this.getAvatar().equals(other.getAvatar()))
            return false;
        if (this.getMobile() == null ? other.getMobile() != null : !this.getMobile().equals(other.getMobile()))
            return false;
        if (this.getEmail() == null ? other.getEmail() != null : !this.getEmail().equals(other.getEmail()))
            return false;
        if (this.getBirthday() == null ? other.getBirthday() != null : !this.getBirthday().equals(other.getBirthday()))
            return false;
        if (this.getCompanyId() == null ? other.getCompanyId() != null : !this.getCompanyId().equals(other.getCompanyId()))
            return false;
        if (this.getDeptId() == null ? other.getDeptId() != null : !this.getDeptId().equals(other.getDeptId()))
            return false;
        if (this.getLevelId() == null ? other.getLevelId() != null : !this.getLevelId().equals(other.getLevelId()))
            return false;
        if (this.getPositionId() == null ? other.getPositionId() != null : !this.getPositionId().equals(other.getPositionId()))
            return false;
        if (this.getProvinceId() == null ? other.getProvinceId() != null : !this.getProvinceId().equals(other.getProvinceId()))
            return false;
        if (this.getCityId() == null ? other.getCityId() != null : !this.getCityId().equals(other.getCityId()))
            return false;
        if (this.getDistrictId() == null ? other.getDistrictId() != null : !this.getDistrictId().equals(other.getDistrictId()))
            return false;
        if (this.getAddress() == null ? other.getAddress() != null : !this.getAddress().equals(other.getAddress()))
            return false;
        if (this.getUsername() == null ? other.getUsername() != null :
                !this.getUsername().equals(other.getUsername())) return false;
        if (this.getPassword() == null ? other.getPassword() != null :
                !this.getPassword().equals(other.getPassword())) return false;
        if (this.getSalt() == null ? other.getSalt() != null : !this.getSalt().equals(other.getSalt())) return false;
        if (this.getTags() == null ? other.getTags() != null : !this.getTags().equals(other.getTags())) return false;
        if (this.getIntro() == null ? other.getIntro() != null : !this.getIntro().equals(other.getIntro()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getRules() == null ? other.getRules() != null : !this.getRules().equals(other.getRules()))
            return false;
        if (this.getRoleIds() == null ? other.getRoleIds() != null : !this.getRoleIds().equals(other.getRoleIds()))
            return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        if (this.getLoginNum() == null ? other.getLoginNum() != null : !this.getLoginNum().equals(other.getLoginNum()))
            return false;
        if (this.getLoginIp() == null ? other.getLoginIp() != null : !this.getLoginIp().equals(other.getLoginIp()))
            return false;
        if (this.getLoginTime() == null ? other.getLoginTime() != null : !this.getLoginTime().equals(other.getLoginTime()))
            return false;
        if (this.getCreateUser() == null ? other.getCreateUser() != null : !this.getCreateUser().equals(other.getCreateUser()))
            return false;
        if (this.getCreateTime() == null ? other.getCreateTime() != null : !this.getCreateTime().equals(other.getCreateTime()))
            return false;
        if (this.getUpdateUser() == null ? other.getUpdateUser() != null : !this.getUpdateUser().equals(other.getUpdateUser()))
            return false;
        if (this.getUpdateTime() == null ? other.getUpdateTime() != null : !this.getUpdateTime().equals(other.getUpdateTime()))
            return false;
        if (this.getMark() == null ? other.getMark() != null : !this.getMark().equals(other.getMark())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Admin;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getRealname() == null ? 43 : this.getRealname().hashCode());
        result = result * PRIME + (this.getNickname() == null ? 43 : this.getNickname().hashCode());
        result = result * PRIME + (this.getGender() == null ? 43 : this.getGender().hashCode());
        result = result * PRIME + (this.getAvatar() == null ? 43 : this.getAvatar().hashCode());
        result = result * PRIME + (this.getMobile() == null ? 43 : this.getMobile().hashCode());
        result = result * PRIME + (this.getEmail() == null ? 43 : this.getEmail().hashCode());
        result = result * PRIME + (this.getBirthday() == null ? 43 : this.getBirthday().hashCode());
        result = result * PRIME + (this.getCompanyId() == null ? 43 : this.getCompanyId().hashCode());
        result = result * PRIME + (this.getDeptId() == null ? 43 : this.getDeptId().hashCode());
        result = result * PRIME + (this.getLevelId() == null ? 43 : this.getLevelId().hashCode());
        result = result * PRIME + (this.getPositionId() == null ? 43 : this.getPositionId().hashCode());
        result = result * PRIME + (this.getProvinceId() == null ? 43 : this.getProvinceId().hashCode());
        result = result * PRIME + (this.getCityId() == null ? 43 : this.getCityId().hashCode());
        result = result * PRIME + (this.getDistrictId() == null ? 43 : this.getDistrictId().hashCode());
        result = result * PRIME + (this.getAddress() == null ? 43 : this.getAddress().hashCode());
        result = result * PRIME + (this.getUsername() == null ? 43 : this.getUsername().hashCode());
        result = result * PRIME + (this.getPassword() == null ? 43 : this.getPassword().hashCode());
        result = result * PRIME + (this.getSalt() == null ? 43 : this.getSalt().hashCode());
        result = result * PRIME + (this.getTags() == null ? 43 : this.getTags().hashCode());
        result = result * PRIME + (this.getIntro() == null ? 43 : this.getIntro().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getRules() == null ? 43 : this.getRules().hashCode());
        result = result * PRIME + (this.getRoleIds() == null ? 43 : this.getRoleIds().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        result = result * PRIME + (this.getLoginNum() == null ? 43 : this.getLoginNum().hashCode());
        result = result * PRIME + (this.getLoginIp() == null ? 43 : this.getLoginIp().hashCode());
        result = result * PRIME + (this.getLoginTime() == null ? 43 : this.getLoginTime().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        result = result * PRIME + (this.getMark() == null ? 43 : this.getMark().hashCode());
        return result;
    }
}
