class ExcepTest{

void m1(){

int a[]= new int[2];
String s1=null;
//int i=10/0;
//s1.toString();
System.out.println("Access element three:" +a[32]);
System.out.println("out of the block");

}

public static void main(String args[]){
	ExcepTest e1=new ExcepTest();
	e1.m1();
	System.out.println("after calling m1");	

}

}
