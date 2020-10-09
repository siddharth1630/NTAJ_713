package com.nt.bean;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("voter")
public class Voter {
	@Value("jai")
	private String name;
	@Value("-18")
	private int age;
	private Date date;
	
	public Voter() {
		System.out.println("Voter.Voter()");
	}
	
	@PostConstruct
	public void myInit() {
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
	@PreDestroy
	public void myDestroy() {
		System.out.println("Voter.myDestroy()");
		name=null;
		age=0;
		date=null;
	}
	
	
	public void validVoter() {
		if(age>18) {
			System.out.println(name+" you are elegible for vote");
		}
		else {
			System.out.println(name+" sorry your are not eleiglbe for vote");
		}
	}
}
