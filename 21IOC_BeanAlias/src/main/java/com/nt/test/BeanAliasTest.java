package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessage;

public class BeanAliasTest {

	public static void main(String[] args) {
		System.out.println("SetterInjectionTest.main()");
		
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null,obj1=null,obj2=null,obj3=null,obj4=null;
		WishMessage generator=null,generator1=null,generator2=null,generator3=null,generator4=null;
		String result=null;
		
		// hold name and location of spring bean cfg file
		res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		// create beanFactory ioc container
		factory=new XmlBeanFactory(res);
		
		// get target bean class
		obj=factory.getBean("wm");
		obj1=factory.getBean("wma");
		obj2=factory.getBean("wmb");
		obj3=factory.getBean("wm1");
		obj4=factory.getBean("wishMessage");
		
		// typecasting
		generator=(WishMessage)obj;
		generator1=(WishMessage)obj1;
		generator2=(WishMessage)obj2;
		generator3=(WishMessage)obj3;
		generator4=(WishMessage)obj4;
		
		// invoke the method
		result=generator.WishMessageGenerator("siddharth");
		System.out.println(result);
		result=generator1.WishMessageGenerator("gupta");
		System.out.println(result);
		result=generator2.WishMessageGenerator("cikash");
		System.out.println(result);
		result=generator3.WishMessageGenerator("mishra");
		System.out.println(result);
		result=generator4.WishMessageGenerator("ankit");
		System.out.println(result);
		

	}

}
