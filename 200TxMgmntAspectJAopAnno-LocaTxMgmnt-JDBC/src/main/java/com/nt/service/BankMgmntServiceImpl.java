package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.BankDAO;

@Service("bankService")	// here bean id is bankService
public class BankMgmntServiceImpl implements BankMgmntService {
	@Autowired
	private BankDAO dao;
	
	@Override	
	// the @transactional will rollback the transaction only if it is uncheced exception but if checked exception
	// is happend it will not roll back for this we can add checked exception in service class name as CASE 2
//	@Transactional(propagation = Propagation.REQUIRED,timeout = 5) // here if trans. is not done in 5 sec it is rollback
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = IllegalAccessException.class)// CASE 2 now .. 
									// it is rollback for the particular Checked Exception
	public String trasnferMoney(long srcAccNo, long destAccNo, float amount) throws IllegalAccessException {
		int count=0,count1=0;
		count=dao.withdraw(srcAccNo, amount);
		
		// we use try catch to prooof the concept of timeout
/*		try {
			Thread.sleep(7000);	// we can pause the transaction for 7 sec then timeout happens then trx. rollback
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	*/	
		count1=dao.deposit(destAccNo, amount);
		if(count==0 || count1==0) {
		//	throw new RuntimeException("problem in money transfer");
			throw new IllegalAccessException("problem in money transfer");	//CASE 2
		}
		else {
			return "amount is transfered from "+srcAccNo+ " to "+ destAccNo +" and the amoutn is "+amount;
		}
	}

}
