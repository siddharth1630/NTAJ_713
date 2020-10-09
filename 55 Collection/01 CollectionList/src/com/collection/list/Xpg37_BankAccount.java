package com.collection.list;

import java.util.ArrayList;

public class Xpg37_BankAccount {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(new BankAccount("sbi",1234,"deoghar"));
		al.add(new BankAccount("punjab",3232,"banglore"));
		al.add(new BankAccount("sbi",2232,"delhi"));
		
		System.out.println(al.contains(new BankAccount("sbi",1234,"deoghar")));
	}
}

class BankAccount{
	String name;
	int accno;
	String branch;
	public BankAccount(String name,int accno,String branch) {
		this.name=name;
		this.accno=accno;
		this.branch=branch;		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BankAccount) {
			BankAccount ba=(BankAccount)obj;
			return ((accno==ba.accno) && branch.equals(ba.branch));
		}
		else 
			return false;	
	}
}
