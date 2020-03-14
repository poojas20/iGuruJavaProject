package Module1;

public class A{

public int i=10;

private void m1(){
System.out.println("in method m1 of class A");
}

public static void main(String args[]){

A a= new A();
System.out.println(a.i);
a.m1();
}

}