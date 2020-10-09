package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Project implements Serializable {
	@Id
	@Type(type = "int")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pID;
	
	@Column(length = 20,unique = true,nullable = false)
	@Type(type = "string")
	private String pName;
	
	@Type(type = "int")
	private Integer teamSize;
	
	@Column(length = 20)
	@Type(type = "string")
	private String companyName;
	
	@Column(length = 20)
	@Type(type = "string")
	private String location;
	
	@Type(type = "double")
	private Double cost;

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
