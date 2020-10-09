package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankMgmntService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=null;
		BankMgmntService proxy=null;
		// create IOC container
		context=new AnnotationConfigApplicationContext(com.nt.cnfgs.ApplicationContext.class);
		// get bean
		proxy=context.getBean("bankService",BankMgmntService.class);
		// invoke method
		try {
			System.out.println(proxy.trasnferMoney(1003, 1002, 3000));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) context).close();
	}
}
