package com.kestrelcjx.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 会员用户列表Vo
 */
public class UserListVo {
    /**
     * 会员用户ID
     */
    private Integer id;
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 性别：1男 2女 3未知
     */
    private Integer gender;
    /**
     * 性别描述
     */
    private String genderName;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 用户头像
     */
    private String avatarUrl;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 出生日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;
    /**
     * 密码
     */
    private String password;
    /**
     * 户籍省份编号
     */
    private Integer provinceId;
    /**
     * 户籍城市编号
     */
    private Integer cityId;
    /**
     * 户籍区/县编号
     */
    private Integer districtId;
    /**
     * 所在城市
     */
    private String cityArea;
    /**
     * 个人简介
     */
    private String intro;
    /**
     * 个性签名
     */
    private String signature;
    /**
     * 设备类型：1苹果 2安卓 3WAP站 4PC站 5微信小程序 6后台添加
     */
    private Integer device;
    /**
     * 设备类型描述
     */
    private String deviceName;
    /**
     * 设备ID
     */
    private String deviceId;
    /**
     * 用户状态：1登录 2登出
     */
    private Integer loginStatus;
    /**
     * 用户状态描述
     */
    private String loginStatusName;
    /**
     * 推送的别名
     */
    private String pushAlias;
    /**
     * 用户来源：1注册会员 2马甲会员
     */
    private Integer source;
    /**
     * 用户来源描述
     */
    private String sourceName;
    /**
     * 是否启用：1启用  2停用
     */
    private Integer status;
    /**
     * 是否启用描述
     */
    private String statusName;
    /**
     * 客户端版本号
     */
    private String appVersion;
    /**
     * 我的推广码
     */
    private String code;
    /**
     * 推广二维码路径
     */
    private String qrcode;
    /**
     * 推广二维码地址
     */
    private String qrcodeUrl;
    /**
     * 最近登录IP
     */
    private String loginIp;
    /**
     * 上次登录地点
     */
    private String loginRegion;
    /**
     * 最近登录时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date loginTime;
    /**
     * 登录总次数
     */
    private Integer loginCount;
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
     * 修改人
     */
    private Integer updateUser;
    /**
     * 修改人名称
     */
    private String updateUserName;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    public UserListVo() {
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

    public Date getBirthday() {
        return this.birthday;
    }

    public String getPassword() {
        return this.password;
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

    public String getCityArea() {
        return this.cityArea;
    }

    public String getIntro() {
        return this.intro;
    }

    public String getSignature() {
        return this.signature;
    }

    public Integer getDevice() {
        return this.device;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public Integer getLoginStatus() {
        return this.loginStatus;
    }

    public String getLoginStatusName() {
        return this.loginStatusName;
    }

    public String getPushAlias() {
        return this.pushAlias;
    }

    public Integer getSource() {
        return this.source;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getStatusName() {
        return this.statusName;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getCode() {
        return this.code;
    }

    public String getQrcode() {
        return this.qrcode;
    }

    public String getQrcodeUrl() {
        return this.qrcodeUrl;
    }

    public String getLoginIp() {
        return this.loginIp;
    }

    public String getLoginRegion() {
        return this.loginRegion;
    }

    public Date getLoginTime() {
        return this.loginTime;
    }

    public Integer getLoginCount() {
        return this.loginCount;
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

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void setCityArea(String cityArea) {
        this.cityArea = cityArea;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setDevice(Integer device) {
        this.device = device;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public void setLoginStatusName(String loginStatusName) {
        this.loginStatusName = loginStatusName;
    }

    public void setPushAlias(String pushAlias) {
        this.pushAlias = pushAlias;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public void setLoginRegion(String loginRegion) {
        this.loginRegion = loginRegion;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
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
        if (!(o instanceof UserListVo)) return false;
        final UserListVo other = (UserListVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$realname = this.getRealname();
        final Object other$realname = other.getRealname();
        if (this$realname == null ? other$realname != null : !this$realname.equals(other$realname)) return false;
        final Object this$nickname = this.getNickname();
        final Object other$nickname = other.getNickname();
        if (this$nickname == null ? other$nickname != null : !this$nickname.equals(other$nickname)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        final Object this$genderName = this.getGenderName();
        final Object other$genderName = other.getGenderName();
        if (this$genderName == null ? other$genderName != null : !this$genderName.equals(other$genderName))
            return false;
        final Object this$avatar = this.getAvatar();
        final Object other$avatar = other.getAvatar();
        if (this$avatar == null ? other$avatar != null : !this$avatar.equals(other$avatar)) return false;
        final Object this$avatarUrl = this.getAvatarUrl();
        final Object other$avatarUrl = other.getAvatarUrl();
        if (this$avatarUrl == null ? other$avatarUrl != null : !this$avatarUrl.equals(other$avatarUrl)) return false;
        final Object this$mobile = this.getMobile();
        final Object other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) return false;
        final Object this$birthday = this.getBirthday();
        final Object other$birthday = other.getBirthday();
        if (this$birthday == null ? other$birthday != null : !this$birthday.equals(other$birthday)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final Object this$provinceId = this.getProvinceId();
        final Object other$provinceId = other.getProvinceId();
        if (this$provinceId == null ? other$provinceId != null : !this$provinceId.equals(other$provinceId))
            return false;
        final Object this$cityId = this.getCityId();
        final Object other$cityId = other.getCityId();
        if (this$cityId == null ? other$cityId != null : !this$cityId.equals(other$cityId)) return false;
        final Object this$districtId = this.getDistrictId();
        final Object other$districtId = other.getDistrictId();
        if (this$districtId == null ? other$districtId != null : !this$districtId.equals(other$districtId))
            return false;
        final Object this$cityArea = this.getCityArea();
        final Object other$cityArea = other.getCityArea();
        if (this$cityArea == null ? other$cityArea != null : !this$cityArea.equals(other$cityArea)) return false;
        final Object this$intro = this.getIntro();
        final Object other$intro = other.getIntro();
        if (this$intro == null ? other$intro != null : !this$intro.equals(other$intro)) return false;
        final Object this$signature = this.getSignature();
        final Object other$signature = other.getSignature();
        if (this$signature == null ? other$signature != null : !this$signature.equals(other$signature)) return false;
        final Object this$device = this.getDevice();
        final Object other$device = other.getDevice();
        if (this$device == null ? other$device != null : !this$device.equals(other$device)) return false;
        final Object this$deviceName = this.getDeviceName();
        final Object other$deviceName = other.getDeviceName();
        if (this$deviceName == null ? other$deviceName != null : !this$deviceName.equals(other$deviceName))
            return false;
        final Object this$deviceId = this.getDeviceId();
        final Object other$deviceId = other.getDeviceId();
        if (this$deviceId == null ? other$deviceId != null : !this$deviceId.equals(other$deviceId)) return false;
        final Object this$loginStatus = this.getLoginStatus();
        final Object other$loginStatus = other.getLoginStatus();
        if (this$loginStatus == null ? other$loginStatus != null : !this$loginStatus.equals(other$loginStatus))
            return false;
        final Object this$loginStatusName = this.getLoginStatusName();
        final Object other$loginStatusName = other.getLoginStatusName();
        if (this$loginStatusName == null ? other$loginStatusName != null : !this$loginStatusName.equals(other$loginStatusName))
            return false;
        final Object this$pushAlias = this.getPushAlias();
        final Object other$pushAlias = other.getPushAlias();
        if (this$pushAlias == null ? other$pushAlias != null : !this$pushAlias.equals(other$pushAlias)) return false;
        final Object this$source = this.getSource();
        final Object other$source = other.getSource();
        if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false;
        final Object this$sourceName = this.getSourceName();
        final Object other$sourceName = other.getSourceName();
        if (this$sourceName == null ? other$sourceName != null : !this$sourceName.equals(other$sourceName))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$statusName = this.getStatusName();
        final Object other$statusName = other.getStatusName();
        if (this$statusName == null ? other$statusName != null : !this$statusName.equals(other$statusName))
            return false;
        final Object this$appVersion = this.getAppVersion();
        final Object other$appVersion = other.getAppVersion();
        if (this$appVersion == null ? other$appVersion != null : !this$appVersion.equals(other$appVersion))
            return false;
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$qrcode = this.getQrcode();
        final Object other$qrcode = other.getQrcode();
        if (this$qrcode == null ? other$qrcode != null : !this$qrcode.equals(other$qrcode)) return false;
        final Object this$qrcodeUrl = this.getQrcodeUrl();
        final Object other$qrcodeUrl = other.getQrcodeUrl();
        if (this$qrcodeUrl == null ? other$qrcodeUrl != null : !this$qrcodeUrl.equals(other$qrcodeUrl)) return false;
        final Object this$loginIp = this.getLoginIp();
        final Object other$loginIp = other.getLoginIp();
        if (this$loginIp == null ? other$loginIp != null : !this$loginIp.equals(other$loginIp)) return false;
        final Object this$loginRegion = this.getLoginRegion();
        final Object other$loginRegion = other.getLoginRegion();
        if (this$loginRegion == null ? other$loginRegion != null : !this$loginRegion.equals(other$loginRegion))
            return false;
        final Object this$loginTime = this.getLoginTime();
        final Object other$loginTime = other.getLoginTime();
        if (this$loginTime == null ? other$loginTime != null : !this$loginTime.equals(other$loginTime)) return false;
        final Object this$loginCount = this.getLoginCount();
        final Object other$loginCount = other.getLoginCount();
        if (this$loginCount == null ? other$loginCount != null : !this$loginCount.equals(other$loginCount))
            return false;
        final Object this$createUser = this.getCreateUser();
        final Object other$createUser = other.getCreateUser();
        if (this$createUser == null ? other$createUser != null : !this$createUser.equals(other$createUser))
            return false;
        final Object this$createUserName = this.getCreateUserName();
        final Object other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName))
            return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$updateUser = this.getUpdateUser();
        final Object other$updateUser = other.getUpdateUser();
        if (this$updateUser == null ? other$updateUser != null : !this$updateUser.equals(other$updateUser))
            return false;
        final Object this$updateUserName = this.getUpdateUserName();
        final Object other$updateUserName = other.getUpdateUserName();
        if (this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $realname = this.getRealname();
        result = result * PRIME + ($realname == null ? 43 : $realname.hashCode());
        final Object $nickname = this.getNickname();
        result = result * PRIME + ($nickname == null ? 43 : $nickname.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        final Object $genderName = this.getGenderName();
        result = result * PRIME + ($genderName == null ? 43 : $genderName.hashCode());
        final Object $avatar = this.getAvatar();
        result = result * PRIME + ($avatar == null ? 43 : $avatar.hashCode());
        final Object $avatarUrl = this.getAvatarUrl();
        result = result * PRIME + ($avatarUrl == null ? 43 : $avatarUrl.hashCode());
        final Object $mobile = this.getMobile();
        result = result * PRIME + ($mobile == null ? 43 : $mobile.hashCode());
        final Object $birthday = this.getBirthday();
        result = result * PRIME + ($birthday == null ? 43 : $birthday.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final Object $provinceId = this.getProvinceId();
        result = result * PRIME + ($provinceId == null ? 43 : $provinceId.hashCode());
        final Object $cityId = this.getCityId();
        result = result * PRIME + ($cityId == null ? 43 : $cityId.hashCode());
        final Object $districtId = this.getDistrictId();
        result = result * PRIME + ($districtId == null ? 43 : $districtId.hashCode());
        final Object $cityArea = this.getCityArea();
        result = result * PRIME + ($cityArea == null ? 43 : $cityArea.hashCode());
        final Object $intro = this.getIntro();
        result = result * PRIME + ($intro == null ? 43 : $intro.hashCode());
        final Object $signature = this.getSignature();
        result = result * PRIME + ($signature == null ? 43 : $signature.hashCode());
        final Object $device = this.getDevice();
        result = result * PRIME + ($device == null ? 43 : $device.hashCode());
        final Object $deviceName = this.getDeviceName();
        result = result * PRIME + ($deviceName == null ? 43 : $deviceName.hashCode());
        final Object $deviceId = this.getDeviceId();
        result = result * PRIME + ($deviceId == null ? 43 : $deviceId.hashCode());
        final Object $loginStatus = this.getLoginStatus();
        result = result * PRIME + ($loginStatus == null ? 43 : $loginStatus.hashCode());
        final Object $loginStatusName = this.getLoginStatusName();
        result = result * PRIME + ($loginStatusName == null ? 43 : $loginStatusName.hashCode());
        final Object $pushAlias = this.getPushAlias();
        result = result * PRIME + ($pushAlias == null ? 43 : $pushAlias.hashCode());
        final Object $source = this.getSource();
        result = result * PRIME + ($source == null ? 43 : $source.hashCode());
        final Object $sourceName = this.getSourceName();
        result = result * PRIME + ($sourceName == null ? 43 : $sourceName.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $statusName = this.getStatusName();
        result = result * PRIME + ($statusName == null ? 43 : $statusName.hashCode());
        final Object $appVersion = this.getAppVersion();
        result = result * PRIME + ($appVersion == null ? 43 : $appVersion.hashCode());
        final Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        final Object $qrcode = this.getQrcode();
        result = result * PRIME + ($qrcode == null ? 43 : $qrcode.hashCode());
        final Object $qrcodeUrl = this.getQrcodeUrl();
        result = result * PRIME + ($qrcodeUrl == null ? 43 : $qrcodeUrl.hashCode());
        final Object $loginIp = this.getLoginIp();
        result = result * PRIME + ($loginIp == null ? 43 : $loginIp.hashCode());
        final Object $loginRegion = this.getLoginRegion();
        result = result * PRIME + ($loginRegion == null ? 43 : $loginRegion.hashCode());
        final Object $loginTime = this.getLoginTime();
        result = result * PRIME + ($loginTime == null ? 43 : $loginTime.hashCode());
        final Object $loginCount = this.getLoginCount();
        result = result * PRIME + ($loginCount == null ? 43 : $loginCount.hashCode());
        final Object $createUser = this.getCreateUser();
        result = result * PRIME + ($createUser == null ? 43 : $createUser.hashCode());
        final Object $createUserName = this.getCreateUserName();
        result = result * PRIME + ($createUserName == null ? 43 : $createUserName.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateUser = this.getUpdateUser();
        result = result * PRIME + ($updateUser == null ? 43 : $updateUser.hashCode());
        final Object $updateUserName = this.getUpdateUserName();
        result = result * PRIME + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "UserListVo(id=" + this.getId() + ", realname=" + this.getRealname() + ", nickname=" + this.getNickname() + ", gender=" + this.getGender() + ", genderName=" + this.getGenderName() + ", avatar=" + this.getAvatar() + ", avatarUrl=" + this.getAvatarUrl() + ", mobile=" + this.getMobile() + ", birthday=" + this.getBirthday() + ", password=" + this.getPassword() + ", provinceId=" + this.getProvinceId() + ", cityId=" + this.getCityId() + ", districtId=" + this.getDistrictId() + ", cityArea=" + this.getCityArea() + ", intro=" + this.getIntro() + ", signature=" + this.getSignature() + ", device=" + this.getDevice() + ", deviceName=" + this.getDeviceName() + ", deviceId=" + this.getDeviceId() + ", loginStatus=" + this.getLoginStatus() + ", loginStatusName=" + this.getLoginStatusName() + ", pushAlias=" + this.getPushAlias() + ", source=" + this.getSource() + ", sourceName=" + this.getSourceName() + ", status=" + this.getStatus() + ", statusName=" + this.getStatusName() + ", appVersion=" + this.getAppVersion() + ", code=" + this.getCode() + ", qrcode=" + this.getQrcode() + ", qrcodeUrl=" + this.getQrcodeUrl() + ", loginIp=" + this.getLoginIp() + ", loginRegion=" + this.getLoginRegion() + ", loginTime=" + this.getLoginTime() + ", loginCount=" + this.getLoginCount() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}