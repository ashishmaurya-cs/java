class Fact{
static int n;
void  method(){
int i;
int f=1;
for(i=1;i<=5;i++)
{
f=f*i;
}
System.out.println(f);
}
public static void main(String []t)
{
 
Fact d=new Fact();
d.method();
}
}