package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessage;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("SetterInjectionTest.main()");
		
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessage generator=null;
		String result=null;
		
		// hold name and location of spring bean cfg file
		res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		// create beanFactory ioc container
		factory=new XmlBeanFactory(res);
		
		// get target bean class
		obj=factory.getBean("wm");
		// typecasting
		generator=(WishMessage)obj;
		
		// invoke the method
		result=generator.WishMessageGenerator("siddharth");
		System.out.println(result);

	}

}
