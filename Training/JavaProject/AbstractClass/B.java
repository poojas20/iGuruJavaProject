abstract class A{
abstract public void m1();//abstract methods
abstract public void m2();

//non abstract method-method with a body
public void m3(){
System.out.println("this is a method with body");
}
}

class B extends A{
public void m2(){
System.out.println("this is m2 method in class B");
}

public void m1(){
System.out.println("B's implementation of m1");
}

public static void main(String[] args){
B b=new B();
b.m1();
b.m2();
b.m3();

}
}