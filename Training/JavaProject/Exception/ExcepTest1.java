class ExcepTest1{

void m1(){
int a[]= new int[2];
	try{

		String s1=null;
		int i=10/0;
		s1.toString();
		System.out.println("Access element three:" +a[32]);
		System.out.println("out of the block");
	}

 /*catch(ArithmeticException e){
 System.out.println("Arithmetic Exception thrown:" +e);
 e.printStackTrace();	
 }

 catch(NullPointerException e){
 System.out.println("Null Exception thrown:" +e);
 e.printStackTrace();
 }

 catch(ArrayIndexOutOfBoundsException e){
 System.out.println("Index Exception thrown:" +e);
 e.printStackTrace();
 }

catch(Exception e){
e.printStackTrace();
System.out.println("Exception thrown:" +e);
}*/

	finally{
	a[0]=6;
	System.out.println("first element value:" +a[0]);
	System.out.println("the finally statement is executed");
	}
}

public static void main(String args[]){
	ExcepTest1 e1=new ExcepTest1();
	e1.m1();
	System.out.println("after calling m1");	

}

}
