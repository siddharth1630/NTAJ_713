package com.nt.bo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Scope("prototype")
@Component("ebo")
public class EmployeeBO extends BaseBean {
	private String company;
	private float salary;
	private float grossSalary;
	private float netSalary;
	
	public EmployeeBO() {
		System.out.println("EmployeeBO.EmployeeBO()");
	}
	
	
	
	
	
}
