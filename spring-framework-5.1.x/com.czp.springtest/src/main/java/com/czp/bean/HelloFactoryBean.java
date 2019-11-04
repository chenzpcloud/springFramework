package com.czp.bean;

import org.springframework.beans.factory.FactoryBean;

public class HelloFactoryBean implements FactoryBean {


	@Override
	public Object getObject() throws Exception {
		Hello hello=new Hello();
		hello.setContent("hello");
		return hello;
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}


}
