package com.ashish;

import java.util.Scanner;
public class BubbleSort {
	
	public void sort(int[] a){
		int temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Sorted array is:-");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number od element of array..");
		int length=sc.nextInt();
		System.out.println("Enter Array for sorting");
		int[] a =new int[length];
		for(int i=0;i<length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Entered Element are..");
		for(int i=0;i<length;i++){
			System.out.println(a[i]);
		}
		
		BubbleSort b= new BubbleSort();
		b.sort(a);
		sc.close();
	}

}
