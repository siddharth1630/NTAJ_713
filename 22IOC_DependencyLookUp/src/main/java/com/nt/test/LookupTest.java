package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Engine;
import com.nt.beans.Vehicle;

public class LookupTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Vehicle veh=null;
		// create extra IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cnfgs/applicationContext.xml");
		// get engine bean
		veh=factory.getBean("vehicle",Vehicle.class);
		veh.fillFuel();
		veh.engine("deoghar", "kolkata");
		veh.horn();
		veh.soundBox();
		

	}

}
