package com.nt.comp;

public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	public String deliver(int oid) {
		return "BlueDart curirer will deliver order id "+oid+" order product";
	}

}
