package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

@Controller
//@Lazy			// FIRST WAY
public class MainController {
	@Autowired
	private EmployeeService service;

	
	public List<EmployeeVO> gatherEmpsByDesg(String desig1,String desig2,String desig3)throws Exception{
		List<EmployeeDTO> listDto=null;
		List<EmployeeVO> listVo=new ArrayList<EmployeeVO>();
		
		//EmployeeVo
		listDto=service.fetchEmployeeByDesignation(desig1, desig2, desig3);
		listDto.forEach(dto->{
			EmployeeVO vo=new EmployeeVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSerialNo(String.valueOf(dto.getSerialNo()));
			vo.setDeptNo(String.valueOf(dto.getDeptNo()));
			vo.setSal(String.valueOf(dto.getSal()));
			vo.setEmpNo(String.valueOf(dto.getEmpNo()));
			listVo.add(vo);
		});
		return listVo;
	}
}
