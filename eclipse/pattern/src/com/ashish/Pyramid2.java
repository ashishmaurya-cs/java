package com.ashish;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n=sc.nextInt();
		int no=n;
		for(int r=1;r<=n;r++){
			for(int s=1;s<no;s++){
				System.out.print(" ");
			}
			no--;
			for(int p=1;p<=r;p++){
				System.out.print(" *");
			}
			System.out.println();
		}
		sc.close();

	}

}
