package com.nt.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String Get_ALL_EMPLOYEE="SELECT EMPNO,ENAME,SAL,JOB,DEPTNO FROM EMPLOYEE";
	private static final String INSERT_EMPLOYEE="INSERT INTO EMPLOYEE(EMPNO,ENAME,SAL,JOB,DEPTNO) VALUES(ENO_SEQ.NEXTVAL,?,?,?,?)";
	private static final String GET_DEPTNOS="SELECT DISTINCT(DEPTNO) FROM EMPLOYEE WHERE DEPTNO IS NOT NULL ORDER BY DEPTNO";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<EmployeeBO> getAllEmployee() {
		List<EmployeeBO> bo=null;
		bo=jt.query(Get_ALL_EMPLOYEE,new EmployeeRowMapper()); 
		return bo;	 
	}				
	
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

	@Override
	public int insertEmployee(EmployeeBO bo) {
		int count=0;
		count=jt.update(INSERT_EMPLOYEE, bo.getEname(),bo.getSal(),bo.getJob(),bo.getDeptno());
		return count;
	}

	@Override
	public List<Integer> getDeptnos() {
		List<Integer> list=new ArrayList<Integer>();
		List<Map<String,Object>>	map=null;
		map=jt.queryForList(GET_DEPTNOS);
		
		map.forEach(e->{
			list.add((Integer)((BigDecimal) e.get("deptNo")).intValue());
		});
		return list;
	}
	
	

}
