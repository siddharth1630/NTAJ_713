package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("calc")		
public class LoanAmntIntrestCalculator {
	@Autowired	
	@Value("48000f,22f,9")
	private LoanAmntDetail loan;
	
	/*	private LoanAmntIntrestCalculator(LoanAmntDetail loan) {
			System.out.println("LoanAmntIntrestCalculator.LoanAmntIntrestCalculator()");
			this.loan = loan;
		}*/
	
	public float intrest() {
		return (loan.getPAmnt()*loan.getRate()*loan.getTime())/1000.0f;
	}

}
