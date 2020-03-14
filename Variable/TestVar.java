class TestVar{

int i; //instance/non static variable
static int j; 

public static void main(String args[]){

TestVar test1= new TestVar();
TestVar test2= new TestVar();

System.out.println(test1.i);
System.out.println(test2.i);

test1.i=10;
test2.i=20;

System.out.println(test1.i);
System.out.println(test2.i);

System.out.println(TestVar.j);
System.out.println(TestVar.j);

TestVar.j=30;
TestVar.j=40;

System.out.println(TestVar.j);
System.out.println(TestVar.j);

System.out.println(j);
System.out.println(TestVar.j);

}
}