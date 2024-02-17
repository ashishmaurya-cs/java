package com.ashish;

class Simple1 extends Thread{  
	 public void run(){  
	   System.out.println("First TAsk : "+"Ashish");  
	 }  
	}  
	  
	class Simple2 extends Thread{  
	 public void run(){  
	   System.out.println("Second Task : "+"Maurya");  
	 }  
	}  
	  
	public  class TwoTaskByTwoThread{  
	 public static void main(String args[]){  
	  Simple1 t1=new Simple1();  
	  Simple2 t2=new Simple2();  
	  
	  t1.start();  
	  t2.start();  
	 }  
	} 
