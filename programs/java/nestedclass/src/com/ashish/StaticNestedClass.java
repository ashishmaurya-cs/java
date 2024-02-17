package com.ashish;

public class StaticNestedClass {
	private static int num=100;
	//inner class can't access the non-static member of outer class.
	static class Inner{
		void display(){
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		StaticNestedClass.Inner inner=new StaticNestedClass.Inner();
		inner.display();
	}

}
