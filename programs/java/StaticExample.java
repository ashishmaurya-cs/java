class StaticExample{
static int count = 100;
static int i= 10;
void kitchen(){

System.out.println(count++);
}
 static void too(){
kitchen();
}//here show run time error coz static method want to accesss data from non-static method whithout create object of the class

public static void main(String[] args){
StaticExample ob = new StaticExample();
ob.kitchen();

}
}