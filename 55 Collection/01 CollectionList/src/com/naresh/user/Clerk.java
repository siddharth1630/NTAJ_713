package com.naresh.user;

import java.util.Scanner;

import com.naresh.bean.AccountBean;
import com.naresh.db.CollectionDB;

public class Clerk {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CollectionDB db=new CollectionDB();
		
	loop:	while(true) {
			System.out.println("\n choose option ");
			System.out.println("1 for create new account");
			System.out.println("2 for get balance");
			System.out.println("3 for exit");
			System.out.print("enter your answerr---> ");
			int option=sc.nextInt();
			
			switch(option) {
				case 1: AccountBean bean=new AccountBean();
						System.out.print("Enter your account number----> ");
						bean.setAccNum(sc.nextLong());
						
						sc.nextLine();
						System.out.print("Enter your name ----->");
						bean.setName(sc.nextLine());
						
						System.out.print("Enter balance----> ");
						bean.setBalance(sc.nextDouble());
						
						sc.nextLine();
						System.out.print("Enter account type ----> ");
						bean.setAccType(sc.nextLine());
						
						db.addAccount(bean);
						System.out.println("Account is created ");
						break;
					
				case 2: System.out.print("Enter your account number ----> ");
						long accNum=sc.nextLong();
						sc.nextLine();
						System.out.print("Account type -----> ");
						String accType=sc.nextLine();
						bean=db.getAccount(accNum, accType);
						
						if(bean!=null) {
							System.out.println("current balance ---> "+bean.getBalance());
						}
						else
							System.out.println("Account number is wrong");
						break;
						
				case 3: break loop;
				
				default: System.out.println("INVALID OPTION ");
			}
		}while(true);
	//	System.out.println("\n **************** THANK U VISIT AGAIN *************************");
	//	sc.close();
	}
}
