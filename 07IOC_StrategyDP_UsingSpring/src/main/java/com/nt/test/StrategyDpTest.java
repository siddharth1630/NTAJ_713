package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comp.Flipkart;

public class StrategyDpTest {

	public static void main(String[] args) {
		BeanFactory beanFactory=null;
		Flipkart fpkt=null;
		Resource res=null;
		// load the file
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		// create IOC container
		beanFactory=new XmlBeanFactory(res);
		// get target bean object
		fpkt=beanFactory.getBean("fpkt",Flipkart.class);
		// invoking method
		System.out.println(fpkt.shopping(new String[] {"PPE kit","mask","senitizer"},new float[] {3000,200,500}));
		
	}

}
