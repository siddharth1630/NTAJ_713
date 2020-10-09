package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.PlayerBO;

public class PlayerDAOImpl implements PlayerDAO {
	private final static String CALCULATE_AVG="INSERT INTO PLAYER13 VALUES(SEQ2.NEXTVAL,?,?,?,?)";
	private DataSource ds=null;

	public PlayerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insertBattingAvg(PlayerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		// creating a connection pool
		con=ds.getConnection();
		ps=con.prepareStatement(CALCULATE_AVG);
		// prepare a statementn
		ps.setString(1, bo.getpName());
		ps.setString(2, bo.getTeam());
		ps.setFloat(3, bo.getBattingAvg());
		ps.setFloat(4,0.0f);

		// execute the sql query
		count=ps.executeUpdate();
		//close jdbc object
		ps.close();
		con.close();
		
		return count;
	}

	@Override
	public int insertBowlingAvg(PlayerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		// creating a connection pool
		con=ds.getConnection();
		ps=con.prepareStatement(CALCULATE_AVG);
		// prepare a statementn
		ps.setString(1, bo.getpName());
		ps.setString(2, bo.getTeam());
		ps.setFloat(3,0.0f);
		ps.setFloat(4, bo.getBowlingAvg());
		

		// execute the sql query
		count=ps.executeUpdate();
		//close jdbc object
		ps.close();
		con.close();
		
		return count;
	}

}
