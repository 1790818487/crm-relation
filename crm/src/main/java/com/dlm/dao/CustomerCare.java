package com.dlm.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
@TableName("customer_care")
@ApiModel(value="CustomerCare对象", description="")
public class CustomerCare implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "关怀的联系人ID")
    private Integer linkmanId;

    @ApiModelProperty(value = "记录插入记录时联系人的生日")
    private LocalDate birthday;

    @ApiModelProperty(value = "关怀时间")
    private LocalDateTime time;

    @ApiModelProperty(value = "关怀详情")
    private String detail;

    @ApiModelProperty(value = "关怀类型")
    private String type;

    @ApiModelProperty(value = "关怀状态")
    private String status;

    @ApiModelProperty(value = "客户反馈")
    private String feedback;

    @ApiModelProperty(value = "插入时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "进行关怀的客户经理")
    private Integer managerId;


}
