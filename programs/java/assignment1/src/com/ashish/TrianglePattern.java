package com.ashish;

import java.util.Scanner;

public class TrianglePattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of row and column :-");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(i==m||j==m+1-i){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			
			for(int j=2;j<=n;j++){
				if(i==j||i==m){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
