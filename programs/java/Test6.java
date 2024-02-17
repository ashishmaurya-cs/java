class Test6{

public static void main(String []p){
System.out.println ("this is the example of  LOCAL inner  classs");
int i=30;
  class F{
int i=50;
void local(){
int i=100;
System.out.println(i);
System.out.println(this.i);//int i=30; can't access in  local method
}
}
F f=new F();
f.local();

}
}