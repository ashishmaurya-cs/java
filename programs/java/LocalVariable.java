class LocalVariable{

int add(int i,int j){
int m= i+j;
return m;
}

public static void main(String[] args)
{
LocalVariable l = new LocalVariable();
l.add(1,4);
System.out.println(m);  //here run timr error coz wan tto access local variable outsude of method.
}
}