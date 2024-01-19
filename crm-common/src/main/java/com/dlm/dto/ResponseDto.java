package com.dlm.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel(value = "响应数据",description = "给前端进行传的json数据")
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private int code;
    private String errorMsg;
    private Object data;
}
