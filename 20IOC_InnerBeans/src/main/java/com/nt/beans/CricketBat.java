package com.nt.beans;

import java.util.Random;

public class CricketBat {
	
	CricketBat(){
		System.out.println("CricketBat.CricketBat()");
	}
	
	public int scoreRuns() {
		return new Random().nextInt(300);
	}

}
