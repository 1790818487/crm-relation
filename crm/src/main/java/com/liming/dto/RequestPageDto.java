package com.liming.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "分页数据请求",description = "通用分页请求数据")
public class RequestPageDto {
    private Integer current;
    private Integer size;
    public void checkParam(){
        if (this.current==null||this.current<0)
            this.current=0;
        if (size==null||size/10!=0)
            this.size=10;
    }
}
