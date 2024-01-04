package com.liming.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "响应数据",description = "给前端进行传的json数据")
public class ResponseDto {
    private int code;
    private String errorMsg;
    private Object data;
}
