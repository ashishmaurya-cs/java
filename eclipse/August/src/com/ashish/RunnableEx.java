package com.ashish;



public class RunnableEx  implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	
	 public static void main(String[] args) {
		RunnableEx e=new RunnableEx();
		Thread t=new Thread(e);
		t.start();
	}
}
