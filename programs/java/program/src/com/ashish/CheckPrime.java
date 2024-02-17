package com.ashish;

import java.util.Scanner;

public class CheckPrime {
	void checkPrimeNumber(int n){
		
		int m = n/2;
		int temp=0;
		for(int i=2;i<=m;i++){
			if(n%i==0){
			temp =temp+1;
			}
		}
		if(temp>0||n<=1){
			System.out.println("It is  not a prime number");
		}
		
		else{
			System.out.println("It is a prime number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		do{
		System.out.println("Enter number you want check Prime or Not");
		int n = sc.nextInt();
		CheckPrime p = new CheckPrime();
		p.checkPrimeNumber(n);
		System.out.println("Do you wan tto contiue...?Y/N");
		text =  sc.next();
		}while(text.equalsIgnoreCase("Y"));
		sc.close();
		System.out.println("Thanks for visit :)");
	}

}
