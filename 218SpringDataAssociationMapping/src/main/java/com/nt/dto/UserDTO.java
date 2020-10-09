package com.nt.dto;

import java.util.Set;

import lombok.Data;

@Data
public class UserDTO {
	private Integer userId;
	private String name; 
	private String addrs;
	private Set<PhoneNumberDTO> phones;
}
