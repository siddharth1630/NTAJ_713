package com.nt.dao;

import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("sdao")
public class StudentDAOImpl implements StudentDAO{

	public StudentDAOImpl() {
		System.out.println("StudentDAOImpl.StudentDAOImpl()");
	}
	
	@Override
	public int registerStudent(StudentBO bo) throws Exception {
		System.out.println("Student is register with data "+bo);
		return 1;
	}
	

}
