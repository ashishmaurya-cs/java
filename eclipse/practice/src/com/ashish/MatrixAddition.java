package com.ashish;

import java.util.Scanner;

public class MatrixAddition {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of row first matrix");
		int m1= sc.nextInt();
		System.out.println("Enter number of column first matrix");
		int n1=sc.nextInt();
		int[][] a=new int[m1][n1];
		System.out.println("Enter number of row Second matrix");
		int m2= sc.nextInt();
		System.out.println("Enter number of column second matrix");
		int n2=sc.nextInt();
		int[][] b=new int[m2][n2];
		int[][] sum=new int[m1][n1];
		
		System.out.println("Enter element of first matrix:-");
		for(int i=0;i<m1;i++){
			for(int j=0;j<n1;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter element of Second matrix:-");
		for(int i=0;i<m1;i++){
			for(int j=0;j<n1;j++){
				b[i][j]=sc.nextInt();
			}
		}
		
	
		for(int i=0;i<m1;i++){
			for(int j=0;j<n1;j++){
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Sum of Matrix of a and b is:- ");
		for(int i=0;i<m1;i++){
			for(int j=0;j<n1;j++){
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
