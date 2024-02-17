package com.ashish;

public class Array2D {

	public static void main(String[] args) {
		int[][] a;//this is the 2-D array declaration.
		a = new int[2][3];//this is 2-D array creation.
		a[0][0] = 2;
		a[0][1] = 3;
		a[0][2] = 7;
		a[1][0] = 5;
		a[1][1] = 1;
		a[1][2] = 9;
		for(int i=0;i<2;i++){
		
				for(int j=0;j<3;j++){
					System.out.print(a[i][j]+" ");
				}
		}
		
	}

}
