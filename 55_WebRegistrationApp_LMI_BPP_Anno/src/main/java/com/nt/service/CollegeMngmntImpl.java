package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dao.StudentDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

@Service("service")
public abstract class CollegeMngmntImpl implements CollegeMngmnt{
	@Autowired
	private StudentDAO stdao;
	@Autowired
	private EmployeeDAO empdao;
	
	public CollegeMngmntImpl() {
		System.out.println("CollegeMngmntImpl.CollegeMngmntImpl()"+this.getClass());
	}
	
	@Lookup
	public abstract StudentBO fetchStudent();
	@Lookup
	public abstract EmployeeBO fetchEmployee();

	@Override
	public String enrollStudent(StudentDTO dto) throws Exception {
		int total=0;
		float avg=0.0f;
		StudentBO bo=null;
		int result=0;
		
		// write b logic
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=(dto.getM1()+dto.getM2()+dto.getM3())/3;
		// get student bo class object
		bo=fetchStudent();
		// storing dto object to bo
		BeanUtils.copyProperties(dto, bo);
		bo.setAvg(avg);
		bo.setTotal(total);
		// use dao
		result=stdao.registerStudent(bo);
		
		return result==0?"registration failed":"registaation succefully";
	}

	@Override
	public String enrollEmpoyee(EmployeeDTO dto) throws Exception {
		float grossSalary=0.0f;
		float netSalary=0.0f;
		EmployeeBO bo=null;
		int count=0;
		// writing business logic
		grossSalary=dto.getSalary()+dto.getSalary()*0.4f;
		netSalary=grossSalary-grossSalary*0.2f;
		// get bo object
		bo=fetchEmployee();
		// copy prop to bo
		BeanUtils.copyProperties(dto, bo);
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		// use dao
		count=empdao.registerEmployee(bo);
		return count==0?"Registration failed":"Registration succefull";
	}

}
