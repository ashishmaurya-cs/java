package corejava;
import java.util.Scanner;


public class FactorialRec {
    
    static int fact(int n){
    if(n==0){
    return 1;
    }
    else{
    return(n*fact(n-1));
    }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ener number for finding factorial");
        num = sc.nextInt();
        int f=fact(num);
        System.out.println("Factorial of "+num+"is "+f);
     }
        
                
            
}
