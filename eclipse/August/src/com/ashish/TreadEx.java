package com.ashish;

public class TreadEx  extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++){
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TreadEx t=new TreadEx();
		t.start();
	}

}
