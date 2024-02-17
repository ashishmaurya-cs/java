package com.ashish;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of row:");
		int m=sc.nextInt();
		System.out.println("Enter no of column:");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Welcome in the String pattern of the Java:");
		for(int i=1;i<=m;i++){
			
			for(int j=1;j<=n;j++){
				if(j<=i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}	

	

	  for(int i=1;i<=m;i++){
		  for(int j=1;j<=n;j++){
			  if(j<=m-i){
				  System.out.print("* ");
			  }
			  else{
				 System.out.print("  ");
			  }
		  }
		  System.out.println();
	  }
	}
}
