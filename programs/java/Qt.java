class Qq{
static int j=500;
int i=1000;
}

class Qt extends Qq{
int i=105096;
void show(){
int i=10;
System.out.println(i);
System.out.println(this.i);
System.out.println(super.i);
System.out.println(Qq.j);

}
public static void main(String[] o)
{
System.out.println("here use of this and super keyword:");
Qt a=new  Qt();
a.show();


}
}