package corejava;

import java.util.Scanner;

public class Palindrome {
    

 
    public static void main(String[] args) {
        String s,reverse ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to be checked");
        s = sc.nextLine();
        int length = s.length();
        for(int i=length-1;i>=0;i--){
            
            reverse= reverse+s.charAt(i);
            
        }
        if(s.equals(reverse)){
            System.out.println("Given String is a palindrome");
                    
        }
        else
            System.out.println("Givne number is not a palindrome");
        
    }
    
}
