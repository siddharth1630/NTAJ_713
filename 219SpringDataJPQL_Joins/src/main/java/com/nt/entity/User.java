package com.nt.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Data_user")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String name; 
	private String addrs;
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL)
	@JoinColumn(name="fk_userId",referencedColumnName = "userId")
	private Set<PhoneNumber> phones;
	
}
