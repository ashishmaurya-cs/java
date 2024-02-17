class Sum{

public static void main(String[] args){

String a = args[0];
String b = args[1];
float i = Float.parseFloat(a);
float j = Float.parseFloat(b);
Add(i,j);
}

static void Add(float i, float j){
float m= i+j;
System.out.println(m);
}
}