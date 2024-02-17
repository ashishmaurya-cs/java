package com.ashish;

public class TryCatchEx1 {
	public static void main(String[] args) {
		try {
			int i=0;
			int j=0;
			System.out.println(i/j);
			//message is not printed coz exception is occur in try block,
			//when exception occur rest of  code of try block is not executed.
			System.out.println("This message will not printed.");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
