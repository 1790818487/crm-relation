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
import java.time.LocalDate;

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
@TableName("linkman")
@ApiModel(value="Linkman对象", description="")
public class Linkman implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "联系人编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "联系人名称")
    private String name;

    @ApiModelProperty(value = "联系人职位")
    private String position;

    @ApiModelProperty(value = "办公司电话")
    private String officePhone;

    @ApiModelProperty(value = "手机电话")
    private String mobilePhone;

    @ApiModelProperty(value = "生日")
    private LocalDate birthday;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "联系等级：0 为主要联系人 1为普通联系人")
    private Integer level;

    @ApiModelProperty(value = "所属客户")
    private Integer customerId;


}
