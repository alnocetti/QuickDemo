package com.quick.demo.config;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.NullCacheStorage;
import freemarker.ext.jsp.TaglibFactory;
import freemarker.template.TemplateException;

@Configuration
public class FreemarkerConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	private ConfigurationHelper helper;

	@Bean
	@Autowired
	public freemarker.template.Configuration freeMarkerConfig(ServletContext servletContext)
			throws IOException, TemplateException {
		FreeMarkerConfigurer freemarkerConfig = configFreeMarkerConfigurer(servletContext);
		return freemarkerConfig.getConfiguration();
	}

	@Bean
	@Autowired
	public TaglibFactory taglibFactory(ServletContext servletContext) throws IOException, TemplateException {
		FreeMarkerConfigurer freemarkerConfig = configFreeMarkerConfigurer(servletContext);
		TaglibFactory taglibFactory = freemarkerConfig.getTaglibFactory();
		taglibFactory.setObjectWrapper(freemarker.template.Configuration
				.getDefaultObjectWrapper(freemarker.template.Configuration.getVersion()));
		return taglibFactory;
	}

	@Autowired
	@Bean
	public FreeMarkerConfig springFreeMarkerConfig(ServletContext servletContext)
			throws IOException, TemplateException {
		return new MyFreeMarkerConfig(freeMarkerConfig(servletContext), taglibFactory(servletContext));
	}

	private FreeMarkerConfigurer configFreeMarkerConfigurer(ServletContext servletContext)
			throws IOException, TemplateException {
		FreeMarkerConfigurer freemarkerConfig = new FreeMarkerConfigurer();
		freemarkerConfig.setPreTemplateLoaders(new ClassTemplateLoader(FreemarkerConfiguration.class, "/templates/"));
		ServletContext servletContextProxy = (ServletContext) Proxy.newProxyInstance(
				ServletContextResourceHandler.class.getClassLoader(), new Class<?>[] { ServletContext.class },
				new ServletContextResourceHandler(servletContext));
		freemarkerConfig.setServletContext(servletContextProxy);

		Map<String, Object> sharedVariables = new HashMap<>();
		sharedVariables.put("accountUrl", helper.getAccountUrl());
		freemarkerConfig.setFreemarkerVariables(sharedVariables);

		Properties settings = new Properties();
		settings.put("default_encoding", "UTF-8");
		settings.put("auto_import", "layout/layout.ftl as layout");

		freemarkerConfig.setTemplateLoaderPath("/");
		freemarkerConfig.setFreemarkerSettings(settings);
		freemarkerConfig.afterPropertiesSet();

		return freemarkerConfig;
	}

	@Bean
	public FreeMarkerViewResolver viewResolver() {
		FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
		viewResolver.setCache(false);
		viewResolver.setSuffix(".ftl");
		viewResolver.setContentType("text/html;charset=UTF-8");
		viewResolver.setCacheLimit(0);
		viewResolver.clearCache();
		return viewResolver;
	}

	private static class ServletContextResourceHandler implements InvocationHandler {

		private final ServletContext target;

		private ServletContextResourceHandler(ServletContext target) {
			this.target = target;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if ("getResourceAsStream".equals(method.getName())) {
				Object result = method.invoke(target, args);
				if (result == null) {
					result = FreemarkerConfiguration.class.getResourceAsStream((String) args[0]);
				}
				return result;
			} else if ("getResource".equals(method.getName())) {
				Object result = method.invoke(target, args);
				if (result == null) {
					result = FreemarkerConfiguration.class.getResource((String) args[0]);
				}
				return result;
			}

			return method.invoke(target, args);
		}
	}

	private class MyFreeMarkerConfig implements FreeMarkerConfig {

		private final freemarker.template.Configuration configuration;
		private final TaglibFactory taglibFactory;

		private MyFreeMarkerConfig(freemarker.template.Configuration configuration, TaglibFactory taglibFactory) {
			this.configuration = configuration;
			this.taglibFactory = taglibFactory;
		}

		@Override
		public freemarker.template.Configuration getConfiguration() {
			configuration.setCacheStorage(new NullCacheStorage());

			configuration.clearTemplateCache();
			return configuration;
		}

		@Override
		public TaglibFactory getTaglibFactory() {
			return taglibFactory;
		}
		
	}
	
}