package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {	
	
	private Courier courier;	
	
	public Flipkart() {
		System.out.println(" 0Flipkart.Flipkart()");
	}

	public Flipkart(Courier courier) {
		System.out.println("Flipkart.Flipkart()");
		this.courier = courier;
	}

	//	/*
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
//	*/
	
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
