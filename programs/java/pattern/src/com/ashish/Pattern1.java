package com.ashish;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of row:");
		int m=sc.nextInt();
		System.out.println("Enter no of column:");
		int n = sc.nextInt();
		sc.close();
		for(int i=1;i<=m;i++){
			
			for(int j=1;j<=n;j++){
				if(j<=i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}	

	}
	
}												
