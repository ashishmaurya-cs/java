import java.util.Scanner;

class Student{
	private String name;
	private int roll;
	private String address;
		

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	}
	
public class Array {
void show(Student...s){
	for(int i=0;i<s.length;i++){
		Student t=s[i];
		System.out.println(t.getName()+"\t"+t.getAddress()+"\t"+t.getRoll());
	}
	
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number of student!!");
	int size=s.nextInt();
	Student data[]=new Student[size];
	for(int i=0;i<size;i++){
		Student ss=new Student();
		System.out.println("enter "+(i+1) +" name");
		String name=s.next();
		ss.setName(name);
		System.out.println("enter " +(i+1)+" rollno");
		int roll=s.nextInt();
		ss.setRoll(roll);
		System.out.println("enter "+(i+1)+" Address");
		String Address=s.next();
		ss.setAddress(Address);
		data[i]=ss;
	}
	Array a=new Array();
	a.show(data);
}
}
