package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.expression.spel.ast.Projection;

import com.nt.beans.PersonInfo;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PersonInfo personRaja=null,personRavi=null;
		
		//initate object
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		// load the config. file
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		// call the bean
		personRaja=factory.getBean("cInfo",PersonInfo.class);
		System.out.println(personRaja);
		System.out.println("=================================================");
		personRavi=factory.getBean("cInfo2",PersonInfo.class);
		System.out.println(personRavi);
	}
}
