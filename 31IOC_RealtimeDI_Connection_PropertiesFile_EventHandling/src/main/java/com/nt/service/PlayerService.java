package com.nt.service;

import com.nt.dto.PlayerDTO;

public interface PlayerService {
	
	public String calculateBattingAvg(PlayerDTO dto)throws Exception;
	public String calculateBowlingAvg(PlayerDTO dto)throws Exception;

}
