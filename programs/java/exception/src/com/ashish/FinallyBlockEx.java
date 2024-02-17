package com.ashish;

public class FinallyBlockEx {
	//exception occur but not handled.
	public static void main(String[] args) {
		/*try{
			int data =10/0;
			System.out.println(data);
		}
		finally {
			System.out.println("this is the finallly block ");
		}
		*/
		
		try{
			
			///here exception occur but handled by catch block
			//finally block is used for closing connection 
			int data=10/0;
			System.out.println(data);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		//finally is not executed if System.exits is called.
		finally {
			System.out.println("Finally blockis executed ..");
		}
	}

}
