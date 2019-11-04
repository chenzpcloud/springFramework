package com.czp.bean.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {


	public static void main(String[] args) {

		/*ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

		MyService bean = applicationContext.getBean(MyService.class);

		bean.doStuff();*/


		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.czp.bean.annotaion");
		ctx.refresh();
		MyService myService = ctx.getBean(MyService.class);
		myService.doStuff();
	}
}
