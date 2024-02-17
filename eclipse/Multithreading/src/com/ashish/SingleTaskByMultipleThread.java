package com.ashish;

public class SingleTaskByMultipleThread extends Thread{
	public void run(){
		for(int i=0;i<4;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		Thread t1=new Thread(new SingleTaskByMultipleThread());
		Thread t2=new Thread(new SingleTaskByMultipleThread());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();
	}

}
