package com.dlm.dto.login;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class RequestLogin {
    @NotBlank(message = "账号不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
    @NotBlank(message = "验证码不能为空")
    private String code;
}
