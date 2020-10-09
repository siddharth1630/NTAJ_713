package com.nt.test;

/*
 * 2. Rules for making pairs from above calculated bit scores
Condition for making pairs are
· Both bit scores should be in either odd position or even position to be eligible to form a pair.
· Pairs can be only made if most significant digit are same and at most two pair can be made for a given significant digit.
58 12 40 76 40 11 19 18
No. of pair possible are 3:
40 appears twice at odd-indices 3 and 5 respectively. Hence, this is one pair.
12, 11, 18 are at even-indices. Hence, two pairs are possible from these three-bit scores.
Hence total pairs possible is 3
 */

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		int arr[]=new int[total];
		
		for(int i=0;i<total;i++) {
			arr[i]=sc.nextInt();
		}
		
		int last[]=new int[total];
		
		for(int i=0;i<total;i++) {
			int max=-1,min=9999999,rem=0;
			while(arr[i]>0) {
				rem=arr[i]%10;
				if(max<=rem) {
					max=rem;
				}
				if(min>=rem) {
					min=rem;
				}
				arr[i]=arr[i]/10;
			}
			int sum=max*11+min*7;
			
			last[i]=sum;
			last[i]=last[i]%100;
	//		System.out.println(last[i]);			
		}
		
		
		
		sc.close();

	}
	

}
