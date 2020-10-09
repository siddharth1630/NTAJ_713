package com.nt.test;

import java.lang.reflect.Constructor;

public class Test2 {
	
	public static void main(String[] args) {
		Class c=null;
		Object obj1=null,obj2=null;
		Constructor[] constructor=null;
		
		
		try {
			// load the class
			c=Class.forName(args[0]);
			//get All constructor of the laoded class
			constructor=c.getDeclaredConstructors();
			System.out.println("after class loading getting constructor");
			//create the object
			obj1=constructor[1].newInstance();
			obj2=constructor[0].newInstance(10,20);
			System.out.println(obj1);
			System.out.println(obj2);
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
