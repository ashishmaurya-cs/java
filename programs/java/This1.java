class This1{

void show(){
System.out.println(this);
}
public static void main(String[] i){
This1 a=new This1();
System.out.println(a);
a.show();
}
}