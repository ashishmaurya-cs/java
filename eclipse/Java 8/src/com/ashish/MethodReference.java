package com.ashish;


interface Parser{
	String parse(String s);
}

class StringParser{
public 	static String convert(String str){
		if(str.length()<=3){
			str=str.toUpperCase();
		}
		else{
			str=str.toLowerCase();
		}
		return str;
	}
	
}
class Printer{
	public void print(String str,Parser p){
		str=p.parse(str);
		System.out.println(str);
	}
}
public class MethodReference {
	public static void main(String[] args) {
		/*List<Integer> list=Arrays.asList(1,2,7,4,6,7);
		list.forEach(System.out::print);//here we are passing method  of the class 
		//System.out.
*/	
		
	String str="Ashish";
	Printer p=new Printer();
/*	p.print(str, new Parser() {
		
		@Override
		public String parse(String s) {
			return StringParser.convert(str);
		}
	});*/
	//p.print(str,s-> StringParser.convert(str)); lambda expression
	p.print(str, StringParser::convert);//method reference
	}

}
