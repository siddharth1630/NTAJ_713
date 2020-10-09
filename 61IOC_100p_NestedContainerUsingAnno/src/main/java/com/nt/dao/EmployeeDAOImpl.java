package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.entity.EmployeeBO;

@Repository("empDao")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private DataSource ds;
	private static final String GET_EMP_BY_DESGIN="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMPLOYEE WHERE JOB IN(?,?,?)";
	

	@Override
	public List<EmployeeBO> getEmpByDesig(String desig1, String desig2, String desig3) throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmployeeBO> listEmp=null;
		EmployeeBO entity=null;

		try {
			// creatign a connection pooled object
			con=ds.getConnection();
			// creating a prepared statement object
			ps=con.prepareStatement(GET_EMP_BY_DESGIN);
			// setting the parameter
			ps.setString(1, desig1);
			ps.setString(2, desig2);
			ps.setString(3, desig3);
			// execute the query
			rs=ps.executeQuery();

			// copy each record of bo to dto
			listEmp=new ArrayList<EmployeeBO>();
			while(rs.next()) {
				entity=new EmployeeBO();		
				entity.setEmpNo(rs.getInt(1));
				entity.setEName(rs.getString(2));
				entity.setJob(rs.getString(3));
				entity.setSal(rs.getFloat(4));
				entity.setDeptNo(rs.getInt(5));
				listEmp.add(entity);
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
		return listEmp;
	}

}
