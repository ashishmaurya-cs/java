import java.util.Scanner;
class Facto{
 static int n;
static String g;

void  fact(int n){
int i,f=1;
for(i=n;i>=1;i--)
{
f=f*i;
}
System.out.println("Factorial is :"+f);

}


public static void main(String []k){
Facto t=new Facto();
Scanner s=new Scanner(System.in);
System.out.println("welcome in Factorial world:\n");
do
{
System.out.println("enter number to find out factorial:\n");
 n=s.nextInt();
t.fact(n);
System.out.println("do you want continue.....?y/n");
g=s.next();  
}while(g.equalsIgnoreCase("y"));
System.out.println("Thanks for visit here!");
}

}