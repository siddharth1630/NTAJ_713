package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null,fpkt1=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
	//	fpkt=ctx.getBean("flipkart",Flipkart.class);
		fpkt=ctx.getBean(Flipkart.class);
		fpkt1=ctx.getBean(Flipkart.class);
		System.out.println(fpkt.hashCode()+" "+fpkt1.hashCode());
		System.out.println(fpkt.shopping(new String[]{"rain coat","umbrella","flu tablets"},new float[] {5000,2000,500}));
		
		((AbstractApplicationContext) ctx).close();
	}
}
