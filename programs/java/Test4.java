class Test4{
int i=20;
class T{
int i=2;

void method(){
int i=65;
System.out.println("i am inner class");
System.out.println(i);

 }
}
public static void main(String []j){

System.out.println("welcome in java inner class");
Test4 t=new Test4();
System.out.println(t.i);
T r=t.new T();
System.out.println(r.i);
r.method();
}
}