package com.nt.dao;

import com.nt.bo.UserBO;

public interface LoginDAO {
	public String authenticate(UserBO bo);
}
