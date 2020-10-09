package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {
	public static void main(String[] args) {
		Flipkart fpkt=null;
		fpkt=FlipkartFactory.getInstance("dtdc");
		System.out.println(fpkt.shopping(new String[]{"rain coat","umbrella","flu tablets"},new float[] {5000,2000,500}));
	}
}
