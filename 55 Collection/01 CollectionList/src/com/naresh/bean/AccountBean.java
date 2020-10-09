package com.naresh.bean;

public class AccountBean {
	private long accNum;
	private String name;
	private double balance;
	private String accType;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AccountBean) {
			AccountBean bean=(AccountBean)obj;
			System.out.println("hi");
			return (this.accNum==bean.accNum) && (this.accType==bean.accType);
		}
		else
			return false;
	}
}
