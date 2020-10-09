package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessage;
import com.nt.printer.Printer;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("SetterInjectionTest.main()");
		
		Resource res=null;
		BeanFactory factory=null;
		Object obj,obj1=null;
		WishMessage generator=null,generator2=null;
		String result=null;
		Printer p1=null,p2=null;
		
		// hold name and location of spring bean cfg file
		res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		// create beanFactory ioc container
		factory=new XmlBeanFactory(res);
		
		// get target bean class
		obj=factory.getBean("wm");
		obj1=factory.getBean("wm");
		// typecasting
		generator=(WishMessage)obj;
		generator2=(WishMessage)obj1;
		
		// invoke the method
		result=generator.WishMessageGenerator("siddharth");
		System.out.println(result);
		System.out.println(generator2.WishMessageGenerator("gupta"));

		// invoke the singleton class if the scope is prototype then it create multiple object 
		// if the factory-method="getInstance" then it create a single object .
		p1=factory.getBean("print",Printer.class);
		System.out.println(p1);
		p2=factory.getBean("print",Printer.class);
		System.out.println(p2);
	}

}
