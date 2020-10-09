package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.LoanAmntIntrestCalculator;

public class CustomPropertyTestAC {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		LoanAmntIntrestCalculator calc=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		System.out.println(" before CustomPropertyTestAC.main()");
		calc=ctx.getBean("calc",LoanAmntIntrestCalculator.class);
		System.out.println(" after CustomPropertyTestAC.main()");
		
		// invoke method
		System.out.println(calc.intrest());
		((AbstractApplicationContext) ctx).close();
	}
}
