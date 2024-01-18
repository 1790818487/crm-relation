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
@TableName("service_transfer")
@ApiModel(value="ServiceTransfer对象", description="")
public class ServiceTransfer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "服务id")
    private Integer serviceId;

    @ApiModelProperty(value = "进行转交服务的客户经理")
    private Integer oldManagerId;

    @ApiModelProperty(value = "被转交服务的客户经理")
    private Integer newManagerId;

    @ApiModelProperty(value = "转交时间")
    private LocalDateTime time;

    @ApiModelProperty(value = "转交原因")
    private String reason;


}
