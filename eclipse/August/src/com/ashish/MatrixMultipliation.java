package com.ashish;

import java.util.Scanner;

public class MatrixMultipliation {
		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			System.out.println("Enter row and column of first matrix :-");
			int m1=s.nextInt();
			int n1=s.nextInt();
			System.out.println("Enter row and column of second matrix :-");
			int m2=s.nextInt();
			int n2=s.nextInt();
			int[][] a =new int[m1][n1];
			int[][] b =new int[m2][n2];
			int[][] mul=new int[m1][n2];
			if(n1==m2){
				System.out.println("enter element of first matrix :-");
				for(int i=0;i<m1;i++){
					for(int j=0;j<n1;j++){
						a[i][j]=s.nextInt();
					}
				}
				System.out.println("enter element of second matrix :-");
				for(int i=0;i<m2;i++){
					for(int j=0;j<n2;j++){
						b[i][j]=s.nextInt();
					}
				}
				
			
				
			}
			else{
				System.out.println("column of first matrix and row of second matrix should be equal");
				
			}
			
		}
}
