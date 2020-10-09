package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.entity.EmployeeBO;

@Service("empSer")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;

	@Override
	public List<EmployeeDTO> fetchEmployeeByDesignation(String desig1, String desig2, String desig3) throws Exception{
		List<EmployeeDTO> listDto=null;
		List<EmployeeBO> listBo=null;
		EmployeeDTO dto=null;
		// convert desgination into uppercase
		/*	desig1=desig1.toUpperCase();
			desig2=desig2.toUpperCase();
			desig3=desig3.toUpperCase();
			*/
		// use dao
		listBo=dao.getEmpByDesig(desig1, desig2, desig3);
		// convert bo to dto
		listDto=new ArrayList<EmployeeDTO>();
		for(EmployeeBO bo:listBo) {
			dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSal((float) Math.round(bo.getSal()));
			dto.setSerialNo(listDto.size()+1);
			listDto.add(dto);
		}
		return listDto;
	}

}
