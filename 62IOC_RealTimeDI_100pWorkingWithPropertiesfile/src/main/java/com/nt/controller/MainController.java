package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.dto.CovidPatientDTO;
import com.nt.service.PatientService;
import com.nt.vo.CovidPatientVO;
@Controller("controller")
public class MainController {
	@Autowired
	private PatientService service;
	
	@PostConstruct
	public void myInti() {
		if(service==null) {
			throw new IllegalArgumentException("service not injected");
		}
	}
	@PreDestroy
	public void myDestroy() {
		service=null;
	}

	
	public List<CovidPatientVO> gatherDetaiByHospName(String name)throws Exception{
		List<CovidPatientDTO> listDto=null;
		List<CovidPatientVO> listVo=new ArrayList<CovidPatientVO>();
		
		//EmployeeVo
		listDto=service.fetchPatientByHospName(name);
		listDto.forEach(dto->{
			CovidPatientVO vo=new CovidPatientVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setPatientId(String.valueOf(dto.getPatientId()));
			vo.setPatientBedNo(String.valueOf(dto.getPatientBedNo()));
			vo.setPatientGuardianNo(String.valueOf(dto.getPatientGuardianNo()));
			listVo.add(vo);
		});
		return listVo;
	}
}
