package com.czp.bean.annotaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.czp.bean.annotaion")
public class AppConfig {

	@Bean
	public com.czp.bean.annotaion.MyService myService() {
		return new com.czp.bean.annotaion.MyServiceImpl();
	}
}
