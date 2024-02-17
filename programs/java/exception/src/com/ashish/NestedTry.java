package com.ashish;

public class NestedTry {
	public static void main(String[] args) {
		try {
			try {
				int a=1/0;
				System.out.println(a);
				
				
			} catch (Exception e) {
				System.out.println("Arithmetic cexception occur ..");
			}
			try {
				int[] b=new int[4];
				b[5]=10;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Arrayindexoutofboundexception.");
			}
			System.out.println("handled...");
		} catch (Exception e) {
			
		}
		System.out.println("Normal flow ");
	}

}
