package com.liming.controller;


import com.liming.dto.ResponseDto;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 黎明
 * @since 2024-01-04
 */
@RestController
@RequestMapping("/user")
@Api(tags = "登录注册相关", produces = "application/json", consumes = "application/json",description = "用户接口")
public class UserController {
    @PostMapping("/login")
    @ApiOperation(value = "登录接口")
    public ResponseDto login() {
        System.out.println("success");
        return null;
    }
}
