package com.czp.bean;

import com.google.common.collect.Sets;
import com.sun.deploy.util.StringUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import java.util.Set;

public class BeanTest {

	public static void main(String[] args) throws  Exception {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");


		OurBeanTest ourBeanTest=(OurBeanTest)applicationContext.getBean("ourbeanTest");
		//OurBeanTest bean = applicationContext.getBean(OurBeanTest.class);
		//	Assert.notNull(null, "'name' must not be null");
		ourBeanTest.sayHello();
		//bean.sayHello();

		/*System.out.println("helloFactory -> " + applicationContext.getBean("helloFactoryBean"));
		System.out.println("&helloFactory -> " + applicationContext.getBean("&helloFactoryBean"));*/


		/*NewProvider newsProvider = (NewProvider) applicationContext.getBean("newProvider");
		System.out.println(newsProvider.getNews());
		System.out.println(newsProvider.getNews());*/

	}





}
