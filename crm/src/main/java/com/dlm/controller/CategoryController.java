package com.dlm.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 黎明
 * @since 2024-01-04
 */
@RestController
@RequestMapping("/category")
@ApiOperation(value = "分类")
public class CategoryController {
    @PostMapping("cate")
    public String aa() {
        return "sd";
    }
}
