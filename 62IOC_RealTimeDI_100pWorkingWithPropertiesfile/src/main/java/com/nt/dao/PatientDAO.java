package com.nt.dao;

import java.util.List;

import com.nt.bo.CovidPatientBO;

public interface PatientDAO {
	public List<CovidPatientBO> getPatientDetailByHospName(String name)throws Exception;  
}
