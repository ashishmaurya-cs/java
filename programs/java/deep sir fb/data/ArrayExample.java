import java.util.Scanner;

public class ArrayExample {
	//var args
	static void add(Student ...s){
		int temp=0;
		for(int i=0;i<s.length;i++){
			Student t=s[i];
			System.out.println(t.getName()+"\t"+t.getRoll());	
		}
		
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter size of  number of students");
	int size=s.nextInt();
	Student data[]=new Student[size];
	
	for(int i=0;i<size;i++){
		Student ss=new Student();
		System.out.println("enter name of student");
		ss.setName(s.next());
		System.out.println("enter roll of student");
		ss.setRoll(s.next());
		System.out.println("enter address of student");
		ss.setAddress(s.next());
		data[i]=ss;
		
	}
	
	add(data);
	
	
	
	
	
}
}
