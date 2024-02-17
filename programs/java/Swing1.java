import java.util.Scanner;
import java.io.File;
public class Swing1{

public static void main(String []e){
Scanner s=new Scanner(System.in);
System.out.println("Enter folder name");
String frame =s.next();
File f= new File("e:\\"+frame);

f.mkdir();
}
}