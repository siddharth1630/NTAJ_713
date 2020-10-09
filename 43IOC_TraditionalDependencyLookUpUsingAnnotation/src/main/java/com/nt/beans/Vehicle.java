package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component("vehicle")
@Lazy // if we don't write lazy then both the object is instatiation at load time but by writeing this when we call the  object then it is creating a object
public class Vehicle {
	@Value("${lookup.eng}")
	private String beanId;			// first nd 2nd way
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
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
	/*public void engine(String source,String dest) {		// first way
		ApplicationContext ctx=null;
		Engine eng=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		// get engine bean
		eng=ctx.getBean(beanId,Engine.class);	
		eng.start();							 
		eng.stop();
		
		((AbstractApplicationContext) ctx).close();
		
	}*/
	
		public void engine(String source,String dest,ApplicationContext ctx) {		// 2nd way
			Engine eng=null;							// by getting the application context at parameter we can't insatiate multiple time
			// get engine bean					
			eng=ctx.getBean(beanId,Engine.class);	
			eng.start();							 
			eng.stop();
			
			((AbstractApplicationContext) ctx).close();
			
		}
	
	/*	public void engine(String source,String dest,ApplicationContext ctx,String beanId) {		// 3rd way
			Engine eng=null;							// by getting the application context at parameter it is bad practice
			// get engine bean					
			eng=ctx.getBean(beanId,Engine.class);	
			eng.start();							 
			eng.stop();
			
			((AbstractApplicationContext) ctx).close();
			
		}*/

}
