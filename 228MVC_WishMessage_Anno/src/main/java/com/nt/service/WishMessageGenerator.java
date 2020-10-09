package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageGenerator {
	public String generator() {
		LocalDateTime date=LocalDateTime.now();
		int hr=date.getHour();
		if(hr>18)
			return "Gud night siddharth";
		else {
			return "sorry u have to study at that time";
		}
	}
}
