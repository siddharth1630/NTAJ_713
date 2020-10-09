package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String Get_ALL_EMPLOYEE="SELECT EMPNO,ENAME,SAL,JOB,DEPTNO FROM EMPLOYEE";
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<EmployeeBO> getAllEmployee() {
		List<EmployeeBO> bo=null;
		bo=jt.query(Get_ALL_EMPLOYEE,new EmployeeRowMapper());// here we can send a query and resultSetExtracter type innerclass 
		return bo;	// for getting the all rs value in this object and call its implementation class method 
	}				// which convert rs to bo and store in list bo and return to calling method in service class
	
	private class EmployeeRowMapper implements ResultSetExtractor<List<EmployeeBO>>{
		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listBo=null;
			listBo=new ArrayList<EmployeeBO>();
			
			while(rs.next()) {
				EmployeeBO bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setSal(rs.getFloat(3));
				bo.setJob(rs.getString(4));
				bo.setDeptno(rs.getInt(5));
				listBo.add(bo);
			}
			return listBo;
		}
		
	}

}
