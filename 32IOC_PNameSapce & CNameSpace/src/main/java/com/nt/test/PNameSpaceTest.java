package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;

public class PNameSpaceTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Employee e=null;
		// create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		e=ctx.getBean("emp",Employee.class);
		System.out.println(e);
		((AbstractApplicationContext) ctx).close();
	}
}
