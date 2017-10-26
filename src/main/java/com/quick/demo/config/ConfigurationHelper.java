package com.quick.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationHelper {

	@Value("${accountUrl}")
	private String accountUrl;
	

	public String getAccountUrl() {
		return accountUrl;
	}

}
