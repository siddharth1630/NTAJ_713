package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Vehicle {
	private String beanId;	// CASE 2	// here value is coming only not the object
	
	public Vehicle(String beanId) {		// CASE 2
		this.beanId=beanId;
		System.out.println("Vehicle.Vehicle() constructor"); 
	}
	
	public void soundBox() {
		System.out.println("soundbox");
	}
	public void fillFuel() {
		System.out.println("filling the fuel at every 50km");
	}
	public void horn() {
		System.out.println("changing to the skoda horn");
	}
	public void engine(String source,String dest) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Engine eng=null;
		// create extra IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		// get engine bean
	//	eng=factory.getBean("engg",Engine.class);
		eng=factory.getBean(beanId,Engine.class);	// now if we change the bean name in xml we don't have to touch
		eng.start();							// the java code 
		eng.stop();
		
	}

}
