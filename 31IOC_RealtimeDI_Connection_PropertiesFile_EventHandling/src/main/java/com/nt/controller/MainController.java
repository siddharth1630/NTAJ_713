package com.nt.controller;

import com.nt.dto.PlayerDTO;
import com.nt.service.PlayerService;
import com.nt.vo.PlayerVO;

public class MainController {
	private PlayerService service;

	public MainController(PlayerService service) {
		this.service = service;
	}
	
	public String processPlayer(PlayerVO vo,int choice) throws Exception{
		PlayerDTO dto=null;
		// initailise dto object
		dto=new PlayerDTO();
		dto.setpName(vo.getpName());
		dto.setTeam(vo.getTeam());
		
		if(choice==1) {
			dto.setRunScored(Integer.parseInt(vo.getRunScored()));
			dto.setTimesOut(Integer.parseInt(vo.getTimesOut()));
			return service.calculateBattingAvg(dto);
		}
		else if(choice==2) {
			dto.setRunsConceded(Integer.parseInt(vo.getRunsConceded()));
			dto.setWicketTaken(Integer.parseInt(vo.getWicketTaken()));
			return service.calculateBowlingAvg(dto);
		}
		else {
			return "Wrong choice";
		}
	}
}
