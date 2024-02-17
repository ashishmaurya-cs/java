class Vehicle{
int a=10;
void  bike(){
System.out.println("This is a bike, Which have two light");
}
}
class Car extends Vehicle{

public static void main(String []args){
Vehicle v = new Car();
v.bike();
}
}