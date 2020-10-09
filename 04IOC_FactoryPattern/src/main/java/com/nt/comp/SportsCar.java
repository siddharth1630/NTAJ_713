package com.nt.comp;

public class SportsCar implements Car {

	private Tyre tyre;
	
	public SportsCar(Tyre tyre) {
		System.out.println("SportsCar.SprotsCar(): 1 param constructor");
		this.tyre=tyre;
	}
	
	public void Drive() {
		 System.out.println("driving sprots car with--> "+tyre.roadGrip());
	}

}
