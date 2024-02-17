package com.ashish;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] ar=new int[3][];
		ar[0]=new int[2];
		ar[1]=new int[5];
		ar[2]=new int[3];
		int count=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<ar[i].length;j++){
				ar[i][j]=count++;
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.print(" "+ar[i][j]);
			}
			System.out.println();
		}

	}

}
