class Ddd {

static int i=10;
}
class Gg extends Ddd{
int i=20;
public static void main(String[] args)
{
int i=30;
Gg s=new Gg();
Ddd e=s;
System.out.println("welcome in access all variable from static method");
System.out.println(i);
System.out.println(s.i);
System.out.println(e.i);
}
}