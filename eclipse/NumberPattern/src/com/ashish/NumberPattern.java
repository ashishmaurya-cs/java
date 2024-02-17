package com.ashish;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row and column:-");
		int m=sc.nextInt();
		int n =sc.nextInt();
		int count =m;
		for(int i=1;i<=m;i++){
			for (int j=1;j<=n;j++){
				if(j<=m+1-i){
					System.out.print(" "+count);
				}
				else{
					System.out.print("  ");
				}
			}
			
			for (int j=2;j<=n;j++){
				if(j>=i){
					System.out.print(" "+count);
				}
				else{
					System.out.print("  ");
				}
			}
			count--;
			System.out.println();
	
		}
sc.close();
	}

}
