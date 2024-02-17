package com.ashish;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of row and column :-");
		int m= sc.nextInt();
		int n= sc.nextInt();
		int[][] a = new int[m][n];
		int[][] b = new int[m][n];
		int[][] c = new int[m][n];
		
		System.out.println("Enter element of first matrix :-");
		for(int i=0;i<m;i++){
			 for(int j=0;j<n;j++){
				 a[i][j] = sc.nextInt();
			 }
		}
		
		System.out.println("Enter element of second matrix :-");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				b[i][j]=sc.nextInt();
			}
		}
		
		//Entered matrix element are 
		System.out.println("Entered element of first MAtrix:-");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Entered element of second MAtrix:-");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Press any number to see result:-");
		int z=sc.nextInt();
		System.out.println("Press  number is :-"+z);
		System.out.println("Matrix after adddition is :-");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}

