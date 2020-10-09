package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDITest1 {
	
	public static void main(String[] args) {
		
	
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		A a=null;
		B b=null;
		
		// Create IOC container
		factory=new DefaultListableBeanFactory();
		// create reader object
		reader=new XmlBeanDefinitionReader(factory);
		
		// specify name and location of xml file
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		
		a=factory.getBean("a",A.class);
		System.out.println("updated-->"+a);
	
	
	}

}
