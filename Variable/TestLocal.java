class TestLocal{

int age=1;
void pupAge(){

int age=2;
age=age+7;
System.out.println("1-puppy age is: " +age);

}

public static void main(String args[]){

int age=3;
TestLocal test= new TestLocal();
test.pupAge();

System.out.println("age is: " +test.age); //if attached referene it will access global variable
System.out.println("age is: " +age);
}
}