package com.ashish;

import java.util.Scanner;

public class UserInput2D {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of row ");
		int m= sc.nextInt();
		System.out.println("Enter number of the column:");
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		System.out.println("Enter the element of the array");
		//for loop to input array.
				for(int i=0;i<m;i++){
						
						for(int j=0;j<n;j++){
							a[i][j] = sc.nextInt();
						}
					
				} 
				//for loop to retrieve data of array
				System.out.println("Entered element are:-");
				for(int i=0;i<m;i++){
					
						for(int j=0;j<n;j++){
							
							System.out.print(a[i][j] +" ");
						}
						System.out.println();
				}
				sc.close();
		

	}

}
