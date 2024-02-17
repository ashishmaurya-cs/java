package myvoting;

public class Voting{

public void checkEligibility(String gender,int age){

if(age>=18){	
		
		if(gender.equalsIgnoreCase("M")&&age>=21){
		System.out.println("Male are eligible to vote");
		}
		else{
		if(gender.equalsIgnoreCase("F")&&age>=18){
		System.out.println("Female are eligible to vote");
		}
		else{
		System.out.println("You can't vote");	
		}
		
		}

	}
	else{
	System.out.println("You are not eligible for voting");
	}
}

}