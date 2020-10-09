package com.nt.service;

import java.util.List;

import com.nt.dto.UserDTO;

public interface TelecomManagementService {
	public List<Object[]> getDataByJoins();
	public List<Object[]> getDataByJoins1(String addrs);
}
