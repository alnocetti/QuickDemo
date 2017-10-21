package com.quick.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {          
	
	@Value("${swagger.title}")
    private String api;
	
	@Value("${swagger.description}")
    private String description;
	
//	@Value("${swagger.version}")
    private String version;
	
    @Bean
    public Docket api() {
    	
    	version  = getClass().getPackage().getImplementationVersion();
    	ApiInfo apiInfo = new ApiInfo(api, description, version, "", "", "", "");
        return new Docket(DocumentationType.SWAGGER_2)
          .apiInfo(apiInfo)
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.regex("/api/.*|/account/.*"))
          //.paths(PathSelectors.regex("/account/.*"))
          .build();                                           
    }
}