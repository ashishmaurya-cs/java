package com.ashish;

import java.util.Scanner;

public class Factorial {
	void facto(int a){
		
		int f=1;
		for(int i=1;i<=a;i++){
			
			f=f*i;
		}
		System.out.println("Factorial of " +a+ " is " + f);
	}
	public static void main(String[] args) {
		String text;
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("Enter number to find factorial:-");
		int n= sc.nextInt();
		Factorial f =new Factorial();
		f.facto(n);
		System.out.println("Do you want to contiue...?Y/N");
		text = sc.next();
		
		}while(text.equalsIgnoreCase("y"));
		System.out.println("Thanks for Visit!");
		sc.close();
	}

}
