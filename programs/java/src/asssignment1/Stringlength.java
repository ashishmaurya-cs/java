package asssignment1;

import java.util.Scanner;

public class Stringlength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter striong to find out length");
		String s=sc.nextLine();
		int i=0;
		for( char c:s.toCharArray()){
			i++;
		}
		System.out.println("Length of entered styring :-  "+i);
		sc.close();
	}

}
