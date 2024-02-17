
package corejava;


public class CopyWithoutConstructor {
    int id;
    String name;
    CopyWithoutConstructor(int id,String name){
    this.id=id;
    this.name=name;
    }
       CopyWithoutConstructor(){
       }
    void display(){
        System.out.println(id+" "+name);
    }
    
    public static void main(String[] args) {
        CopyWithoutConstructor c1=new CopyWithoutConstructor(100,"Aryan");
        CopyWithoutConstructor c2=new CopyWithoutConstructor();
        c2.id=c1.id;
        c2.name=c1.name;
        c1.display();
        c2.display();
        
    }
}
