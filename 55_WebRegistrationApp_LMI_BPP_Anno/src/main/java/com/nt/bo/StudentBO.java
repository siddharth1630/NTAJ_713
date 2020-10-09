package com.nt.bo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Scope("prototype")
@Component("sbo")
public class StudentBO extends BaseBean{
	private String sadd;
	private String course;
	private int total;
	private float avg;
	
	public StudentBO() {
		System.out.println("StudentBO.StudentBO()");
	}
	
	
}
