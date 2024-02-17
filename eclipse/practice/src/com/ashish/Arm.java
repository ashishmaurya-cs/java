package com.ashish;

import java.util.Scanner;

public class Arm {

	private void isArmstrong(int n) {
		int rem;
		int temp=n;
		int sum = 0;
		while(n>0){
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
			}
		if(sum==temp){
			System.out.println("It is a armstrong number");
		}
		else{
			System.out.println("not a armstrong number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check whether number is armstrong or not");
		int n=sc.nextInt();
		Arm a= new Arm();
		a.isArmstrong(n);
		sc.close();
	}


}
