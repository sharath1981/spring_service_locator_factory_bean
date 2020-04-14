package com.poc.config;

import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poc.factory.ShapeFactory;

@Configuration
public class ShapeConfig {

	@Bean
	public ServiceLocatorFactoryBean getFactoryBean() {
		final ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
		factoryBean.setServiceLocatorInterface(ShapeFactory.class);
		return factoryBean;
	}
}
