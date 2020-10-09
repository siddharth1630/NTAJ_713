package com.nt.test;

import java.util.Date;

public class Test1 {
	static {
		System.out.println("Test1.main()");
	}
	public static void main(String[] args) {
		Class c=null;
		Object obj=null;
		Object objDate=null;
		
		
		try {
			// load the class
			c=Class.forName(args[0]);
			// instantiate the class
			System.out.println("after loading the class");
			obj=c.newInstance();	// here object is created
			System.out.println(obj);
			System.out.println(c);
			System.out.println("============================================================");
			c=Class.forName(args[1]);
			objDate=c.newInstance();
			System.out.println(c);
			System.out.println(objDate);
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		catch(InstantiationException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
