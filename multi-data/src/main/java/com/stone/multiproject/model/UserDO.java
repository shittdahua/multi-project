package com.stone.multiproject.model;

import com.stone.multiproject.base.BaseDO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class UserDO extends BaseDO {

    /**
     * Column: name
     * Remark: 姓名
     */
    private String name;

    /**
     * Column: sex
     * Remark: 性别
     */
    private Integer sex;

    /**
     * Column: birthday
     * Remark: 出生日期
     */
    private Date birthday;

    /**
     * Column: address
     * Remark: 地址
     */
    private String address;

    /**
     * Column: id_card
     * Remark: 身份证号
     */
    private String idCard;

    /**
     * Column: role
     * Remark: 角色
     */
    private String role;

    /**
     * Column: feature
     * Remark: 扩展字段
     */
    private String feature;
}
