package com.czp.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PayEntity implements BeanNameAware, BeanFactoryAware, InitializingBean, ApplicationContextAware {

	public PayEntity() {
		System.out.println("1.对象的实例化完成..");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("3.beanFactory:" + beanFactory);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("2.对象beanName:" + name);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("5.bean init方法执行..");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("4.获取到applicationContext对象");
	}
}
