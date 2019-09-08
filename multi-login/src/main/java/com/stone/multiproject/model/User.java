package com.stone.multiproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -2658345175507068099L;
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

}


