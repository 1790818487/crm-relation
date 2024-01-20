package com.dlm.dto.login;

import com.dlm.validated.userGroup.RegisterGroup;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class RequestLogin {

    @NotBlank(message = "账号不能为空")
    @Pattern(regexp = "^[0-9a-zA-Z@_]{8,16}$",message = "账号存在非法字符，可用特殊字符为‘@’，‘_';")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

    @NotBlank(message = "验证码不能为空")
    private String code;
}
