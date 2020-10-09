package com.nt.beans;

public class Bike {
	private String engNo;
	private String chaseNo;
	private String bikeName;
	private String bikeType;
	private int noOfGears;
	private String bikeVersion;
	private int topSpeed;
	private String ownerName;
	public void setEngNo(String engNo) {
		this.engNo = engNo;
	}
	public void setChaseNo(String chaseNo) {
		this.chaseNo = chaseNo;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}
	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}
	public void setBikeVersion(String bikeVersion) {
		this.bikeVersion = bikeVersion;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	@Override
	public String toString() {
		return "Bike [engNo=" + engNo + ", chaseNo=" + chaseNo + ", bikeName=" + bikeName + ", bikeType=" + bikeType
				+ ", noOfGears=" + noOfGears + ", bikeVersion=" + bikeVersion + ", topSpeed=" + topSpeed
				+ ", ownerName=" + ownerName + "]";
	}
	
	
	

}
