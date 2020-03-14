class Dog{
int age=10;
String color= "brown";

void barks(){
System.out.println("DOG Barks");
}

void run()
{
System.out.println("DOG RUNS");
}
public static void main(String[] args)
{

String s1=args[1];
System.out.println(s1);

Dog d=new Dog();
d.barks();
d.run();
System.out.println("Age of the dog is:" +d.age);
System.out.println("Color of the dog is:" +d.color);
}
}