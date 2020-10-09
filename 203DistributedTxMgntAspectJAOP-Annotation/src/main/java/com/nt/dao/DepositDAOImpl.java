package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepositDAOImpl implements DepositDAO {
	private static final String DEPOSIT_QUERY="UPDATE BANKACCOUNT SET AMOUNT=AMOUNT + ? WHERE ACCNO = ?";
	@Autowired
	@Qualifier("mysqlJt")
	private JdbcTemplate jt;
	
	@Override
	public int Deposite(long accNo, float amnt) {
		int count=0;
		count=jt.update(DEPOSIT_QUERY,amnt,accNo);
		return count;
	}
}
