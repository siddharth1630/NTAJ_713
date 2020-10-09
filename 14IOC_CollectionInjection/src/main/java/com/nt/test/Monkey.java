package com.nt.test;

import java.util.Scanner;

/*Input

1

6

3 6 5 4 1 2

Output

6

Explanation

Consider N = 6, and an array monkeys = {3,6,5,4,1,2}.{1,2,3,4,5,6

Suppose monkeys are a,b,c,d,e,f, & Initial position (at t = 0) -> a,b,c,d,e,f

At t = 1 -> e,f,a,d,c,b

a will move to 3rd position, b will move to 6th position, c will move to 5th position, d will move to 4th position,
e will move to 1st position and f will move to 2nd position. Thus from a,b,c,d,e,f at t =0, we get e,f,a,d,c,b at t =1. 
Recursively applying same transpositions, we get following positions for different values of t.

At t = 2 -> c,b,e,d,a,f

At t = 3 -> a,f,c,d,e,b

At t = 4 -> e,b,a,d,c,f

At t = 5 -> c,f,e,d,a,b

At t = 6 -> a,b,c,d,e,f

Since at t = 6, we got the original position, therefore the answer is 6.*/

public class Monkey {

	public static void main(String[] args) {
		Scanner sc=null;
		int size=0;
		int arr[]=null;
		
		sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt(); 
		}

	}

}
