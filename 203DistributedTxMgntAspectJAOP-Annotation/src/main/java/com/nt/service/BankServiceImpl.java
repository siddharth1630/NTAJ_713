package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.DepositDAO;
import com.nt.dao.WithDrawDAO;

@Service("bankService")
public class BankServiceImpl implements BankService{

	@Autowired
	private DepositDAO dDao;
	@Autowired
	private WithDrawDAO wDao;
	
	@Override
	@Transactional(transactionManager = "jtaTxMngmr")
	public String transferMoney(long srcAccno, long destAccno, float amount) {
		int count1=0,count2=0;
		count1=wDao.withdraw(srcAccno, amount);
		count2=dDao.Deposite(destAccno, amount);
		if(count1==0 || count2==0) {
			throw new IllegalArgumentException("PROBLEM in money transfer");
		}
		return amount+" is trasfer from "+srcAccno+" to "+destAccno;
		
		
	}

}
