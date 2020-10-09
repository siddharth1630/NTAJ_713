package com.nt.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.PhoneNumberDTO;
import com.nt.dto.UserDTO;
import com.nt.entity.PhoneNumber;
import com.nt.entity.User;
import com.nt.repo.PhoneNumberRepo;
import com.nt.repo.UserRepo;

@Service("teleService")
public class TelecomManagementServiceImple implements TelecomManagementService {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private PhoneNumberRepo phoneNumberRepo;
	@Override
	public List<Object[]> getDataByJoins() {
		// use repo
		return userRepo.fetchDataByJoins();
	}
	public List<Object[]> getDataByJoins1(String addrs) {
		// use repo
		return userRepo.fetchDataByJoins1(addrs);
	}
	
}
