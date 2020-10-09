package com.nt.service;

import com.nt.dto.EmployeeDTO;

public interface EmployeeMgntService {
	public Integer registerEmployee(EmployeeDTO emp);
	
	public Iterable<EmployeeDTO> getAllEmployee();
}
