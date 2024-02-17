package com.ashish;

public class AnonymousArray {
	
	static void sum(int[] number){
		int sum =0;
		for(int i:number){
			
			sum = sum+i;
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
			
			AnonymousArray.sum(new int[]{10,20,30,40});//anonymous array example.it is only used for one time.no name
	}

}
