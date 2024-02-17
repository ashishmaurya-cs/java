package com.ashish;



public class ArrayD1 {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};//array declaration , creation and initialization.
		for(int i=0;i<a.length;i++){
			
			System.out.print(a[i] + ", ");//array retrieve
		}
		System.out.println();
		System.out.println("this is put of the for each loop:-");
		for(int j :a){//for each loop
		
			System.out.print(j+ " ");
		}
	}

}
