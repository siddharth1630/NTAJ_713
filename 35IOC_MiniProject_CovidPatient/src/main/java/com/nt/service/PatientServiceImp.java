package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CovidPatientBO;
import com.nt.dao.PatientDAO;
import com.nt.dto.CovidPatientDTO;

public class PatientServiceImp implements PatientService {
	private PatientDAO dao;
	private PatientServiceImp(PatientDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<CovidPatientDTO> fetchPatientByHospName(String name) throws Exception {
		List<CovidPatientDTO> listDto=new ArrayList<CovidPatientDTO>();;
		List<CovidPatientBO> listBo=null;
		
		listBo=dao.getPatientDetailByHospName(name);
		// convert bo to dto
		listBo.forEach(bo->{
			CovidPatientDTO dto=new CovidPatientDTO();
			BeanUtils.copyProperties(bo, dto);
			listDto.add(dto);
		});
		return listDto;
	}

}
