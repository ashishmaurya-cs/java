import java.util.Scanner;
class Ramcal{

static String text;

public static void main(String []x)
{
System.out.println("This is ex.of agregation using property of calculator!!");
int i,j;
Calculator t=new Calculator();//by using agregation
Scanner s=new Scanner(System.in);
do{
System.out.println("press 1 for addtion:");
System.out.println("press 2 for subtraction:");
System.out.println("press 3 for multiplication:");
System.out.println("enter your choice:");
int choice=s.nextInt();

switch(choice){

case 1:
System.out.println("enter first number:");
i=s.nextInt();
System.out.println("enter second number:");
j=s.nextInt();
t.add(i,j);
break;

case 2:
System.out.println("enter first number:");
i=s.nextInt();
System.out.println("enter second number:");
j=s.nextInt();
t.sub(i,j);
break;

case 3:
System.out.println("enter first number:");
i=s.nextInt();
System.out.println("enter second number:");
j=s.nextInt();
t.mul(i,j);
break;

default:
System.out.println("wrong choice:");
break;
}
System.out.println("you want to continue....? y/n");
text=s.next();
}while(text.equalsIgnoreCase("y"));
System.out.println("Thanks for visit here:");
}
}