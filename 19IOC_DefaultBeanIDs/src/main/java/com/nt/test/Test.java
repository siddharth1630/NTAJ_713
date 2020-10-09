package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.CollegeCollection;


public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		CollegeCollection college=null;
		
		// create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		
	
		// get a list bean
		college =factory.getBean("com.nt.beans.CollegeCollection",CollegeCollection.class);
		System.out.println(college);
		System.out.println("=============================================");
		college =factory.getBean("com.nt.beans.CollegeCollection#0",CollegeCollection.class);
		System.out.println(college);
		System.out.println("=============================================");
		college =factory.getBean("com.nt.beans.CollegeCollection#1",CollegeCollection.class);
		System.out.println(college);
		System.out.println("=============================================");
		college =factory.getBean("com.nt.beans.CollegeCollection#2",CollegeCollection.class);
		System.out.println(college);
		System.out.println("=============================================");
		college =factory.getBean("com.nt.beans.CollegeCollection#3",CollegeCollection.class);
		System.out.println(college);
		System.out.println("=============================================");

	}

}
