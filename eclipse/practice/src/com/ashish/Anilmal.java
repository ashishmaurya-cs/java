 package com.ashish;

class Anilmal {
    void eat(){
    	System.out.println("Eating....");
    }
}

class Dog extends Anilmal{
	void bark(){
		System.out.println("Barking...");
	}
}

class BAbyDog extends Dog{
	void weeping(){
		System.out.println("Weeping...");
	}
	public static void main(String[] args) {
		BAbyDog b=new BAbyDog();
		b.bark();
		b.eat();
		b.weeping();
	}
}
