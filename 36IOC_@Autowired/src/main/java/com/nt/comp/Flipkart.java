package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {	
//	@Autowired//(required = false)
//	@Qualifier(value = "bdrt") 		// first way and best way to remove ambigous
//	@Qualifier(value="b1")	// 2nd way to use primary in xml file and value name is here
	private Courier courier;	
	
	/*@Autowired	// autowired in constructor
	private Flipkart(@Qualifier(value="bdrt") Courier courier) {
		this.courier = courier;
	}*/
	
	@Autowired		// autowired in arbitory method
	@Qualifier(value="dtdc")
	public void acces(Courier courier) {
		this.courier=courier;
	}
	
	public String shopping(String[] items,float[] prices) {
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		for(float p:prices) {
			billAmt+=p;
		}
		// generate order id dydnamically as random number
		oid=new Random().nextInt(10000);
		// use courier service  for delivering the products
		msg=courier.deliver(oid);
		// return bill amount and courier details to customer
		return Arrays.toString(items)+" are purchages having prices"+Arrays.toString(prices)+" with bill amount"+billAmt+" with "+msg;	
	}
}
