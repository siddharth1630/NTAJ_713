package com.nt.beans;

import java.util.Date;

public class WishMessage {
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String WishMessageGenerator(String user) {
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
