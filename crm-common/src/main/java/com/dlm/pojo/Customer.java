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
@TableName("customer")
@ApiModel(value="Customer对象", description="")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "客户编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "客户名称（唯一性）")
    private String name;

    @ApiModelProperty(value = "客户类别（数据字典）")
    private String type;

    @ApiModelProperty(value = "客户等级（数据字典）")
    private String level;

    @ApiModelProperty(value = "客户状态（数据字典）")
    private String status;

    @ApiModelProperty(value = "客户信用度（数据字典）")
    private String credit;

    @ApiModelProperty(value = "客户所在地区")
    private String area;

    @ApiModelProperty(value = "公司详细地址")
    private String companyAddress;

    @ApiModelProperty(value = "公司电话")
    private String companyPhone;

    @ApiModelProperty(value = "邮政编码")
    private String postCode;

    @ApiModelProperty(value = "传真地址")
    private String faxAddress;

    @ApiModelProperty(value = "公司网站")
    private String companyWebsite;

    @ApiModelProperty(value = "营业执照注册号")
    private String licenseNumber;

    @ApiModelProperty(value = "法人")
    private String corporation;

    @ApiModelProperty(value = "年营业额")
    private Double annualSale;

    @ApiModelProperty(value = "开户银行")
    private String depositBank;

    @ApiModelProperty(value = "银行账号")
    private String bankAccount;

    @ApiModelProperty(value = "地税登记号")
    private String landTaxNumber;

    @ApiModelProperty(value = "国税登记号")
    private String nationalTaxNumber;

    @ApiModelProperty(value = "客户来源（数据字典）")
    private String source;

    @ApiModelProperty(value = "客户描述")
    private String description;

    @ApiModelProperty(value = "客户成熟度（数据字典）")
    private String maturity;

    @ApiModelProperty(value = "相关文档保存地址")
    private String document;

    @ApiModelProperty(value = "删除状态 0为未删除 1为已删除")
    private Integer deleteStatus;

    @ApiModelProperty(value = "客户所属的客户经理（外键）")
    private Integer managerId;

    @ApiModelProperty(value = "客户主要意向产品（外键）")
    private Integer productId;

    @ApiModelProperty(value = "创建人（经理）")
    private String creater;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


}
