
package corejava;


public class Employee {
    
    int id;
    String name;
    float salary;
    
    void insert(int id,String name,float salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
    }
    
    void displayInfo(){
    
        System.out.println(id+" "+name+" "+salary);
    }
    public static void main(String[] args) {
     Employee e1=new Employee();
     Employee e2=new Employee();
     Employee e3=new Employee();
     e1.insert(100, "Golu", 12000);
     e2.insert(101, "Pawan", 13900);
     e3.insert(100, "Shyam", 140000);
     
     e1.displayInfo();
     e2.displayInfo();
     e3.displayInfo();
     
    }
}
