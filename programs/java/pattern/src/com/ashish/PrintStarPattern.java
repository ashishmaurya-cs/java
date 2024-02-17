package com.ashish;

public class PrintStarPattern {
	public static void main(String[] args){
		int n=1;
		for(int i=1;i<=3;i++){
			
			for(int j=1;j<=i+1;j++){
				if(j!=i+1){
					System.out.print("*");
				}
				else{
					System.out.print(n);
					n++;
				}
			}
			System.out.println();
		}
	}
	
	
}
