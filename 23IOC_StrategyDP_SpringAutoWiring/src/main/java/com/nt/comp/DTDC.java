package com.nt.comp;

public final class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}

	public String deliver(int oid) {
		return "DTDC curirer will deliver order id "+oid+" order product";
	}

}
