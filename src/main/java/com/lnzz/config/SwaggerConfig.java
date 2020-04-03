package com.lnzz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName：SwaggerConfig
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/3 9:41
 * @Description:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.lnzz.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("RBAC - 权限管理系统接口api")
                .contact(new Contact("lnzz",
                        "http://47.94.200.204",
                        "lengnzz@yeah.net"))
                .description("专为RBAC权限管理系统提供的api文档")
                .version("1.0.1")
                .termsOfServiceUrl("http://47.94.200.204")
                .build();
    }
}
