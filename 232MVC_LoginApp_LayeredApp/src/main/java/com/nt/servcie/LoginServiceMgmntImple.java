package com.nt.servcie;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.UserBO;
import com.nt.dao.LoginDAO;
import com.nt.dto.UserDTO;

@Service
public class LoginServiceMgmntImple implements LoginServiceMgmnt{
	@Autowired
	private LoginDAO dao;
	
	@Override
	@Transactional	// we use this becz we want only it check for the commited data
	public String authentication(UserDTO dto) {
		UserBO bo=null;
		String result=null;
		// copy prop from dto to bo
		bo=new UserBO();
		BeanUtils.copyProperties(dto, bo);
		result=dao.authenticate(bo);
		return result;
	}

}
