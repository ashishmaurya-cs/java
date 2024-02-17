package com.ashish;

public class TryCatchNull {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Null pointer exception occur..");
		}

}
}
