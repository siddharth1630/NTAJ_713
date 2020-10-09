package com.nt.dto;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.bo.BaseBean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Scope("prototype")
@Component("edto")
public class EmployeeDTO extends BaseBean implements Serializable {
	private String company;
	private float salary;
	
	public EmployeeDTO() {
		System.out.println("EmployeeDTO.EmployeeDTO()");
	}
	
	
	
}
