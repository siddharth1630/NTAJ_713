package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CovidPatientDTO implements Serializable{
	private Integer patientId;
	private String patientName;
	private String patientAddr;
	private String patientHospName;
	private Integer patientBedNo;
	private Long patientGuardianNo;
}
