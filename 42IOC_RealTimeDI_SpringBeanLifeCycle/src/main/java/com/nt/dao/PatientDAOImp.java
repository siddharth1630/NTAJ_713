package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.bo.CovidPatientBO;

@Repository("dao")
public class PatientDAOImp implements PatientDAO {
	private static final String GET_PATIENT_BY_HOSP_NAME="SELECT PNO,PNAME,PADDR,PHOSP_NAME,PBED_NO,PGUARD_NO FROM COVIDPATIENT WHERE PHOSP_NAME=?";
	@Autowired(required = false)
	private DataSource ds;
	
	@PostConstruct
	public void myInit() {
		if(ds==null) {
			throw new IllegalArgumentException("ds not injected");
		}
	}
	@PreDestroy
	public void myDestroy() {
		ds=null;
		System.out.println("ds is destroying");
	}


	@Override
	public List<CovidPatientBO> getPatientDetailByHospName(String name)throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<CovidPatientBO> listBo=null;
		CovidPatientBO bo=null;
		try {
			// create connection object
			con=ds.getConnection();
			// create preapred object
			ps=con.prepareStatement(GET_PATIENT_BY_HOSP_NAME);
			// set the parameter
			ps.setString(1, name);
			// execute a query
			rs=ps.executeQuery();
			// getting resultset value and covert into BO
			listBo=new ArrayList<CovidPatientBO>();
			while(rs.next()) {
				bo=new CovidPatientBO();
				bo.setPatientId(rs.getInt(1));
				bo.setPatientName(rs.getString(2));
				bo.setPatientAddr(rs.getString(3));
				bo.setPatientHospName(rs.getString(4));
				bo.setPatientBedNo(rs.getInt(5));
				bo.setPatientGuardianNo(rs.getLong(6));
				listBo.add(bo);
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(ps!=null) {
					ps.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null) {
					con.close();
				}
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
		return listBo;
	}
}







