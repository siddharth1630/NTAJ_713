package com.nt.vo;

import lombok.Data;

@Data
public class CovidPatientVO {
	private String patientId;
	private String patientName;
	private String patientAddr;
	private String patientHospName;
	private String patientBedNo;
	private String patientGuardianNo;
}
