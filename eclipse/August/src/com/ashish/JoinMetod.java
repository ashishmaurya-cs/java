package com.ashish;

public class JoinMetod  extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++){
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	public static void main(String[] args) {
		JoinMetod j=new JoinMetod();
		JoinMetod j1=new JoinMetod();
		j.start();
		try {
			j.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j1.start();
	}
}
