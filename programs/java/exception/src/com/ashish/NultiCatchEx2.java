package com.ashish;

public class NultiCatchEx2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Parent exception occurs..");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
