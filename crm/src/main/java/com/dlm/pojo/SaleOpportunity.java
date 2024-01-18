package com.dlm.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("sale_opportunity")
@ApiModel(value="SaleOpportunity对象", description="")
public class SaleOpportunity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "客户id")
    private Integer customerId;

    @ApiModelProperty(value = "机会来源")
    private String source;

    @ApiModelProperty(value = "成功几率")
    private String success;

    @ApiModelProperty(value = "机会概要")
    private String general;

    @ApiModelProperty(value = "客户联系人")
    private Integer contactId;

    @ApiModelProperty(value = "客户联系人电话")
    private String contactPhone;

    @ApiModelProperty(value = "机会描述")
    private String description;

    @ApiModelProperty(value = "销售机会创建人")
    private Integer creater;

    @ApiModelProperty(value = "销售机会创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "被分配给的客户经理")
    private Integer managerId;

    @ApiModelProperty(value = "分配时间")
    private LocalDateTime allotDate;

    @ApiModelProperty(value = "销售机会的状态")
    private String status;

    @ApiModelProperty(value = "是否已经被删除  0：未删除  1：已删除")
    private Integer deleteStatus;


}
