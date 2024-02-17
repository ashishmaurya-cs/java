class A
{
void dd(){
System.out.println("hello");
}

}
class B extends A{
void dd(){
System.out.println("hello world");super.dd();
}
public static void main(String[] args)
{
System.out.println("welcome in overriding: ");
A s=new B();
s.dd();
}
}