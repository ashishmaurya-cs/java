package com.ashish;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row and column of first matrix");
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		System.out.println("Enter number of row and column of second matrix");
		int m2=sc.nextInt();
		int n2=sc.nextInt();
		int[][] a=new int[m1][n1];
		int[][] b=new int[m2][n2];
		int[][] c=new int[m1][n2];
		if(n1==m2){
			System.out.println("Enter element of first matrix:-");
			for(int i=0;i<m1;i++){
				for(int j=0;j<n1;j++){
					a[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Enter element of second matrix:-");
			for(int i=0;i<m2;i++){
				for(int j=0;j<n2;j++){
					b[i][j]=sc.nextInt();
				}
			}
			//multiplication
			for(int i=0;i<m1;i++){
				for(int j=0;j<n2;j++){
					for(int k=0;k<n1;k++){
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
				}
			}
			
			System.out.println("Multiplication of matrix:-");
			for(int i=0;i<m1;i++){
				for(int j=0;j<n2;j++){
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
			
		}
		else{
			System.out.println("column of first matrix should be equals to row of second mmatrix");
		}
		sc.close();
	}
	
}
