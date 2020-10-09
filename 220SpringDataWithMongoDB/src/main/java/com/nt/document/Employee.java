package com.nt.document;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Employee {
	private Integer eid;
	private String ename;
	private String eadd;
	private float salary;
	private String company;
	private String[] oldCompanies;
}
