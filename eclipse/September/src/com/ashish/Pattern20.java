package com.ashish;

import java.util.Scanner;

public class Pattern20 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of row  and column");
		int m= sc.nextInt();
		int n= sc.nextInt();
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				//here total 3 logic
				if(i==1||j==1||i==m||j==n||i==j||j==m+1-i){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
			sc.close();
		}
	}
}
