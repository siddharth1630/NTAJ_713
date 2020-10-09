package com.nt.service;

import java.util.List;

import com.nt.dto.CovidPatientDTO;

public interface PatientService {
	public List<CovidPatientDTO> fetchPatientByHospName(String name)throws Exception;
}
