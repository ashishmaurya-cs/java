class ThisK{
String name;
int n;
    ThisK(){
this("maurya");
System.out.println("Default!");
   }
  ThisK(String name){

 System.out.println("Ramashish ");
}

 ThisK(int n){
this();
System.out.println(n);
}
public static void main(String []w)
{
System.out.println("This is the example of this constructor!!!");
new ThisK(4);
}
}