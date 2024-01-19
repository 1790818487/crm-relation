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
@TableName("customer_transfer")
@ApiModel(value="CustomerTransfer对象", description="")
public class CustomerTransfer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "客户转移记录id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "被转移的客户id")
    private Integer customerId;

    @ApiModelProperty(value = "转移前的客户经理")
    private Integer oldManagerId;

    @ApiModelProperty(value = "转移后的客户经理")
    private Integer newManagerId;

    @ApiModelProperty(value = "转移原因")
    private String reason;

    @ApiModelProperty(value = "转移时间")
    private LocalDateTime time;


}
