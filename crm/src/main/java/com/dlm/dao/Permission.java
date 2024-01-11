package com.dlm.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@TableName("permission")
@ApiModel(value="Permission对象", description="")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "权限id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "上级id")
    private Integer pid;

    @ApiModelProperty(value = "概要类型：0为菜单 1为功能")
    private Integer type;

    @ApiModelProperty(value = "权限标题")
    private String title;

    @ApiModelProperty(value = "权限描述")
    private String description;

    @ApiModelProperty(value = "权限对应可使用的url")
    private String url;

    @ApiModelProperty(value = "权限编码")
    private String code;

    @ApiModelProperty(value = "权限状态：0 为正常 1为禁用")
    private Integer status;


}
