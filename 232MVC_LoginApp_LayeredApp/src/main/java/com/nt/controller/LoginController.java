package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.dto.UserDTO;
import com.nt.model.User;
import com.nt.servcie.LoginServiceMgmnt;

@Controller
public class LoginController {
	@Autowired
	private LoginServiceMgmnt service;
	
	@GetMapping("/login")
	public String showLoginForm(@ModelAttribute User userDetails) {
		userDetails.setUsername("GHOST");
		return "login_form";
	}
	
	@PostMapping("/login")
	public String result(Map<String,String> map,@ModelAttribute User users) {
		UserDTO dto=null;
		dto=new UserDTO();
		String result=null;
		// copy model to dto
		BeanUtils.copyProperties(users, dto);
		// call service method
		result=service.authentication(dto);
		// setting the model 
		map.put("result", result);
		return "login_form";	
	}
	
}
