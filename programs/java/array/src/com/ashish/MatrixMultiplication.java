package com.ashish;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of row and column");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] a=new int[m][n];
		int[][] b=new int[m][n];
		int[][] multi=new int[100][100];
		System.out.println("Enter element of matrix a:-");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter element of matrix b:-");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				b[i][j]=sc.nextInt();
			}
		}
			
			//for multiplication
			System.out.println("Multiplication of matrix is :-");
			
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					for(int k=0;k<m;k++){
						multi[i][j]=multi[i][j]+a[i][k]*b[k][j];
					}
				}
			}
			
			//
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					System.out.print(multi[i][j]+" ");
				}
				System.out.println();
			}
		sc.close();

	}

}
