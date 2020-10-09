package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	public static Flipkart getInstance(String courierName) {
		Courier courier=null;
		Flipkart fpkt=null;
		// create dependend class object
		if(courierName.equalsIgnoreCase("dtdc")) {
			courier=new DTDC();
		}
		else if(courierName.equalsIgnoreCase("bludart")) {
			courier=new BlueDart();
		}
		else {
			throw new IllegalArgumentException("Invalid class");
		}
		// create Target class object
		fpkt=new Flipkart();
		// assign dependent class object to target class object
		fpkt.setCourier(courier); 
		
		return fpkt;
	}
}
