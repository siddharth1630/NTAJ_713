package com.nt.service;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public interface CollegeMngmnt {
	public String enrollStudent(StudentDTO dto) throws Exception;
	public String enrollEmpoyee(EmployeeDTO dto) throws Exception;

}
