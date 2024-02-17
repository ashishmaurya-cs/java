package com.ashish;

import java.util.Scanner;

public class Armstrong {
	
	 void isArmstrong(int n){
		 int temp=n;
		 int rem,sum=0;
		 while(n>0){
			 rem=n%10;
			 sum=sum+rem*rem*rem;
			 n=n/10;
		 }
		 if(sum==temp){
			 System.out.println("it is armstrong");
		 }
		 else{
			 System.out.println("not a armstrong");
		 }
		
	}
	 
	 public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		Armstrong a = new Armstrong();
		a.isArmstrong(n);
		sc.close();
	}

}
