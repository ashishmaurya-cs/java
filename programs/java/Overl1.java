import java.util.Scanner;
class Overl1{

void show(int a){
System.out.println(a);
}

void show(float t)
{
System.out.println(t);
}


void show(String s)
{
System.out.println(s);
}

public static void main(String []i)
{
Over1 o=new Over1();
Scanner s=new Scanner(System.in);
System.out.println("welcome in overloading:");
System.out.println("press 1 for print  int:");
System.out.println("press 2 for print float:");
System.out.println("press 3 for print your name:");
System.out.println("enter your choice:");
int choice=s.nextInt();

switch(choice){
case 1:
{

System.out.println("enter integer number:");
int a=s.nextInt();
o.show(a);
break;
}

case 2:
{
System.out.println("enter float number:");
float t=s.nextFloat();
o.show( t);
break;
}

case 3:
{
System.out.println("enter your name:");
String d=s.next();
o.show(d);
break;
}

default:
{
System.out.println("wrong choice:-");
}
}

}
}