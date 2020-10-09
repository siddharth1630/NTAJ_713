package com.nt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class EmployeeInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	private String ename;
	@Temporal(value=TemporalType.DATE)
	private Date dob;
	@Temporal(value=TemporalType.TIME)
	private Date doj;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date batchTime;
}
