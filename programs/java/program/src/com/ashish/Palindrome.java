package com.ashish;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check whether palindrome or not.");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp>=1){
			int rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(sum==n){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}

}
