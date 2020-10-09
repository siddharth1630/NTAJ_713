package com.nt.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {
	private Integer eid;
	private String ename;
	private Date dob;
	private Date doj;
	private Date batchTime;
}
