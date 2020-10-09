package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.Data;

@Entity
@Data
public class Customer implements Serializable {
	@Id
	@Type(type = "int")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cNo;
	
	@Column(length = 20)
	@Type(type = "string")
	private String cName;
	
	@Column(length = 20)
	@Type(type = "string")
	private String cAdd;
	
	@Type(type = "double")
	private double billAmnt;
	
	
	
	
}
