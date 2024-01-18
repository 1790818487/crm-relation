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
@TableName("follow_up")
@ApiModel(value="FollowUp对象", description="")
public class FollowUp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private LocalDateTime time;

    @ApiModelProperty(value = "地点")
    private String address;

    @ApiModelProperty(value = "概要")
    private String general;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "详细信息")
    private String content;

    @ApiModelProperty(value = "相关文档")
    private String document;

    @ApiModelProperty(value = "结果")
    private String result;

    @ApiModelProperty(value = "客户编号")
    private Integer customerId;

    @ApiModelProperty(value = "跟进人")
    private Integer managerId;

    @ApiModelProperty(value = "删除状态")
    private Integer deleteStatus;


}
