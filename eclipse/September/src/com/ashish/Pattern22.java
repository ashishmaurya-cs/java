package com.ashish;

import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of row and column :-");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(j<=i){
					System.out.print(j+" ");
				}
				else{
					System.out.print("");
				}
			}
			
			for(int j=2;j<=n;j++){
				if(j<=i){
					System.out.print(i+1-j+" ");
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
