package com.czp.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class NewProvider  implements ApplicationContextAware {

	private  News news;

	private ApplicationContext applicationContext;

	public News getNews() {
		return applicationContext.getBean("news",News.class);
	}

	public void setNews(News news) {
		this.news = news;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
			this.applicationContext=applicationContext;
	}
}
