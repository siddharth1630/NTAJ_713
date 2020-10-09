package com.nt.service;

public interface BankMgmntService {
	public String trasnferMoney(long srcAccNo,long destAccNo,float amount) throws IllegalAccessException;
}
