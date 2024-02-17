class InvokeMethod{
void monu(){
System.out.println("Hello, this is monu.");
}

void sonu(){
System.out.println("Hello,This is sonu.");
this.monu();
}
public static void main(String[]args){
InvokeMethod i=new InvokeMethod();
i.sonu();
}
}