package com.ashish;

import java.util.Scanner;

public class IsPrime {
	
	public void isPrime(int n){
		
		int count = 0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				count++;
				break;
			}
		}
		System.out.println(count);
		if(count>0||n<=1){
			System.out.println("Not a prime number");
		}
		else{
			System.out.println("Prime number");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter to number to check whether number is prime or not");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		IsPrime is=new IsPrime();
		is.isPrime(n);
		sc.close();
	}

}
