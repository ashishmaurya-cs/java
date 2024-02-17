package com.ashish;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		System.out.println("enter number to chck");
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		if(a%2==0){
			System.out.println("Even number");
		}
		else {
			System.out.println("odd number");
		}
		sc.close();
	}

}
