package com.ashish;

import java.util.Scanner;

public class ReverseMatrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of row");
		int m=sc.nextInt();
		System.out.println("Enter number of column");
		int n=sc.nextInt();
		int[][] a=new int[m][n];
		int[][] b=new int[n][m];
		System.out.println("Enter element of matrix");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		//for transpose matrix
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				b[j][i]=a[i][j];
			}
		}
		
		//for printing
		System.out.println("Transpose of matrix ;-");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();

	}

}
