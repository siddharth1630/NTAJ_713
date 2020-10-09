package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.beans.TestBean;

public class PrivateModifierUsingCoreJava {
	public static void main(String[] args) {
		Class c=null;
		Constructor cons[]=null;
		TestBean test=null;
		try {
			c=Class.forName("com.nt.beans.TestBean");
			cons=c.getDeclaredConstructors();
			cons[0].setAccessible(true);// by using this we can create a object of private constructo
			test=(TestBean) cons[0].newInstance(104,204);
			System.out.println(test);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
