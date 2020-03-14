class Calculator{

void add(){
int a=10;
int b=20;
int c=a+b;
System.out.println("sum is  "+c);
}

void add1(int x, int y){
int z=x+y;
System.out.println("sum in add1 is "+z);
}

int add2(int d, int e){
int g=d+e;
System.out.println("sum in add2 is "+g);
return g;
}

String Display(){
String name="Selenium";
String name1="java";
String name2= name+ " " +name1;
System.out.println(name2);
return name2;
}

String Display1(){
char name='S';
char name1='J';
String nam2=name+ " " +name1;
System.out.println(nam2);
return nam2;
}

public static void main(String args[]){
Calculator c=new Calculator();
c.add();
c.add1(20,30);
c.add2(30,40);

int sum= c.add2(40,50);
System.out.println("sum returned:"  +sum);
sum=sum+100;
System.out.println("sum returned after adding 100:"  +sum);

String s=c.Display();
System.out.println(s);
c.Display1();

}
}