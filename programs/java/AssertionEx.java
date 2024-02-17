import java.util.*;
class AssertionEx{

public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter ur age");
int age=sc.nextInt();

assert age>=18:"Not Valid";
System.out.println("Value is:"+age);
}
}