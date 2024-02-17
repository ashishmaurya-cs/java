class Thread1 extends Thread{

public void run(){
System.out.println("THREAD IS RUNNING.........");
}

public static void main(String args[]){
System.out.println("welcome in  multithreading.");
Thread1 t= new Thread1();
t.start();
}
}