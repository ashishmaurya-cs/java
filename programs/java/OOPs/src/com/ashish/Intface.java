package com.ashish;
//this is the example of interface.
public interface Intface {
	
	  public abstract  void start();
	  //this is public abstract method automatically,field in interface
	 //public static final.
     //we can use default concrete method in interface.
	 //we can use static concrete method in interface.
}

 class Cars implements Intface{
	 
	public   void start(){
		 
		 System.out.println("Car Start with key..in interface");
	}
 }
 
 class Scooters implements Intface{
	 public void start(){
		 System.out.println("Scooter start with keys...");
		 
	 }
	 public static void main(String []args){	 
	 Cars c = new Cars();
	 Scooters s =new Scooters();
	 c.start();
	 s.start();
    }
}