package com.quick.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author cristianhuichaqueo
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { FreeMarkerAutoConfiguration.class })
@PropertySources({ @PropertySource(value = { "classpath:application.properties" }) })
@EnableSwagger2
@EnableScheduling
public class QuickDemo {

	public static void main(String[] args) {
		SpringApplication.run(QuickDemo.class, args);
	}
	
}