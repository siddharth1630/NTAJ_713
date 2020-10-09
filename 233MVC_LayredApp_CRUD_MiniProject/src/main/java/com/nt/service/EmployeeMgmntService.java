package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface  EmployeeMgmntService{
	public List<EmployeeDTO> FetchAllEmployees();
	public String registerEmployee(EmployeeDTO dto);
	public List<Integer> fetchAllDeptnos();
}
