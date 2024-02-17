import myvoting.Voting;
import java.util.Scanner;

public class VotingMain {
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter gender and age to check eligibility");
String gender=sc.next();
int age=sc.nextInt();

Voting v= new Voting();
v.checkEligibility(gender,age);
}
}