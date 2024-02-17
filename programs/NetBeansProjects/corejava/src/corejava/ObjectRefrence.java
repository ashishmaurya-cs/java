
package corejava;


public class ObjectRefrence {
    int id;
    String name;
    
    public static void main(String[] args) {
        
        ObjectRefrence ob = new ObjectRefrence();
         ObjectRefrence ob1 = new ObjectRefrence();
        ob.id=100;
        ob.name="Ram Ashish Maurya";
        ob1.id=101;
        ob1.name="Ashutosh";
        
        System.out.println(ob.id+" "+ob.name);
        System.out.println(ob1.id+" "+ob1.name);
                
    }
            
    
}
