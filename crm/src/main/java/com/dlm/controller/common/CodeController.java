package com.dlm.controller.common;

import cn.hutool.core.util.IdUtil;
import com.dlm.dto.ResponseDto;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@RestController
@Api(tags = "验证码的生成", produces = "application/image", consumes = "application/image",description = "验证码相关")
public class CodeController {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @GetMapping("codeImage")
    public ResponseDto codeCreate(){
        HashMap<String, String> hashMap = new HashMap<>();
        String code = IdUtil.randomUUID();
        hashMap.put("code", code);

        redisTemplate.opsForValue().set("code",code,300, TimeUnit.SECONDS);

        return new ResponseDto(200,null,hashMap);
    }
}
