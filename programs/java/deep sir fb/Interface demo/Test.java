interface V_C{
	void wheel();
}
class Car implements V_C{

	@Override
	public void wheel() {
	System.out.println("4 wheel");
		
	}
	
}
class Bike implements V_C{

	@Override
	public void wheel() {
		System.out.println("2 wheel");
	}
	
}
class U{
	U(V_C v){
		v.wheel();
	}
}
public  class Test {

	public static void main(String[] args) {
Car b=new Car();
		new U(b);
}
}
