package com.ashish;

import java.util.Scanner;

public class Palindrome {
	public void isPalindrome(int n){
		int temp=n;
		int sum=0,rem;
		while(n>0){
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		
		if(sum==temp){
			System.out.println(temp+" is a palindrome number");
		}
		else{
			System.out.println(temp+" is not a palindrome");
		}
	}

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter number to check whether number is palindrome or not");
		int n= sc.nextInt();
		Palindrome p = new Palindrome();
		p.isPalindrome(n);
		System.out.println("Do you want to continue...Y/N");
		 s=sc.next();
		}while(s.equalsIgnoreCase("Y"));
		System.out.println("Thank you for using our services.");
		sc.close();
	}
}
