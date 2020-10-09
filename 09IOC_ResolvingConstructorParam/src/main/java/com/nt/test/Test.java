package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.comp.Employee;
import com.nt.comp.Marks;
import com.nt.comp.Student;

public class Test {
	
	public static void main(String[] args) {
		BeanFactory factory=null;
		Marks stud=null;
		Employee emp=null;
		Student student=null;
		// create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cnfgs/applicationContext.xml"));
		// get spring bean class object
		stud=factory.getBean("mark",Marks.class);
		
		// print the value
		System.out.println(stud);
		
		emp=factory.getBean("emp",Employee.class);
		System.out.println(emp);
		
		student=factory.getBean("student",Student.class);
		System.out.println(student);
		
	}

}
