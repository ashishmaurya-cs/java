package com.ashish;
import java.util.Scanner;
public class HighestElement {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter number of element ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter element of array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int high=a[0];
		for(int i=1;i<n;i++){
			if(a[i]>high){
				high=a[i];
			}
		}
		System.out.println("Highest number of entered array = "+high);
		sc.close();
	}
}
