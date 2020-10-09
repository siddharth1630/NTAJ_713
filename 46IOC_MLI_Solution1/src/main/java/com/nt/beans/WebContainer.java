package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
	private String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public WebContainer() {
		System.out.println("web container 0 param constructor");
	}
	
	public void processRequest(String data) {	// by creating container here it willl instantiate both
		ApplicationContext ctx=null;		// the bean class twice to overcome this problem we use lazy init
		RequestHandler rh=null;
		System.out.println("web container is processin req with data:: "+data+" by giving it to handleer");
		// create extra ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		// get dependent object using dependancy loopkup
		rh=ctx.getBean(beanId,RequestHandler.class);
		rh.handleRequest(data);
	}
}
