
package corejava;


public class ObjectMethod {
    int id;
    String name;
   void insertRecord(int id,String name){ 
       this.id = id;
       this.name = name;
   }
   
   void displayRecord(){
   
       System.out.println(id+" "+name);
   }
    
    public static void main(String[] args) {
        ObjectMethod s1=new ObjectMethod();
        ObjectMethod s2=new ObjectMethod();
        s1.insertRecord(100,"Ram Ashish Maurya");
        s2.insertRecord(101,"Ashutosh");
        s1.displayRecord();
        s2.displayRecord();
        
        
    }
}
