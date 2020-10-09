package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO> getAllEmployee();
	public int insertEmployee(EmployeeBO bo);
	public List<Integer> getDeptnos();
}
