package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDITest {

	// NOTE: IF BOTH ARE CONSTRUCTOR INJECTION IN CYCLIC THEN IT IS NOT POSSIBLE CASE 1
	// so in case 2 we can take 1 setter injection in class A
	public static void main(String[] args) {
		BeanFactory factory=null;
		A a=null;
		B b=null; // CASE 3 constructor to setter injection
		
		// Create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cnfgs/applicationContext.xml"));
		
		// get bean 
	//	a=factory.getBean("a",A.class);  // for case 2 it is applicable i.e setter to constructor injection
		b=factory.getBean("b",B.class);	// for case 3 constructor to setter injection so comment above line and error comes this is not possible
		System.out.println(b);	
		
		// NOTE :: IF WE REMOVE A SEETER INJECTION AND CALL B CONSTRUCTOR INJECTION IT IS RUNNING NOT BECZ OF 
		//  		CREATING NEW OBJECT RUNNIG BECZ OF CACHE MEMORY WHICH IS CREATED WHILE RUNNING A SETTER INJECTION
		
	}

}
