package com.ashish;

public class InterThreadExample extends Thread{
	int amount=10000;  
	  
	synchronized void withdraw(int amount){  
	System.out.println("going to withdraw...");  
	  
	if(this.amount<amount){  
	System.out.println("Less balance; waiting for deposit...");  
	try{wait(5000);}catch(Exception e){}  
	}  
	this.amount-=amount;  
	System.out.println("withdraw completed...");  
	}  
	  
	synchronized void deposit(int amount){  
	System.out.println("going to deposit...");  
	this.amount+=amount;  
	System.out.println("deposit completed... ");  
	notify();  
	}  
	  
	  
	  
	public static void main(String args[]){  
	final InterThreadExample c=new InterThreadExample();  
	new Thread(){  
	public void run(){c.withdraw(15000);}  
	}.start();  
	new Thread(){  
	public void run(){c.deposit(10000);}  
	}.start();  
	  
	} 
}
