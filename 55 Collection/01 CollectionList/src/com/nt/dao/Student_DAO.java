 /*
 CREATE TABLE STUDENT_DAO(
 SNO        NUMBER(5) PRIMARY KEY,
 SNAME      VARCHAR2(20),
 COURSE     VARCHAR2(20),
 FEE        NUMBER(7,2)
 
 */

package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nt.bean.Student_Bean;

public class Student_DAO {
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private static final String S_QUERY="SELECT * FROM STUDENT_DAO WHERE COURSE=?";
	
	public Student_DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","scott","tiger");
			ps=con.prepareStatement(S_QUERY);
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//constructor
	
	// method for retriving student information from db
	public ArrayList getStudent(String course) {
		ArrayList studentList=new ArrayList();
		try {
			ps.setString(1, course);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Student_Bean bean=new Student_Bean();
				bean.setSno(rs.getInt(1));
				bean.setSname(rs.getString(2));
				bean.setCourse(rs.getString(3));
				bean.setFee(rs.getDouble(4));
				
				studentList.add(bean);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return studentList;
	}
}
