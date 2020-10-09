package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle implements ApplicationContextAware{
	@Value("${lookup.eng}")
	private String beanId;	
	private ApplicationContext ctx;
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle() 0 param ");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		System.out.println("Vehicle.setApplicationContext()");
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
		Engine eng=null;
		// get engine bean
		eng=ctx.getBean(beanId,Engine.class);	
		eng.start();							 
		eng.stop();		
		((AbstractApplicationContext) ctx).close();	
	}
}
