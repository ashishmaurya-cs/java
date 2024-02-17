package com.ashish;
class PTTable{

	 synchronized static  void printTable(int n){
	   for(int i=1;i<=10;i++){
	     System.out.println(n*i);
	     try{
	       Thread.sleep(400);
	     }catch(Exception e){}
	   }
	 }
	}

	class MThread1 extends Thread{
	public void run(){
		PTTable.printTable(5);
	}
	}

	class MThread2 extends Thread{
	public void run(){
		PTTable.printTable(10);
	}
	}

	class MThread3 extends Thread{
		
	public void run(){
		PTTable.printTable(17);
	}
	}




	class MThread4 extends Thread{
	public void run(){
		PTTable.printTable(19);
	}
	}

public class StaticSynchronoization {
	public static void main(String t[]){
	MThread1 t1=new MThread1();
	MThread2 t2=new MThread2();
	MThread3 t3=new MThread3(); 
	MThread4 t4=new MThread4();
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}
}
