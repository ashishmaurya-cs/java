package com.ashish;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number term of fibinacci  series you want to print");
		int n=sc.nextInt();
		int n1=0,n2=1;
		System.out.println("First "+ n +" term of fibonacci series.");
		System.out.println(n1+" \n"+n2);
		for(int i=1;i<=n-2;i++){
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		sc.close();
	}

}
