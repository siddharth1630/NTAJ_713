package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.dto.EmployeeDTO;
import com.nt.model.Employee;
import com.nt.service.EmployeeMgmntService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeMgmntService service;
	
	@GetMapping("/welcome.htm")
	public String home() {
		return "home";
	}
	
	@GetMapping("/list_emp.htm")
	public String getEmp(Map<String, Object> map) {
		List<EmployeeDTO> listDto=null;
		// use service
		listDto=service.FetchAllEmployees();
		map.put("empInfo", listDto);
		return "show_result";
	}
	
	@GetMapping("/saveEmp.htm")
	public String addEmp(@ModelAttribute("empFrm") Employee emp) {
		return "employee-register";
	}
	
	@PostMapping("/saveEmp.htm")
	public String registerEmp(Map<String,Object> map,@ModelAttribute("empFrm") Employee emp) {
		EmployeeDTO dto=null;
		String result=null;
		// take it for getting all value inclucding new value
		List<EmployeeDTO> listDto=null;
		dto=new EmployeeDTO();
		// copy model to dto
		BeanUtils.copyProperties(emp, dto);
		// call serivice method
		result=service.registerEmployee(dto);
		listDto=service.FetchAllEmployees();
		//set model
		map.put("registerMsg", result);
		map.put("empInfo", listDto);
		return "show_result";		
	}
	
	@ModelAttribute("deptNos")
	public List<Integer> getDeptno() {
	//	return List.of(10,20,30,40);	// CASE 2 HARD CODED
		return service.fetchAllDeptnos();
	}
}
