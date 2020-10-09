package com.nt.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle bundle=null;
		
		// prepare locale object having language and country
		locale=new Locale(args[0], args[1]);
		// create resource bundle object having loacle object
		bundle =ResourceBundle.getBundle("com/nt/commons/app",locale);
		// read and display bundle object
		System.out.println(bundle.getString("btn1.cap")+"  "+bundle.getString("btn2.cap")+"  "+
					bundle.getString("btn3.cap")+"  "+bundle.getString("btn4.cap"));
	}

}
