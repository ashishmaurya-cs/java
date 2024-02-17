package com.ashish;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of row:");
		int m=sc.nextInt();
		System.out.println("Enter no of column:");
		int n = sc.nextInt();
		sc.close();
		for(int i=1;i<=m;i++){
			//this code for print left space.
			for(int j=1;j<=n;j++){
				if(j<=m+1-i){
					
					System.out.print(" ");
				}
				else{
					
					//5
				System.out.print(" ");
				}
			}
			       //this code for left triangle 
					for(int j=1;j<=n;j++){
						if(j>=m+1-i){
							
							System.out.print("*");
						}
						else{
							
							System.out.print(" ");
						}
					}
					
					//this block for right triangle 
					for(int j=1;j<=n;j++){
						if(j<=i-1){
							
							System.out.print("*");
						}
						else{
							
							System.out.print(" ");
						}
					}
			
			System.out.println();
		}	

	}
}
