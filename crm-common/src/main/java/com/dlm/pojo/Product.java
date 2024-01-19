package com.dlm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
@TableName("product")
@ApiModel(value="Product对象", description="")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "序号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "产品名称")
    private String name;

    @ApiModelProperty(value = "仓库地址")
    private String location;

    @ApiModelProperty(value = "型号")
    private String version;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "单价")
    private Double price;

    @ApiModelProperty(value = "库存")
    private Integer repertory;

    @ApiModelProperty(value = "备注")
    private String remarks;

    private Integer categoryId;


}
