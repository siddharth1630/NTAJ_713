package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class DtxmgmntTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		// initialise
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		proxy=ctx.getBean("bankService",BankService.class);
		// call the method
		try {
			System.out.println(proxy.transferMoney(1001, 1006, 1500));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		((AbstractApplicationContext) ctx).close();
		

	}

}
