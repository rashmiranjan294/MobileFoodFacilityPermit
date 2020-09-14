package com.mobilefoodfacility.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration

public class SwaggerConfigure {
	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2)
	    		  .	  select()
	         .apis(RequestHandlerSelectors.basePackage("com.mobilefoodfacility"))
	         .paths(PathSelectors.regex("/.*"))
	         .build()
	         .apiInfo(mataInfo());
	        
	   }

	private ApiInfo mataInfo() {
		@SuppressWarnings("deprecation")
		ApiInfo apiInfo= new ApiInfo("Mobile Food Facility Permit",
				"This application will provide FoodTruck information", "version 1.0", "termsOfServiceUrl", "Mobile-Food-Facility-Permit support Team", "license", "licenseUrl");
		return apiInfo;
	}
	}
