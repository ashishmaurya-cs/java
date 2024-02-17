package com.ashish;

public class OverLoading2 {
	
	public void show(){
		System.out.println("Hello everyone");
	}
	
	public void show(String name){
		
		System.out.println("Hello " + name);
	}
	
	public void show(String name,String status){
		if(status.equalsIgnoreCase("Day")){
			System.out.println("Good morning " + name);
		}
		else if(status.equalsIgnoreCase("night")){
			System.out.println("Good night " + name);
		}
	}

}

class M{
	public static void main(String[] arg){
		OverLoading2 o=new OverLoading2();
		o.show();
		o.show("Ashish");
		o.show("Ashish", "Day");
	}
}
