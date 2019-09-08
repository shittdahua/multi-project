package model;

import java.util.Date;

/**
 * Table: user
 */
public class User {
    /**
     * Column: id
     */
    private Long id;

    /**
     * Column: gmt_create
     * Remark: 创建时间
     */
    private Date gmtCreate;

    /**
     * Column: gmt_modified
     * Remark: 修改时间
     */
    private Date gmtModified;

    /**
     * Column: account_id
     * Remark: 登录账号
     */
    private String accountId;

    /**
     * Column: user_name
     * Remark: 用户名称（昵称）
     */
    private String userName;

    /**
     * Column: user_password
     * Remark: 用户登录密码
     */
    private String userPassword;

    /**
     * Column: tel
     * Remark: 手机号
     */
    private String tel;

    /**
     * Column: email
     * Remark: 邮箱
     */
    private String email;

    /**
     * Column: id_card
     * Remark: 身份证号
     */
    private String idCard;

    /**
     * Column: province
     * Remark: 省
     */
    private String province;

    /**
     * Column: city
     * Remark: 市
     */
    private String city;

    /**
     * Column: district
     * Remark: 区
     */
    private String district;

    /**
     * Column: street
     * Remark: 街道
     */
    private String street;

    /**
     * Column: address
     * Remark: 详细地址
     */
    private String address;

    /**
     * Column: feature
     * Remark: 扩展字段
     */
    private String feature;

    /**
     * Column: status
     * Remark: 状态
     */
    private String status;

    /**
     * Column: role
     * Remark: 角色
     */
    private String role;

    /**
     * Column: authority
     * Remark: 权限
     */
    private String authority;

    /**
     * Column: last_operater
     * Remark: 操作人
     */
    private String lastOperater;

    /**
     * Column: login_time
     * Remark: 登录时间
     */
    private Date loginTime;

    /**
     * Column: last_login_time
     * Remark: 最后登录时间
     */
    private Date lastLoginTime;

    /**
     * Column: login_count
     * Remark: 登录次数
     */
    private Long loginCount;

    /**
     * Column: session_id
     * Remark: sessionId
     */
    private String sessionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    public String getLastOperater() {
        return lastOperater;
    }

    public void setLastOperater(String lastOperater) {
        this.lastOperater = lastOperater == null ? null : lastOperater.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Long getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }
}