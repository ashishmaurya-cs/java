package com.ashish;

public class TrycatchEx2 {
//in this example arithmetic exception is handled by  ArrayIndexOutOfbound class
	public static void main(String[] args) {
		try {
			int[] a=new int[5];
			a[5]=10;
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			//Arithmetic exception
			//difference is when ,handle other exception the customize messge will not print
			System.out.println("Array index out Of bound Exception Occur..");
		}
	}
}
