
import java.util.Arrays;
public class Test22{


void isPalindrome(String s){
String[] ss = s.split("\\s");
String[] original=ss;
String[] rev=new String[original.length];
int j=original.length;
for(int i=0;i<original.length;i++){
rev[j-1]=ss[i];
j--;
}


if(Arrays.equals(rev,original)){
System.out.println("It is a palindrome");
}
else{
System.out.println("Not a palindrome");
}

}


void checkDuplicate(String s){
int firstCounter=1;
char[] chrs=s.toLowerCase().replaceAll(" " ,"").toCharArray();
	for(int i=chrs.length-1;i>=0;i--){
	int count =0;
	for(int j=i-1;j>=0;j--){
		if(chrs[i]==chrs[j]){
			count++;
			chrs[j]=' ';
			break;
		
		}
	}
	if(firstCounter==1&&count>0){
	System.out.println(chrs[i]);
firstCounter++;
	}
	}
}

void print(){
for(int i=1;i<=50;i++){

		if((i%3==0)&&(i%5==0)){
			System.out.println("Ashish");
		}
		else if(i%5==0){
			System.out.println("Mandeep");
		}

		else if(i%3==0){
			System.out.println("Friends");
		}

		else{
			System.out.println(i);
		}
}

	}

public static void main(String[] args){
Test22 t=new Test22();

t.isPalindrome("anna ha anna");
t.checkDuplicate("Ashish maurya Ashish Ajeet Anoop Ajeet");
t.print();

}
}