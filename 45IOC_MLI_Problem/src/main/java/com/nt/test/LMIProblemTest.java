package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class LMIProblemTest {
// in this application problem is that if the dependent class scope is prototype but the object is create only
	// one time to OVERCOME this problem we take 1 extra container in the dependdnet calling method
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WebContainer wc=null;
		// create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		// get target bean class
		wc=ctx.getBean("container",WebContainer.class);
		// invoke method
		wc.processRequest("helllo");
		System.out.println("=========================");
		wc.processRequest("hai");
		System.out.println("=========================");
		wc.processRequest("123");
		System.out.println("=========================");
		

	}

}
