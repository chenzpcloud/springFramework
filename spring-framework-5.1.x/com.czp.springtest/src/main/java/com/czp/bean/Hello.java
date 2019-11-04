package com.czp.bean;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class Hello implements BeanPostProcessor  {

	private  String content;


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
