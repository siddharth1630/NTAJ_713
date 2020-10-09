package com.nt.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBO;

@Repository("userDao")
public class LoginDAOImpl implements LoginDAO{
	@Autowired
	private SimpleJdbcCall sjc;

	@Override
	public String authenticate(UserBO bo) {
		// set procedure name
		sjc.setProcedureName("P_AUTHENTICATION");
		// prepare map object having in param
		Map<String,Object> inParam=Map.of("username",bo.getUsername(),"pass",bo.getPass());
		// get procedure return value
		Map<String,Object> outParam=sjc.execute(inParam);
		// get result from out param
		return (String) outParam.get("RESULT");
	}

}
