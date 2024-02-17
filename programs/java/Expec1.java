class Excep1{
static int k=50;
void method(){
int l=30;
System.out.println(l);
}

public static void main(String []p){
System.out.println("this is also example of null mpointer exception :");
Excep1 e=null;
System.out.println(e.k);
e.method();
}
}