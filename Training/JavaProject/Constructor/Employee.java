class Employee{
int empId;
String name;

Employee(int empId, String name){

this.empId=empId;
this.name=name;

System.out.println(empId);
System.out.println(name);
}

void display(){
System.out.println("Emp Id is : " +empId);
System.out.println("name is: " +name);
}

public static void main(String args[]){

Employee e1= new Employee (1001, "Kajal");
Employee e2= new Employee (1002, "Vishal");

e1.display();
e2.display();
}
}









