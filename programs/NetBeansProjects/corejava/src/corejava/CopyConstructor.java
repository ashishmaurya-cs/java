
package corejava;

public class CopyConstructor {
    int id;
    String name;
    CopyConstructor(int id,String name){
    this.id=id;
    this.name=name;
    }
    
     CopyConstructor(CopyConstructor s){
    this.id=s.id;
    this.name=s.name;
    }
     void display(){
         System.out.println(id+" "+name);
     }
    
    public static void main(String[] args) {
        CopyConstructor c1=new CopyConstructor(100,"atul");
        CopyConstructor c2=new CopyConstructor(c1);
        c1.display();
        c2.display();
    }
            
    
}
