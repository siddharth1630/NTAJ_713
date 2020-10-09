package com.nt.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class LookupTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cnfgs/applicationContext.xml");
		Vehicle veh=null;
		// create extra IOC container
		// get engine bean
		veh=ctx.getBean(Vehicle.class);
		veh.fillFuel();
		veh.engine("deoghar", "kolkata");
		veh.horn();
		veh.soundBox();
		
		((AbstractApplicationContext) ctx).close();
		

	}

}
