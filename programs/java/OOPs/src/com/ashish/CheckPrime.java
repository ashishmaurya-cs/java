package com.ashish;

import java.util.Scanner;

public class CheckPrime {
	
	 int n;
     int temp=0;
     
 	void  checkPrime(int n){
		this.n = n;
		int m = n/2;
		
				if(n<=1){
					System.out.println("not a prime number");
				}
				for(int i=2;i<=m;i++){
					
					if(n%i==0){
						temp = temp+1;
					}
					
				}
				
				if(temp>0){
					System.out.println("this is not a prime number");
					
				}
				else{
					
					System.out.println( n + " is a prime number.");
				}
				
				
		
  }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number you want to check : ");
		int a = sc.nextInt();
		sc.close();
		CheckPrime c = new CheckPrime();
		
		c.checkPrime(a);
		
		

	}

}
