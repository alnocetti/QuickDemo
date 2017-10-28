package com.quick.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * 
 * @author cristianhuichaqueo
 *
 */
@SpringBootApplication
@PropertySources({ @PropertySource(value = { "classpath:application.properties" }) })
public class QuickDemo {

	public static void main(String[] args) {
		SpringApplication.run(QuickDemo.class, args);
	}
	
}