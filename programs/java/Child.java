import java.util.Scanner;
class Parent{
String name;
public Parent(String n){
name=n;

}
}
class Child extends Parent{
String  name;
Child(String n,String p){
super(p);
name=n;

}
public static void main(String[] k){
Scanner s=new Scanner(System.in);
System.out.println("enter parent name:");
String pname=s.next();
System.out.println("enter child  name:");
String cname=s.next();
System.out.println("child name:"+" "+cname);System.out.println(" parent name:"+" "+pname );

}
}