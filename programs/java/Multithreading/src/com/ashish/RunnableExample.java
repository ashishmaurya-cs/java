package com.ashish;

public class RunnableExample implements Runnable {
public void run(){
	System.out.println("Runnable interface example");
}

	public static void main(String[] args) {
		
		Thread t =new Thread(new RunnableExample());
		t.start();

	}

}
