package com.nt.tcs;

import java.util.Scanner;

public class TCS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int pDLit=sc.nextInt();
		int pFCLit=sc.nextInt();
		int pShowPrice=sc.nextInt();
		int pMRun=sc.nextInt();
		int pMaint=sc.nextInt();
		
		int dDLit=sc.nextInt();
		int dFCLit=sc.nextInt();
		int dShowPrice=sc.nextInt();
		int dMRun=sc.nextInt();
		int dMaint=sc.nextInt();
		
		
		int pTotalCost=pShowPrice+pMaint*60+(pMRun*60*pFCLit)/pDLit;
		int dTotalCost=dShowPrice+dMaint*60+(dMRun*60*dFCLit)/dDLit;
		
		if(pTotalCost>dTotalCost) {
			System.out.println("Diesel");
		}
		else {
			System.out.println("petrol");
		}
		
		
		
	}
}
