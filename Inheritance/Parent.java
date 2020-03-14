class Parent{
 
void pm1(){
System.out.println("in method pm1 of parent class");

}

public static void main(String[] args){
Parent p1= new Parent();
p1.pm1();
}
}

class Child extends Parent{

@Override
void pm1(){
super.pm1();
System.out.println("in method pm2 of child class");
}

void pm2(){
System.out.println("in method pm1 of child class");
}

public static void main(String[] args){

Child c1=new Child();
c1.pm1();
c1.pm2();
}
}

class Grandchild extends Child{
public static void main(String[] args){
Grandchild g=new Grandchild();
g.pm1();
}
}

