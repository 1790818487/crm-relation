package com.liming.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping ({"/login","/"})
    @ApiOperation(value = "登录接口")
    public String login(ModelMap map) {
        return "system/user/login";
    }
}
