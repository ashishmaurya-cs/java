class Counter1{
int count=0;

Counter1(){

count++;}

void show(){
System.out.println(count);
}

public static void main(String[] args){
Counter1 c1=new Counter1();
Counter1 c2=new Counter1();
Counter1 c3=new Counter1();
c1.show();
c2.show();
c3.show();
}
}