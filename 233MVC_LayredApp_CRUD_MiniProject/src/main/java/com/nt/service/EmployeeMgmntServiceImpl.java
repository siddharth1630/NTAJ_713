package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmntServiceImpl implements EmployeeMgmntService {
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public List<EmployeeDTO> FetchAllEmployees() {
		List<EmployeeBO> listBo=null;
		List<EmployeeDTO> listdto=new ArrayList<EmployeeDTO>();
		// call the dao method
		listBo=dao.getAllEmployee();
		// convert bo to dto and performing some bussiness logic
		listBo.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSerialNo(listdto.size()+1);
			dto.setGrossSalary(bo.getSal()+bo.getSal()*0.5f);
			dto.setNetSalary(bo.getSal()+bo.getSal()*0.1f);
			dto.setSal(Math.round(bo.getSal()));
			listdto.add(dto);			
		});
		return listdto;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int result=0;
		bo=new EmployeeBO();
		// copy properties from dto to bo
		BeanUtils.copyProperties(dto, bo);
		// call method
		result=dao.insertEmployee(bo);
		return result==0?"Registration Failed":"Registration Success";
	}

	@Override
	public List<Integer> fetchAllDeptnos() {
		return dao.getDeptnos();
	}

}
