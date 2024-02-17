package com.ashish;

class Bank{
	int getInterest(){
		return 0;
	}
}

class Canara extends Bank{
	int getInterest(){
		return 5;
		
	}
}

class Central extends Bank{
	int getInterest(){
		System.out.println();
		return 4;
	}
}
public  class OverridinBank {
public static void main(String[] args) {
	Central c=new Central();
	Canara c1= new Canara();
	System.out.println("Central bank interest"+c.getInterest());
	System.out.println("Canara bank interest"+c1.getInterest());
}
	
}
