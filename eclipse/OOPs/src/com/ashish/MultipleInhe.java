package com.ashish;
//Multiple inheritance achieved ib java using interface.
 interface MultipleInhe {
	
	void show();

}
interface MultipleInhe2{
	
	void display();
}

class Test implements MultipleInhe,MultipleInhe2{
	
	public void show(){
		
		System.out.println("This is show method...");
	}
	public void display(){
		System.out.println("This is display mehtod...");
		
    }
	
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		t.display();
	}
}
