class Thread2 implements Runnable{

public void run(){
System.out.println("THREAD IS RUNNING.........");
}

public static void main(String args[]){
System.out.println("welcome in  multithreading.");
Thread2 t= new Thread2();
Thread t1=new Thread(t);
t1.start();
}
}