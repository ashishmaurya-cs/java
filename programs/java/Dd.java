class Dd {

static int i=20;
int j=20;
public static void main(String[]p)
{
int i=30;
Dd s=new Dd();
System.out.println("welcome in access all variable from static method");
System.out.println(i);
System.out.println(s.i);
System.out.println(Dd.i);
}
}