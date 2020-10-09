package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class WebContainer  {
	public WebContainer() {
		System.out.println("web container 0 param constructor"+this.getClass()+" "+this.getClass().getSuperclass());
	}
	public abstract RequestHandler createRequestHandler(); 
	
	public void processRequest(String data) {	
	
		RequestHandler rh=null;
		System.out.println("web container is processin req with data:: "+data+" by giving it to handleer");
		// get dependent object using dependancy loopkup
		rh=createRequestHandler();
		// use dependent object
		rh.handleRequest(data);
	}
}
