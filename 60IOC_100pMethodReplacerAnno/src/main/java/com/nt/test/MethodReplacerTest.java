package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.AppConfig;
import com.nt.target.BankLoanMgmnt;

public class MethodReplacerTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankLoanMgmnt bm=null;
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		bm=ctx.getBean(BankLoanMgmnt.class);
		System.out.println(bm.calculateIntrestAmount(100000f, 2, 12));
		System.out.println(bm.getClass()+" "+bm.getClass().getSuperclass());
		
		((AbstractApplicationContext) ctx).close();
	}
}
