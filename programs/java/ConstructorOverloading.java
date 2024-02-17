class ConstructorOverloading{
int id;
String name;
int age;

ConstructorOverloading(int id,String name){
this.id=id;                                         //it is example of constructor overloading.
this.name=name;
}

ConstructorOverloading(int id,String name,int age){
this.id=id;
this.name=name;
this.age=age;
}

void display(){
System.out.println(id+" "+name+" "+age);
}

public static void main(String[] args){
ConstructorOverloading c1=new ConstructorOverloading(100,"Ajay");
ConstructorOverloading c2=new ConstructorOverloading(101,"Atul",22);
c1.display();
c2.display();
}
}