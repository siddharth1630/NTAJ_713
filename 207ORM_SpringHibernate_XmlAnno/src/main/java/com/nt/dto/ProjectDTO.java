package com.nt.dto;

import java.io.Serializable;

public class ProjectDTO implements Serializable{
	
	private Integer pID;
	
	private String pName;
	private Integer teamSize;
	private String companyName;
	private String location;
	private double cost;

	public Integer getpID() {
		return pID;
	}

	public void setpID(Integer pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Project [pID=" + pID + ", pName=" + pName + ", teamSize=" + teamSize + ", companyName=" + companyName
				+ ", location=" + location + ", cost=" + cost + "]";
	}

}
