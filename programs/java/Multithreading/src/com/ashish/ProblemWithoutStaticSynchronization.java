package com.ashish;

class PTable{

		 synchronized  void printTable(int n){
		   for(int i=1;i<=10;i++){
		     System.out.println(n*i);
		     try{
		       Thread.sleep(400);
		     }catch(Exception e){}
		   }
		 }
		}

		class MyThread1 extends Thread{
			PTable t;
			MyThread1(PTable t){
				this.t=t;
			}
		public void run(){
		t.printTable(5);
		}
		}

		class MyThread2 extends Thread{
			PTable t;
			MyThread2(PTable t){
				this.t=t;
			}
		public void run(){
		t.printTable(10);
		}
		}

		class MyThread3 extends Thread{
			PTable t;
			MyThread3(PTable t){
				this.t=t;
			}
		public void run(){
		t.printTable(17);
		}
		}




		class MyThread4 extends Thread{
			PTable t;
			MyThread4(PTable t){
				this.t=t;
			}
		public void run(){
		t.printTable(19);
		}
		}
		
		
		public class ProblemWithoutStaticSynchronization {
		
		public static void main(String t[]){
			PTable obj=new PTable();//here is two table of shared resource
			PTable obj1=new PTable();
		MyThread1 t1=new MyThread1(obj);//t1 and t3 interfere to each other
		MyThread2 t2=new MyThread2(obj);
		MyThread3 t3=new MyThread3(obj1);//t2 and t4 interfere to each other
		MyThread4 t4=new MyThread4(obj1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		}
		}



