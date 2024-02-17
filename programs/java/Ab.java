interface InterfaceTest{
 //default void run()
static void run(){
System.out.print("Hello ,I am Running.."); 
}
}

class Ab implements InterfaceTest{
public static void main(String[] args){

InterfaceTest.run();
}
}