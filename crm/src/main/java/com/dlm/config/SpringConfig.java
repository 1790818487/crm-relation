package com.dlm.config;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Objects;

@Configuration
@EnableOpenApi
@EnableWebMvc
@ServletComponentScan("com.dlm.web")
public class SpringConfig {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.OAS_30).apiInfo(
                new ApiInfoBuilder()
                        .description("CRM管理系统接口")
                        .title("CRM管理系统接口文档")
                        .description("我的接口参数")

                        .version("1.0")
                .build()
        ).host("localhost")
                .groupName("v1")
                .select().build();
//                .ignoredParameterTypes(BasicErrorController.class);
    }

    @Bean
    public RedisTemplate<String,Object> redisTemplate1(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }
}
