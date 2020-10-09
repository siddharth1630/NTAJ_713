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
@Component("sdto")
public class StudentDTO extends BaseBean implements Serializable{
	private String sadd;
	private String course;
	private int m1,m2,m3;
	
	public StudentDTO() {
		System.out.println("StudentDTO.StudentDTO()");
	}
	
	
	
}
