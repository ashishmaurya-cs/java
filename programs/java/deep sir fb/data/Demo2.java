import java.util.Scanner;

class Student{
	private String name;
	private String roll;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
public class Demo2 {
	static void show(Student std[]){
		for(int i=0;i<std.length;i++){
			Student t=std[i];
			System.out.println(t.getName()+"\t"+t.getRoll()+"\t"+t.getAddress());
		}
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("how many Students u want to enter");
	int size=s.nextInt();
	Student std[]=new Student[size];
	for(int i=0;i<std.length;i++){
		Student ss=new Student();
		System.out.println("enter name");
		String name=s.next();
		System.out.println("enter roll");
		String roll=s.next();
		System.out.println("enter address");
		String address=s.next();
		ss.setName(name);
		ss.setRoll(roll);
		ss.setAddress(address);
		std[i]=ss;
	}
	show(std);
}
}
