package com.ashish;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No. of row");
		int m=sc.nextInt();
		System.out.println("Enter no. of column");
		int n= sc.nextInt();
		int[][] a=new int[m][n];
		int[][] transpose =new int[n][m];
		System.out.println("Enter Element of matraix");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt(); 
			}
		}
		
		//display entered element
		System.out.println("Entered element of matrix");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
		//transpose of matrix
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				transpose[j][i]=a[i][j];
			}
		}
		
		//display transpose matrix
		System.out.println("Transpose of matrix is:-");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
