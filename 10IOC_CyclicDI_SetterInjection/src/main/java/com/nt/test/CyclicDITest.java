package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		A a=null;
		
		// Create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cnfgs/applicationContext.xml"));
		
		// get bean 
		a=factory.getBean("a",A.class);
		System.out.println(a);
		
	}

}
