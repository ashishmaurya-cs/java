class Counter2{

static int count=0;

Counter2(){
count++;
}

void show(){
System.out.println(count);
}

public static void main(String[] args){
Counter2 c1=new Counter2();
Counter2 c2=new Counter2();
Counter2 c3=new Counter2();
Counter2 c4=new Counter2();
Counter2 c5=new Counter2();
c1.show();
c2.show();
c3.show();
c4.show();
c5.show();
}
}