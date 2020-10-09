package com.nt.dao;

import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("edao")
public class EmployeeDAOImpl implements EmployeeDAO{
	
	public EmployeeDAOImpl() {
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl()");
	}

	@Override
	public int registerEmployee(EmployeeBO bo) throws Exception {
		System.out.println("Employee is register with "+bo);
		return 1;
	}

}
