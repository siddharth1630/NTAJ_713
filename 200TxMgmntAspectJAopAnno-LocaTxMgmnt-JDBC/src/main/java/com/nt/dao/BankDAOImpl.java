package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BankDAOImpl implements BankDAO {
	private static final String WITHDRAW_QUERY="UPDATE BANKACCOUNT SET AMOUNT=AMOUNT-? WHERE ACCNO=?";
	private static final String DEPOSITE_QUERY="UPDATE BANKACCOUNT SET AMOUNT=AMOUNT+? WHERE ACCNO=?";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int withdraw(long accNo, float amount) {
		int count=0;
		count=jt.update(WITHDRAW_QUERY,amount,accNo);
		return count;
	}

	@Override
	public int deposit(long accNo, float amount) {
		int count=0;
		count=jt.update(DEPOSITE_QUERY,amount,accNo);
		return count;
	}

}
