package com.ashish;

import java.util.Scanner;

public class Pattern23 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row and column");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(j<=m+1-i){
					System.out.print(m+1-j+" ");
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