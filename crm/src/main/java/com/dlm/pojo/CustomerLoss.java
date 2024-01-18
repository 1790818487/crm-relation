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
@TableName("customer_loss")
@ApiModel(value="CustomerLoss对象", description="")
public class CustomerLoss implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "客户流失管理id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "流失用户的id")
    private Integer customerId;

    @ApiModelProperty(value = "上次下单时间")
    private LocalDateTime lastOrderTime;

    @ApiModelProperty(value = "暂缓措施")
    private String measure;

    @ApiModelProperty(value = "追加暂缓措施")
    private String measureAppend;

    @ApiModelProperty(value = "确认流失时间")
    private LocalDateTime lossDate;

    @ApiModelProperty(value = "流失原因")
    private String reason;

    @ApiModelProperty(value = "流失状态 0 将要流失  1挽回客户 2确认流失")
    private String status;


}
