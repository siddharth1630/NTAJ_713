package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Class c=null;
		Calendar cal=null;
		Properties prop=null;
		String s=null;
		String sb=null;
		// initialise
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		// create IOC container
		c=factory.getBean("cl",Class.class);
		System.out.println(c.getClass().getName()+" its data "+c.toString());
		System.out.println("==========================================");
		cal=factory.getBean("calendar",Calendar.class);
		System.out.println(cal.getClass().getName()+" its data "+cal.toString());
		System.out.println("==========================================");
		prop=factory.getBean("sys",Properties.class);
		System.out.println(prop.getClass().getName()+" its data "+prop.toString());
		System.out.println("==========================================");
	
		s=factory.getBean("s2",String.class);
		System.out.println(s.getClass().getName()+" its data "+s.toString());
		System.out.println("==========================================");
		sb=factory.getBean("sb1",String.class);
		System.out.println(sb.getClass().getName()+" its data "+sb.toString());

	}

}
