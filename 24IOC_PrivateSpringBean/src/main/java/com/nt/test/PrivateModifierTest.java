package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.TestBean;

public class PrivateModifierTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		TestBean bean=null;
		Object obj=null;
		// create ioc container
		factory=new DefaultListableBeanFactory();
		reader=new  XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		// invoke method
		bean=factory.getBean("test",TestBean.class);
		System.out.println(bean);
		// invoke inner privaet class
		obj=factory.getBean("inner",Object.class);
		System.out.println(obj);
				
	}

}
