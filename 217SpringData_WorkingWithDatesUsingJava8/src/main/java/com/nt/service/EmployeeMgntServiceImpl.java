package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.EmployeeDTO;
import com.nt.entity.EmployeeInfo;
import com.nt.repo.EmployeeInfoRepo;

@Service
public class EmployeeMgntServiceImpl implements EmployeeMgntService {
	@Autowired
	private EmployeeInfoRepo repo;
	
	@Override
	public Integer registerEmployee(EmployeeDTO emp) {
		EmployeeInfo entity=null;
		entity=new EmployeeInfo();
		BeanUtils.copyProperties(emp, entity);
		return repo.save(entity).getEid();
	}

	@Override
	public Iterable<EmployeeDTO> getAllEmployee() {
		Iterable<EmployeeDTO> listDto=new ArrayList<EmployeeDTO>();
		Iterable<EmployeeInfo> listEntity=null;
		listEntity=repo.findAll();
		listEntity.forEach(e->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(e, dto);
			((ArrayList<EmployeeDTO>) listDto).add(dto);
		});
		return listDto;
	}

}
