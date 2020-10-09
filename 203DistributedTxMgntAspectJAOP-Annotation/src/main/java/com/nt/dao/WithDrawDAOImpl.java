package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WithDrawDAOImpl implements WithDrawDAO {
	private static final String WITHDRAW_QUERY="UPDATE BANKACCOUNT SET AMOUNT=AMOUNT - ? WHERE ACCNO = ?";
	@Autowired
	@Qualifier("oraJt")
	private JdbcTemplate jt;
	@Override
	public int withdraw(long accno, float amnt) {
		int count=0;
		count=jt.update(WITHDRAW_QUERY,amnt,accno);
		return count;
	}

}
