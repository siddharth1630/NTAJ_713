package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.nt.bean.Voter;


public class BeanLifeCycleTest {
	public static void main(String[] args) {
		ApplicationContext context=null;
		Voter voter=null;
		context=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		voter=context.getBean(Voter.class);
		System.out.println(voter);
		voter.validVoter();
		
		// if we are not closing the container then it is not call the destroy method
		((AbstractApplicationContext) context).close();
	}
}
