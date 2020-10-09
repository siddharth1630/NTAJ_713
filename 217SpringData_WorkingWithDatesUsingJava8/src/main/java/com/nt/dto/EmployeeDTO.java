package com.nt.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {
	private Integer eid;
	private String ename;
	private LocalDateTime dob;

	private LocalDate doj;

	private LocalTime batchTime;
}
