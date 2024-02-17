package corejava;

import java.util.Scanner;
public class PrimeNumber {
    
    public static void main(String[] args) {
        int m,n,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered number to be checked");
        n = sc.nextInt();
        m = n/2;
        if(n==0||n==1){
            System.out.println("It is not a prime number");
                    }
        else{
            for(int i=2;i<=m;i++){
        if(n%i==0)
        {
            System.out.println("given number is not a prime number");
        
            flag=1;
            break;
        }
    }
        if(flag==0){
            System.out.println("Given number is a prime number");
        
       }
        }
       }
}
            
