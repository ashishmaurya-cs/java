package com.ashish;

public class Array2D2 {
	
	public static void main(String[] args) {
		/*int[][] a = new int[2][];  //Gagged array...
		
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[4];*/
		
		int[][] a = {{10,20,30},{40,50},{60,70,80}};
		
		for(int i=0;i<3;i++){
				
				for(int j=0;j<a[i].length;j++){
					
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
		}
		
		
	}

}
