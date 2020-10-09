package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.expression.spel.ast.Projection;

import com.nt.beans.Bike;


public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
	//	Bike first=null,second=null;		// CASE 1
	//	Bike third=null,fourth=null;		// CASE 2
		Bike fifth=null,sixth=null,baseBike=null;		// CASE 3
		
		
		//initate object
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		// load the config. file
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		// call the bean		
		// CASE 1: 
//		first=factory.getBean("first",Bike.class);		
//		System.out.println(first);
//		second=factory.getBean("second",Bike.class);
//		System.out.println(second);
		
		// CASE 2 
//		third=factory.getBean("third",Bike.class);		
//		System.out.println(third);
//		fourth=factory.getBean("fourth",Bike.class);
//		System.out.println(fourth);
		
		fifth=factory.getBean("fifth",Bike.class);		
		System.out.println(fifth);
		sixth=factory.getBean("sixth",Bike.class);
		System.out.println(sixth);
		// below line get error becz we cannot create get the object of abstract bean
		baseBike=factory.getBean("baseBike",Bike.class);
	}
}
