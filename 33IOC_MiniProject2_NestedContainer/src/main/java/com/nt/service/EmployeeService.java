package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	public List<EmployeeDTO> fetchEmployeeByDesignation(String desig1,String desig2,String desig3)throws Exception;
}
