package com.nt.beans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("wm")		// if no bean name then it take default name which i take in case 3
@Component
//@Scope("prototype")	// if scope is singleton then it first create predifined 
						// class obj then userdefiend but in prototype its reverse 
public class WishMessage {
	
	static {
		System.out.println("WishMessage.enclosing_method()");
	}
	
	public WishMessage() {
		System.out.println("WishMessage.WishMessage()");
	}
	
	@Autowired
	private LocalTime time;
	
	public String generateWishMessage() {
		System.out.println("WishMessage.generateWishMessage()");
		int hr=0; 
		hr=time.getHour();
		if(hr<12) {
			return "gud morng";
		}
		else if(hr>12 && hr<181) {
			return "gud afternoon";
		}
		else {
			return "gud night";
		}
	}
}
