package com.nt.bo;

import lombok.Data;

@Data
public class CovidPatientBO {
	private Integer patientId;
	private String patientName;
	private String patientAddr;
	private String patientHospName;
	private Integer patientBedNo;
	private Long patientGuardianNo;
}
