package com.ipl.external;

public class IPLScoreCompImpl implements IIPLScoreComp {
	@Override
	public String getScore(int mid) {
		if(mid==1001)
			return "CSK vs MI:: 162/9(MI),CSK(167) CSK won by 5 Wickets";
		if(mid==1002)
			return "DC vs KX1P:: 154/8(DC),KX1P(154/6) DC won through super over";
		if(mid==1003)
			return "RCB vs SRH:: 163/8(RCB),SRH(153) RCB won by 10 RUNS";
		else{
			throw new IllegalArgumentException("invalid match id");
		}
	}
}
