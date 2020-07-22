package com.talkweb.demo.shop.category.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
　* @Description: swagger2配置类
　* @author gavin
　* @date 2020/3/16 14:59
  */
@Configuration
@EnableSwagger2
@Profile({"dev","test"})
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
            .paths(PathSelectors.any())
            .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            // 标题
            .title("拓维信息")
            // Api 文档描述
            .description("iot-manger-server")
            .termsOfServiceUrl("接口列表")
            // 文档作者信息
            .contact(new Contact("talkweb", "xx", "xxx"))
            // 文档版本
            .version("2.0")
            .build();
    }
}

