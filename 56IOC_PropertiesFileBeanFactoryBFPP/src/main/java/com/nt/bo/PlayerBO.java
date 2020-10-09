package com.nt.bo;

public class PlayerBO {
	private String pName;
	private String team;
	private float battingAvg;
	private float bowlingAvg;
	
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
	public float getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(float battingAvg) {
		this.battingAvg = battingAvg;
	}
	public float getBowlingAvg() {
		return bowlingAvg;
	}
	public void setBowlingAvg(float bowlingAvg) {
		this.bowlingAvg = bowlingAvg;
	}

}
