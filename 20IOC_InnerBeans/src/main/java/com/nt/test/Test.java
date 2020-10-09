package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.ProfessionalCricketer;


public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		ProfessionalCricketer cric=null;
		
		// create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		
	
		// get a list bean
		cric=factory.getBean("kohli",ProfessionalCricketer.class);
		System.out.println(cric.batting());
		System.out.println("===========================================");
		cric=factory.getBean("dhoni",ProfessionalCricketer.class);
		System.out.println(cric.batting());
		System.out.println("===========================================");
		cric=factory.getBean("kohli",ProfessionalCricketer.class);
		System.out.println(cric.batting());
		System.out.println("===========================================");

	}

}
