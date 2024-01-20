package com.dlm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dlm.validated.userGroup.RegisterGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 黎明
 * @since 2024-01-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
@ApiModel(value="User对象", description="用户登录信息保存对象")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户账号")
    @Pattern(regexp = "^[0-9a-zA-Z@_]{8,16}$",message = "账号存在非法字符，包含的特殊字符为‘@’，‘_';",groups = RegisterGroup.class)
    private String account;

    @ApiModelProperty(value = "密码")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$",message = "密码格式为大小写和数字组合，并且8位以上，不能存在特殊字符")
    private String password;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "MD5盐值")
    private String salt;

    @ApiModelProperty(value = "用户邮箱")
    private String email;

    @ApiModelProperty(value = "用户手机号")
//    @Pattern(regexp = "^1[3456789]\\d{9}$",message = "手机号格式不正确")
    private String phoneNumber;

    @ApiModelProperty(value = "用户创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "上一次登陆时间")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty(value = "角色id")
    private Integer roleId;

    @ApiModelProperty(value = "账号锁定状态 0 为未锁定 1为1锁定")
//    @Pattern(regexp = "^[01]$")
    private Integer status;


}
