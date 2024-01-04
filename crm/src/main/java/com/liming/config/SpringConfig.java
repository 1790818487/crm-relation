package com.liming.config;

import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
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
}
