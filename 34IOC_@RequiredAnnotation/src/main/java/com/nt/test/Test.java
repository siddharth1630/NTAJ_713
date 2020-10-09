package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Customer;

public class Test {
	public static void main(String[] args) {
		ApplicationContext  ctx=null;
		Customer cust=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		cust=ctx.getBean("cust",Customer.class);
		System.out.println(cust);
	}
}
