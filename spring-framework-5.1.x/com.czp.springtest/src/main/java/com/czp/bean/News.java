package com.czp.bean;

import org.springframework.beans.factory.BeanNameAware;

public class News  implements BeanNameAware {


	@Override
	public void setBeanName(String name) {
		System.out.println("回调setBeanName方法  id属性是"+name);
	}
}
