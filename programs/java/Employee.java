class Employee {
float salary = 40000.0f;
}

class Programmer extends Employee{

public static void main(String []args){

int bonus = 2000;
Programmer p = new Programmer();

System.out.println("Programmer salary is :" + p.salary);
System.out.println("Bonus of programmer is  :" + p.bonus);
}
}