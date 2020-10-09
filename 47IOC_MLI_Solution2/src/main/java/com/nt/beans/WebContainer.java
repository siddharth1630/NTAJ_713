package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer implements ApplicationContextAware {
	private String beanId;
	ApplicationContext ctx=null;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	public WebContainer() {
		System.out.println("web container 0 param constructor");
	}
	
	public void processRequest(String data) {	
	
		RequestHandler rh=null;
		System.out.println("web container is processin req with data:: "+data+" by giving it to handleer");
		// get dependent object using dependancy loopkup
		rh=ctx.getBean(beanId,RequestHandler.class);
		rh.handleRequest(data);
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;	
	}
}
