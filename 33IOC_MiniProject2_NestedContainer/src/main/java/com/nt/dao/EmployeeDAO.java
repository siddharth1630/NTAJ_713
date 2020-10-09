package com.nt.dao;

import java.util.List;

import com.nt.entity.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO> getEmpByDesig(String desig1,String desig2,String desig3)throws Exception;
}
