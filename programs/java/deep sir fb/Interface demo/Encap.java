class Student{
	private int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


public class Encap {
public static void main(String[] args) {
Student s=new Student();
s.setRoll(123);
s.setName("deep singh");
System.out.println(s.getName());
}
}







