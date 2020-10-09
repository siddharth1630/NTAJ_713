package com.nt.beans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class WishMessage {
	@Autowired
	private LocalTime time;
	
	public String getWishMsg() {
		int t=time.getHour();
		if(t<12) {
			return "Gud morng";
		}
		else {
			return "Good night";
		}
	}
}
