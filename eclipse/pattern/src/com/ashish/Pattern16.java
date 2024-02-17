package com.ashish;
import java.util.Scanner;
public class Pattern16 {

public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter  number of row");
			int m= sc.nextInt();
			System.out.println("Enter number of column");
			int n= sc.nextInt();
			System.out.println("Hello");
			//int count=97;
		/*	for(int i=1;i<=m;i++){
			
				for(int j=1;j<=n+1;j++){
				
					if(j<=i){
						System.out.print("*");
					}
					else if(j==i+1){
						System.out.print(count);
						count++;
					}
					else{
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}*/
			
			for(int i=1;i<=m;i++){
				for(int j=1;j<=n;j++){
					if(j<=i){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
					
				}
				
				for(int j=2;j<=n;j++){
					if(j>=m+1-i){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
					
				}
				System.out.println();
			}
			
			for(int i=2;i<=m;i++){
				for(int j=1;j<=n;j++){
					if(j<=m+1-i){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
					
				}
				
				for(int j=2;j<=n;j++){
					if(j>=i){
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

