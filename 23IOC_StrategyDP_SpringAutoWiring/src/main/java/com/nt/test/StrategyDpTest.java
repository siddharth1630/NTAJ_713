package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Flipkart;

public class StrategyDpTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		Flipkart fpkt=null;
		XmlBeanDefinitionReader reader=null;
		// initialise
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get target bean object
		fpkt=factory.getBean("fpkt",Flipkart.class);
		// invoking method
		System.out.println(fpkt.shopping(new String[] {"PPE kit","mask","senitizer"},new float[] {3000,200,500}));
		
	}

}
