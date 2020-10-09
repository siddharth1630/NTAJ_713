package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable {
	private Integer cNo;
	private String cName;
	private String cAdd;
	private Double billAmnt;
	
	public CustomerDTO(int cNo) {
		this.cNo=cNo;
	}
	public CustomerDTO() {
		// TODO Auto-generated constructor stub
	}
}
