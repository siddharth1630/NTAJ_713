package com.nt.comp;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public final class Flipkart {
	@Resource
//	@Qualifier("dtdc")
	@Qualifier("blueDart")
	private Courier courier;
	
	@Autowired		// autowire is not work if we use predfined class
	private Date date;
	
	public String shopping(String[] items,float[] prices) {
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		for(float p:prices) {
			billAmt+=p;
		}
		System.out.println("DATE --> "+date);
		// generate order id dydnamically as random number
		oid=new Random().nextInt(10000);
		// use courier service  for delivering the products
		msg=courier.deliver(oid);
		// return bill amount and courier details to customer
		return Arrays.toString(items)+" are purchages having prices"+Arrays.toString(prices)+" with bill amount"+billAmt+" with "+msg;	
	}
}
