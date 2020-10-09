package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table//(name = "Data_phoneNumber")
public class PhoneNumber implements Serializable{
	@Id
	private Long mobileNo;
	private String type;
	private String provider;
}
