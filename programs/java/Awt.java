import java.awt.*;
class Awt extends Frame{
public Awt(){
setTitle("My Window");
setSize(500,500);
Button b=new Button("click me!");
b.setBounds(20,20,40,50);
add(b);
TextField t= new TextField();

add(t);
}
public static void main(String []p){
Awt a= new Awt();
a.setVisible(true);
System.out.println("Ramashish Maurya");
}
}