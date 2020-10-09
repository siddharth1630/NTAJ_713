package com.nt.comp;

public class LuxaryCar implements Car {
	
	private Tyre tyre;
	
	public LuxaryCar(Tyre tyre) {
		System.out.println("LuxaryCar.LuxaryCar():1 param constructor");
		this.tyre=tyre;
	}

	public void Drive() {
		System.out.println("Driving Luxary car-->"+tyre.roadGrip());
	}

}
