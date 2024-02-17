package com.ashish;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row and column of matrix");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] a = new int[m][n];
		int[][] b= new int[m][n];
		int[][] sum= new int[m][n];
		System.out.println("Enter Element of first matrix");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		//second matrix 
		
		System.out.println("Enter element of second matrix");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				b[i][j]=sc.nextInt();
			}
		}
		
		//for addition
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Result of Addition of matrix is -");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
