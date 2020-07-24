package com.nt.service;

import com.nt.bo.PlayerBO;
import com.nt.dao.PlayerDAO;
import com.nt.dto.PlayerDTO;

public class PlayerServiceImpl implements PlayerService {
	private PlayerDAO dao;
	
	public PlayerServiceImpl(PlayerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String calculateBattingAvg(PlayerDTO dto) throws Exception {
		float battingAvg=0.0f;
		PlayerBO bo=null;
		int count=0;
		
		// calculate avg
		battingAvg=dto.getRunScored()/dto.getTimesOut();
		// initialise bo object
		bo=new PlayerBO();
		bo.setpName(dto.getpName());
		bo.setTeam(dto.getTeam());
		bo.setBattingAvg(battingAvg);
		
		// calling dao class
		count=dao.insertBattingAvg(bo);
		
		if(count==1) {
			return "Value is succeffuly inserted batting avg is "+battingAvg;
		}
		else {
			return "value is not inserted batting avg is "+battingAvg;
		}
	}

	@Override
	public String calculateBowlingAvg(PlayerDTO dto) throws Exception {
		float bowlingAvg=0.0f;
		PlayerBO bo=null;
		int count=0;
		
		// calculate avg
		bowlingAvg=dto.getRunsConceded()/dto.getWicketTaken();
		// initialise bo object
		bo=new PlayerBO();
		bo.setpName(dto.getpName());
		bo.setTeam(dto.getTeam());
		bo.setBowlingAvg(bowlingAvg);
		
		// calling dao class
		count=dao.insertBowlingAvg(bo);
		
		if(count==1) {
			return "Value is succeffuly inserted bowling avg is "+bowlingAvg;
		}
		else {
			return "value is not inserted bowling avg is "+bowlingAvg;
		}
	}

}
