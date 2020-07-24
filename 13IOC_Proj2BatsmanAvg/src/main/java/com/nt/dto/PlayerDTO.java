package com.nt.dto;

import java.io.Serializable;

public class PlayerDTO implements Serializable{
	private String pName;
	private String team;
	private int runScored;
	private int timesOut;
	private int runsConceded;
	private int wicketTaken;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getRunScored() {
		return runScored;
	}
	public void setRunScored(int runScored) {
		this.runScored = runScored;
	}
	public int getTimesOut() {
		return timesOut;
	}
	public void setTimesOut(int timesOut) {
		this.timesOut = timesOut;
	}
	public int getRunsConceded() {
		return runsConceded;
	}
	public void setRunsConceded(int runsConceded) {
		this.runsConceded = runsConceded;
	}
	public int getWicketTaken() {
		return wicketTaken;
	}
	public void setWicketTaken(int wicketTaken) {
		this.wicketTaken = wicketTaken;
	}
	
	

}
