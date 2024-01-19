package com.dlm.controller;

import com.dlm.dto.ResponseDto;
import com.dlm.dto.login.RequestLogin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 黎明
 * @since 2024-01-04
 */
@Controller
@RequestMapping("/user")
@Api(tags = "登录注册相关", produces = "application/json", consumes = "application/json",description = "用户接口")
public class UserController {

    @PostMapping("/login")
    @ApiOperation(value = "登录接口")
    public ResponseDto login(@Validated @RequestBody RequestLogin requestLogin) {
        System.out.println("success");
        return null;
    }
}
