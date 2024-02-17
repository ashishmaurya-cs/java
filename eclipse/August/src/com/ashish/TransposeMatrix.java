package com.ashish;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number of row and column:-");
		int m=s.nextInt();
		int n=s.nextInt();
		
		int[][] a=new int[m][n];
		int[][] transpose=new int[n][m];
		
		System.out.println("Enter element of matrix :-");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Entered MAtrix is :-");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//for transpose
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				transpose[j][i]=a[i][j];
			}
		}
		
		System.out.println("Transposed Matrix is :-");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
		s.close();
	}
}
