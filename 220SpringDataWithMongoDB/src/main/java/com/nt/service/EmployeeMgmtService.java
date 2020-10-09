package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface EmployeeMgmtService {
	public String registerEmployee(Employee doc);
	public List<Employee> findAllEmployee();
	public Employee findEmpById(int id);
	public String updateEmployeeSalary(int id,float bonus);
	public String removeEmployee(int id); 
}
