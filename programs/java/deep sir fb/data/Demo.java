import java.util.Scanner;

public class Demo {
	static void show(int [] k){
		for(int i=0;i<k.length;i++){
			System.out.println(k[i]);
		}
	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("how many number u want to enter");
	int size=s.nextInt();
	int [] i=new int[size];
	for(int j=0;j<size;j++){
		System.out.println("enter " + (j+1) +" num");
		i[j]=s.nextInt();
	}
	show(i);
	
}
}
