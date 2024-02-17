import java.util.Scanner;


public class TestArray {

	static void show(Person p[]){
		for(int i=0;i<p.length;i++){
			Person pp=p[i];
			System.out.println("person name is : " +pp.getName());
			Address a=pp.getAddress();
			System.out.println(a.getStreet()+"\t"+a.getPincode());
			Certificate cc[]=pp.getCerti();
			for(int j=0;j<cc.length;j++){
				Certificate c=cc[j];
				System.out.println(c.getName()+"\t"+c.getYear());
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter length of persons");
		int size=s.nextInt();
		Person persons[]=new Person[size];
		
		for(int i=0;i<size;i++){
			System.out.println("enter name");
			String name=s.next();
			System.out.println("enter street number");
			String street=s.next();
			System.out.println("enter pincode number");
			String pincode=s.next();
			System.out.println("how many certi u have ?");
			int certi_size=s.nextInt();
			Certificate c[]=new Certificate[certi_size];
			for(int j=0;j<c.length;j++){
				System.out.println("enter " + (j+1) + " certificate name");
				String c_name=s.next();
				System.out.println("enter " + (j+1) + " certificate year");
				String c_year=s.next();
			    Certificate cc=new Certificate();
			    cc.setName(c_name);
			    cc.setYear(c_year);
			    c[j]=cc;
			}
			Address a=new Address();
			a.setStreet(street);
			a.setPincode(pincode);
			
			Person p=new Person();
			p.setName(name);
			p.setAddress(a);
			p.setCerti(c);
			
			persons[i]=p;
			
		}
		
		show(persons);
		
	}
}
