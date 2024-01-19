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
@TableName("service")
@ApiModel(value="Service对象", description="")
public class Service implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "服务的类型(数据字典)")
    private String type;

    @ApiModelProperty(value = "服务的概要")
    private String general;

    @ApiModelProperty(value = "客户id")
    private Integer customerId;

    @ApiModelProperty(value = "服务紧急程度(数据字典)")
    private String emergency;

    @ApiModelProperty(value = "联系电话")
    private String phoneNumber;

    @ApiModelProperty(value = "服务状态(数据字典)")
    private String status;

    @ApiModelProperty(value = "客户请求内容")
    private String request;

    @ApiModelProperty(value = "服务的创建人")
    private Integer creater;

    @ApiModelProperty(value = "服务的创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "服务的处理内容")
    private String handleContent;

    @ApiModelProperty(value = "服务的处理人")
    private Integer handler;

    @ApiModelProperty(value = "服务的处理时间")
    private LocalDateTime handlerTime;

    @ApiModelProperty(value = "服务的处理结果")
    private String handleResult;

    @ApiModelProperty(value = "客户对服务的满意度(数据字典)")
    private String degree;

    @ApiModelProperty(value = "是否删除状态  0：未删除   1：已删除")
    private Integer deleteStatus;


}
