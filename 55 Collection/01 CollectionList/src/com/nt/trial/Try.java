package com.nt.trial;
import java.util.*;
import java.io.*;


class Calculator{
    public int power(int n,int p)throws NegativeArrayException{
        try{
        	if(n>=0 && p>=0) {
	            int total=1;
	            for(int i=1;i<=p;i++){
	            }
	            return total;
        	}
        	else 
        		throw new NegativeArrayException("n and p should be non-negative");
	          
        }
        catch(NegativeArrayException e){
         throw new RuntimeException("n and p should be non-negative");
        }
    }
}

class NegativeArrayException extends Exception{
	NegativeArrayException(String s){
	
	}
}
	

class Try{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

