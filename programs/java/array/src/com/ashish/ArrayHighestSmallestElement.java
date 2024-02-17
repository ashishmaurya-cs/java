package com.ashish;

import java.util.Scanner;

public class ArrayHighestSmallestElement {
	
	int highest(int[] array,int n){
		for(int i=0;i<n;i++){
			int temp;
			for(int j=i+1;j<n;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array[n-1];
	}
	
	int smallest(int[] array,int n){
		for(int i=0;i<n;i++){
			int temp;
			for(int j=i+1;j<n;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array[0];
	}
	
	public static void main(String [] args){
		int[] array=new int[100];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  number of element of array");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		ArrayHighestSmallestElement arrayHighestSmallestElement=new ArrayHighestSmallestElement();
		System.out.println("Smallest number is : "+arrayHighestSmallestElement.smallest(array,n));
		System.out.println("Largest number is : "+arrayHighestSmallestElement.highest(array,n));
	sc.close();
	}
	

}
