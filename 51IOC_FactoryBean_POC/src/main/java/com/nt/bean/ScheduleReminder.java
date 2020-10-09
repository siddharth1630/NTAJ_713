package com.nt.bean;

import java.time.LocalDate;

public class ScheduleReminder {
	private LocalDate date;

	public ScheduleReminder(LocalDate date) {
		this.date = date;
	}
	
	public String knowReminder() {
		LocalDate sysDate=null;
		sysDate=LocalDate.now();

		return sysDate.isEqual(date)?"today u have a board meeting":"no meeting enjoy your day";
	}
	
	
}
