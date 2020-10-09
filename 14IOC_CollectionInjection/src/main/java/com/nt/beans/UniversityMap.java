package com.nt.beans;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityMap {
	private Map<Integer,String> facultyDetails;	// insertion order preserved by using LinkedHashMap
	private Map<String,Date> datesInfo;
	private Properties property;	// insertion order not preserved
	
	public UniversityMap(Map<Integer, String> facultyDetails, Map<String, Date> datesInfo) {
		this.facultyDetails = facultyDetails;
		this.datesInfo = datesInfo;
	}
	
	

	public void setProperty(Properties property) {
		this.property = property;
	}



	@Override
	public String toString() {
		return "UniversityMap [facultyDetails=" + facultyDetails + ", datesInfo=" + datesInfo + ", property=" + property
				+ "]";
	}
	
	
	
	
}
