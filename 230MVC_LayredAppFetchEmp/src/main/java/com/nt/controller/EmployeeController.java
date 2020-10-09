package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmntService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeMgmntService service;
	
	@GetMapping("/welcome")
	public String home() {
		return "home";
	}
	
	@GetMapping("/list_emp")
	public String getEmp(Map<String, Object> map) {
		List<EmployeeDTO> listDto=null;
		// use service
		listDto=service.FetchAllEmployees();
		map.put("empInfo", listDto);
		return "show_result";
	}
}
