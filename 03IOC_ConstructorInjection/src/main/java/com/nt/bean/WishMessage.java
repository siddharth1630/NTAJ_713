package com.nt.bean;

import java.util.Date;

public class WishMessage {
	static {
		System.out.println("WishMessage.enclosing_method()");
	}
	private Date date;

	// Constructor injection .. it set the value..which is system date
	public WishMessage(Date date) {	// NOTE: argument name and constructor-arg name in xml must be same
		System.out.println("WishMessage.consturctor() "+date);
		this.date = date;
	}
	
	// here we can set the value of date which is user input date
	public void setDate(Date date) {	// NOTE: property name in xml and setter method name must be same
		System.out.println("WishMessage.setDate()"+date);
		this.date = date;
	}
	
	// bussiness logic
	public String wishMessageGenerator(String user) {
		System.out.println("WishMessage.wishMessageGenerator()");
		int hours=0;
		
		hours=date.getHours();
		
		if(hours<12) {
			return "Good Morning "+user;
		}
		else if(hours<16) {
			return "Good AfterNoon "+user;
		}
		else if(hours<20) {
			return "Good Evening "+user;
		}
		else{
			return "Good Night "+user;
		}
	}
	
}
