package com.nt.dao;

import com.nt.bo.PlayerBO;

public interface PlayerDAO {

	int insertBattingAvg(PlayerBO bo) throws Exception;

	int insertBowlingAvg(PlayerBO bo) throws Exception;

}
