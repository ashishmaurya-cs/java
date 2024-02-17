class CallConstructor{
int x;

CallConstructor(int x){
this();
System.out.println("This is first Constructor."+x);

}

CallConstructor(){
System.out.println("this is second constructor");
}

public static void main(String[]args){
CallConstructor a= new CallConstructor(7);
}

}