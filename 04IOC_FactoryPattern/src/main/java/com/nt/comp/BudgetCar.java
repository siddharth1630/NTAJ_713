package com.nt.comp;

public class BudgetCar implements Car {
	
	private Tyre tyre;
	
	public BudgetCar(Tyre tyre) {
		System.out.println("BudgetCar.BudgetCar()::1 param constructor");
		this.tyre=tyre;
	}

	public void Drive() {
		System.out.println("Driving budget car with--> "+tyre.roadGrip());

	}

}
