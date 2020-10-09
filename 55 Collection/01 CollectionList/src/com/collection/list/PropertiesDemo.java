package com.collection.list;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		Properties p=new Properties();
		p.load(new FileInputStream("emp.properties"));
		
		System.out.println("id: "+p.getProperty("id"));
		System.out.println("name: "+p.getProperty("name"));
		System.out.println("desig: "+p.getProperty("desig"));
		System.out.println("company: "+p.getProperty("company"));
		
		System.out.println("abc:"+p.getProperty("abc"));
		System.out.println("abc:"+p.getProperty("abcc","abc key is not found"));
		System.out.println();
		
		p.setProperty("exp","since 2018");
		Enumeration e=p.propertyNames();
		
		while(e.hasMoreElements()) {
			System.out.println(p.getProperty((String)e.nextElement()));
		}
		p.list(new PrintStream(new FileOutputStream("List Result.properties")));
		p.store(new PrintStream(new FileOutputStream("Store Result.properites")),"emp details");
		
		
	}
}
