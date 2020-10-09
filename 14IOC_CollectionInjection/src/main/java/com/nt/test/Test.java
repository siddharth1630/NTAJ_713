package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.CollegeCollection;
import com.nt.beans.ContactsSet;
import com.nt.beans.MarksArray;
import com.nt.beans.UniversityMap;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MarksArray marks=null;
		CollegeCollection college=null;
		ContactsSet contact=null;
		UniversityMap univ=null;
		
		// create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		
		//get a array bean 
		marks=factory.getBean("ma",MarksArray.class);
		System.out.println(marks);
		System.out.println("=============================================");
		
		// get a list bean
		college =factory.getBean("cc",CollegeCollection.class);
		System.out.println(college);
		System.out.println("=============================================");

		// get a set bean
		contact =factory.getBean("cInfo",ContactsSet.class);
		System.out.println(contact);
		System.out.println("=============================================");

		// get a set bean
		univ =factory.getBean("uInfo",UniversityMap.class);
		System.out.println(univ);
		System.out.println("=============================================");

	}

}
