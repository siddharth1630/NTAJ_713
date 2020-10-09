package com.nt.dao;

public interface BankDAO {
	
	public int withdraw(long accNo,float amount);
	public int deposit(long accNo,float amount);

}
