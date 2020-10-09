package com.nt.comp;

import org.springframework.stereotype.Component;

@Component
public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}
	public String deliver(int oid) {
		return "BlueDart curirer will deliver order id "+oid+" order product";
	}

}
