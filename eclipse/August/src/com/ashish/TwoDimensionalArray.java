package com.ashish;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter number of row and column");
	 int m=sc.nextInt();
	 int n=sc.nextInt();
	 int[][] a= new int[m][n];
	 System.out.println("Enter element of array :-");
	 for(int i=0;i<m;i++){
		 for(int j=0;j<n;j++){
			 a[i][j]=sc.nextInt();
		 }
	 }
	 
	 //Entered element are 
	 System.out.println("Entered element are :-");
	 for(int i=0;i<m;i++){
		 for(int j=0;j<n;j++){
			 System.out.print(a[i][j]+" ");
		 }
		 System.out.println();
	 }
	 
	}
}
