package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.BankDAO;

@Service("bankService")	
public class BankMgmntServiceImpl implements BankMgmntService {
	@Autowired
	private BankDAO dao;
	
	@Override	
	@Transactional 
	public String trasnferMoney(long srcAccNo, long destAccNo, float amount) throws IllegalAccessException {
		int count=0,count1=0;
		count=dao.withdraw(srcAccNo, amount);
	
		count1=dao.deposit(destAccNo, amount);
		if(count==0 || count1==0) {
			throw new RuntimeException("problem in money transfer");
		}
		else {
			return "amount is transfered from "+srcAccNo+ " to "+ destAccNo +" and the amoutn is "+amount;
		}
	}

}
