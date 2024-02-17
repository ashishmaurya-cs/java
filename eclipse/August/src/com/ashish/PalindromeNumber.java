package com.ashish;

import java.util.Scanner;

public class PalindromeNumber {
	
	 void isPalindrome(int n){
		int sum=0;
		int temp=n;
		int rem;
		while(n>0){
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("it is a plindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter  number to check palindrome");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		PalindromeNumber p= new PalindromeNumber();
		p.isPalindrome(n);
		sc.close();
	}

}
