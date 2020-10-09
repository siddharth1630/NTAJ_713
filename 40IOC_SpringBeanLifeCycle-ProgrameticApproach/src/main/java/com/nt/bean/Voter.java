package com.nt.bean;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class Voter implements InitializingBean,DisposableBean{
	private String name;
	private int age;
	private Date date;
	
	public Voter() {
		System.out.println("Voter.Voter()");
	}
	
	
	
	public void validVoter() {
		if(age>18) {
			System.out.println(name+" you are elegible for vote");
		}
		else {
			System.out.println(name+" sorry your are not eleiglbe for vote");
		}
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("Voter.myDestroy()");
		name=null;
		age=0;
		date=null;
		
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Voter.myInit()");
		boolean flag=false;
		date=new Date();	// initializing left over property
		if(age<0) {
			age=age*-1;
		}
		if(name==null) {
			System.out.println("Enter your name");
			flag=true;
		}
		if(age>100) {
			System.out.println("age is too much");
			flag=true;
		}
		if(flag==true) {
			throw new IllegalArgumentException("Invalid input");
		}
		
	}
}
