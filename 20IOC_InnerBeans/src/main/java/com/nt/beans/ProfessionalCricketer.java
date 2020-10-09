package com.nt.beans;

public class ProfessionalCricketer {
	
	private CricketBat bat;
	private String name;

	public ProfessionalCricketer(String name,CricketBat bat) {
		System.out.println("ProfessionalCricketer.ProfessionalCricketer()");
		this.bat = bat;
		this.name=name;
	}
	
	public String batting() {
		int runs=0;
		runs=bat.scoreRuns();
		return "Batsman "+name+" Scored "+runs+ " runs";
	}

}
