package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {
	public static void main(String[] args) {
		Flipkart fpkt=null;
		try {
			// get target class object using factory
			fpkt=FlipkartFactory.getInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("problem in dependency management");
		}
		System.out.println(fpkt.shopping(new String[]{"rain coat","umbrella","flu tablets"},new float[] {5000,2000,500}));
	}
}
