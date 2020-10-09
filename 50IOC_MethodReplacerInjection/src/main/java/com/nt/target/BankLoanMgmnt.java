package com.nt.target;

public class BankLoanMgmnt {
	
	public BankLoanMgmnt() {
		System.out.println("BankLoanMgmnt.BankLoanMgmnt()");
	}
	public  float calculateIntrestAmount(float pAmnt,float rate,int month) {
		System.out.println("BankLoanMgmnt.calculateIntrestAmount()");
		return (float) ((pAmnt*Math.pow(1+rate/100, month))-pAmnt);
	}
}
