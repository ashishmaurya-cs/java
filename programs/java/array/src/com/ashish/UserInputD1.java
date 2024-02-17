package com.ashish;

import java.util.Scanner;

public class UserInputD1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter element of an array::-");
		for(int i=0;i<n;i++){
			
			a[i]= sc.nextInt();
		}
		System.out.println("Entered elements are:-");
		for(int i =0;i<n;i++){
			System.out.print(a[i]+" ");
		}
			sc.close();
	}

}
