package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.BankLoanMgmnt;

public class MethodReplacerTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankLoanMgmnt bm=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		bm=ctx.getBean("blm",BankLoanMgmnt.class);
		System.out.println(bm.calculateIntrestAmount(100000f, 2, 12));
		System.out.println(bm.getClass()+" "+bm.getClass().getSuperclass());
		
		((AbstractApplicationContext) ctx).close();
	}
}
